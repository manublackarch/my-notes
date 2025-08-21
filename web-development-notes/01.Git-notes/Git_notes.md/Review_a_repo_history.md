# Review a repo history

### Git cmmnds to review git repository history:

- `git log`
    - it shows list of commits in reverse order (latest first)
    - each commit shows *commit hash (ID), author name and email, date and time and commit message*
    - basically used to show ***commit history of our current repo***
- `git log -p`
    - it shows the code change exact line by line made in each commit
    - it includes info from `git log` , plus the `diff` (code added/removed)
    - basically to ***audit code-level changes over time***
- `git log --stat`
    - it shows summary of changes per commit
    - number of insertions (+) or deletions (-) made in file
    - basically used to get ***a overview of what each commit touched***
- `git show commitid`
    - it shows the full details of a single commit
    - every detail of a single commit that includes metadata (author name, date, message)
    - file changes made (diff), code modifications (patch)
    - basically used when we want ***to inspect a single commit in depth***