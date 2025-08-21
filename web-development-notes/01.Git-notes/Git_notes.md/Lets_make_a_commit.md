# Lets make a commit

## Git cmmnds to make commit:

- `git add .`
    - this cmmnd is used ***to stage a file, sends file to staging area***
    - basically we say git that we want to be included in the next commit
    - dot (.) includes all the files in the repo, for specific file : `git add filename`
- `git commit -m “message to be added”`
    - commit is used to simply commit the file, that ***saving the version*** thing
    - `-m` flag is used to save message with certain commit
- `git diff`
    - it shows the exact difference between staging area and working dir
    - kind of shows the OR between commits
    - it ***shows the changes made to the file***
    - use before committing to review what’s changed
- `git push`
    - to simply ***uploaded the committed file to github repo***
- `git pull origin main`
    - ***downloads the latest changes from github repo into your local repo***
    - basically used before start working, especially working in a team
- `git restore filename`
    - its used ***to restore a file to the last commit***
    - basically when we made changes in a file that we don’t want, so we can go back to the last commit (head)
- `.gitignore` file
    - save a filename `.gitignore` ***any type file which we don’t want git to track***, we type it in it either its .extension or the filename we want to ignore
    - basically used to exclude files from git tracking
    - eg. `.gitignore   > *.js`    this will exclude .js files from git tracking