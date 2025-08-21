# Undo commits

useful and dangerous at the same time doing commits undo

### Git commands to undo:

- `git revert commitid`
    - it will ***undo a commit by creating a new commit that reverses the changes***
    - it doesn’t deletes history and keeps everything untraceable
- `git reset -soft commitd`
    - it ***deletes all the commits above it***
    - moves branch pointer (head) backwards to the given commit id by erasing the above commits
        - `--soft`  :  moves head back but keeps changes staged
        - `--mixed` : moves head back but keeps changes unstaged
        - `--hard` : moves head back but deletes changes
- `git commit -amend -m “message amended”`
    - this will ***amend the most recent commit (head)***
    - always remember to amend only the commits which aren’t yet pushed