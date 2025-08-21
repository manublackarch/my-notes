# Branching, Tagging, Merging, Stash

## Branching

- a ***branch is like a separate workspace, where we can work without affecting the main code***
- just like creating a copy of your project code before working on any new feature or a bug fix so that if the feature fails it won’t be affecting the main code, and if it succeeds then we can merge it with the main branch (main project code)
- and very helpful in the projects where multiple team members are working at the same time
- branch is a pointer to a commit in Git’s history, when a branch is created, Git creates a new pointer but doesn’t copy files

### Git commands for branching:

- default branch is **main** or **master**
- `git branch`
    - ***to check branches*** and the branch in which we are currently workin
- `git branch newbranchname`
    - to ***create a new branch***
- `git checkout newbranchname`
    - to ***switch to new branch*** we created
    - here we can continue to `git add .` , `git commit -m “message”` and it won’t affect the main git branch
- `git branch -b branchname`
    - kind of ***shortcut to make and switch branch in single cmmnd***
- `git branch -d branchname`
    - to ***delete the branch***

## Merging

- ***process of combining changes from another branch to single branch*** (like main branch)
- like merging feature branch to main branch, once the feature is ready
- git compares the common ancestor of two branches, then it applies the difference to the target branch
- if the same line of code (eg. 8th line of code) was changed in both branches, git throws a merge conflict and asks to solve the conflict manually

### Git commands for merging:

- firstly go to the main branch where you want to merge
- `git merge branchname`
    - it will ***merge the another branch to the current branch*** in which we are

## Tagging

- its like a ***label or milestone to specific commit***
- marks a specific commit is important like beta version release

### Git commands to tag:

- `git tag -a betaV1.0 commitid -m “my beta release”`
    - `-a` flag to ***write the tag name***
    - `commitid` the commit in which we want to add tag
    - `-m` flag to attach a message with tag
- `git tag -d betaV1.0`
    - to ***delete the tag***
    - like beta version updates to new commit, so you to delete the old beta tag

## Stash

- used as a ***temporary storage to store work of current directory***
- useful like when we need to switch branch, pull latest code, or the work ain’t yet completed so we don’t wanna commit the work yet, so we stash the work
- it temporarily hides(stashes) our work so we can come back later

### Git commands to stash:

- `git stash`
    - stashes only tracked files with uncommitted changes
    - saves them to a stack inside .git
    - restores working directory to a clean state
    - stash only affects modified tracked files and staged changes
- `git stash -list`
    - to check stashed items
- `git stash apply`
    - to ***unstash the git changes***
    - it will merge the stashed changes with the current dir
    - and if there are merge conflict, git will ask to resolve
    - and then move to staged area by : `git add .`