# Git

## Git vs Github

- **Github**
    - its a ***cloud-based hosting platform for Git repositories***
    - with this we can collaborate with others, manage projects, and even contribute to open source projects
    - it lets us upload our git tracked code online
    
- **Git**
    - a version control ***system that helps track changes in code*** overtime
    - with it we can go back to any previous version of our project
    - it’s a tool that works locally

## Git setup

- download and install git bash from there official website [Git - Downloads](https://git-scm.com/downloads)  and make a github account
- open git bash and configure your identity
- by this cmmnd we can setup name that will show up in our commits : `git config --global user.name "Your Name"`
- this cmmnd links our commits to our github account : `git config --global user.email "your@email.com"`
- to check our git settings like our entered username and email : `git config --list`
- use of `--global` means its applied to all our git projects, we just need to set it once

[Creating a Git repo](Git_notes.md/Creating_a_Git_repo.md)

[Lifecycle of a change in repo](Git_notes.md/Lifecycle_of_Change_in_repo.md)

[Review a repo history](Git_notes.md/Review_a_repo_history.md)

[Lets make a commit ](Git_notes.md/Lets_make_a_commit.md)

[Branching, Tagging, Merging, Stash](Git_notes.md/Branching,Merging,Taging,Stashing.md)

[Undo commits](Git_notes.md/Undo_commits.md)

## in the end:

- so in short ***to make and connect a github repository to git***
- simply ***make a repository of name of your project at github***, go in the project repo and copy the project repo link
- come to your local computer and clone the github repo : `git clone [https://github.com/manublackarch/Love-Babbar-web-development-course-.git](https://github.com/manublackarch/Love-Babbar-web-development-course-.git)`
- now change directory to the cloned repo on your local computer and run cmmnd : `git init`
- now create any directory or file which you want to upload to your code repo
- create a code file : `touch test.py`
- now to ***add this file to staging area*** : `git add .`  dot (.) basically adds all the files and dir and for single file we can add name of dir or file: `git add filename`
- now ***commit file to git dir and add a message*** : `git commit -m “message like filename updated”`
- now ***upload this file to github*** repository online : `git push`
- to ***track status of files*** like are the files moved to staged area or not : `git status`
- to check the commits : `git log`