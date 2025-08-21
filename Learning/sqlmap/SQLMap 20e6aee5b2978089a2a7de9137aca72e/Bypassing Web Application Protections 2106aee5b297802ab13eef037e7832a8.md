# Bypassing Web Application Protections

### Anti CSRF Token bypass

- Cross Site Request Forgery token incorporated in HTTP requests is used by web application as first line of defense against the usage of automation tools by checking if the csrf tokens of all the HTTP requests are same or not
- to bypass this anti csrf we need to just specify the parameter containing csrf token in request and sqlmap will automatically put values to bypass protection
- `--csrf-token token_parameter` : token parameter contains the csrf token in HTTP request

### Unique value bypass

- in some cases, web application will require to only provide unique values provided inside pre defined parameters
- this can easily bypass as it just requires that parameter to provide unique value with every attempt
- `--randomize=parameter` : parameter where unique value to be placed

### Calculated Parameter bypass

- 

### IP address concealing

- `--proxy=”socks4://139.23.132.33”`  : to send request through proxy
- `--proxy-file=proxyfiles.txt` : to provide a proxy file
- `--tor` : to use tor

### WAF bypass

- whenever we run scan on sqlmap, as a part of initial tests, sqlmap sends a predefined malicious looking payload using a non-existent parameter name to test for the existence of WAF
- so sqlmap does all WAF  scanning on its own but incase we want to skip it to produce less noise
- `--skip-waf` : to skip scan for WAF by sqlmap

### User-Agent blacklisting bypass

- in some cases, some websites blacklist some user agents like `UserAgent:sqlmap/1.4.9`
- `--random-agent` : to change the default user agent with random user agent with random value

### Tamper scripts

- tamper scripts are special kind of scripts written in python to modify requests just before they are sent to server to bypass some kind of protection
- there are various kinds of tamper scripts like those which can replace some special character like <,> etc, base64 encrypting script, replacing instances of union, etc
- `--tamper=tamper_script,tamper_script2` : google tamper scripts to use for specific tasks, multiple tamper scripts can be used

### **Miscellaneous Bypasses**

- Two types of miscellaneous bypasses:
    - `--chunked` : chunked transfer encoding is used to split the post request body into smaller chunks so that black listed sql keywords are split between chunks in a way such that the request containing them can pass unnoticed.
    - `HTTP parameter pollution` (`HPP`), where payloads are split in a similar way as in case of `--chunked` between different same parameter named values (e.g. `?id=1&id=UNION&id=SELECT&id=username,password&id=FROM&id=users...`), which are concatenated by the target platform if supporting it (e.g. `ASP`).