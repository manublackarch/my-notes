# Lifecycle of a change in repo

- **what is a commit?**
    - a commit is simply like saving a version of our project on which we can come back again
    - it is stored in `.git` directory
    - we add a message to it describing what is changed
    - every time we commit, git saves *what changed, when it changed, who made the changes, and a unique id for that change*

**Every time a change is made in a git repo, it moves through 3 key areas:**

1. **Working Directory (working tree)**
    - it is our ***actual project folder on our computer***
    - it is here where we *create files, edit existing files and delete files*
    - git compares working directory to the last commit to determine what changed
    - there are mainly two types of files:
        - **untracked** : git doesn’t know them yet
        - **modified** : git is tracking them, but they’ve changed since the last commit
2. **Staging area (Index)**
    - it’s a ***temporary area where we list the changes that we want to include in our next commit***
    - kinda preview of the commit
    - it helps us to control what gets committed and what doesn’t
3. **Local repository (Git Directory)** 
    - when we run `git commit` , git takes everything in the staging area and ***saves it as a snapshot in the local repository (that `.git/` dir)***
    - the commit is then saved as an object in git’s database (inside `.git/objects/`)
    - it contains a unique SHA-1 hash, author info, timestamp, commit message, pointers to previous commits
    - once committed, the change is safely tracked in our version history