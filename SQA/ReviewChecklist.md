# Review Checklist

A code review is the process where programmers review the code of their peers. 
It allows porgrammers to share knowledge with one other while also checking for potential bugs and helping with estimations for the code quality. 
It helps with the acceleration and streamlining of the software development process.

Research by the Software Engineering Institute suggests that programmers make 15-20 common mistakes. 
By adding such mistakes to a checklist, you can make sure that you spot them whenever they occur and help drive them out over time.

A code reivew involes checking for things such as:
### General
* Does the code work? Does it perform its intended function, the logic is correct etc.
* Is all the code easily understood?
* Does it conform to your agreed coding conventions? These will usually cover location of braces, variable and function names, line length, indentations, formatting, and comments.
* Is there any redundant or duplicate code?

### Performance 
* Are there any obvious optimizations that will improve performance?
* Can any of the code be replaced with library or built-in functions?
* Can any logging or debugging code be removed?

### Security 
* Are invalid parameter values handled?
* Are output values checked and encoded?
* Are all data inputs checked (for the correct type, length, format, and range) and encoded?

### Testing
* Is the code testable? The code should be structured so that it doesn’t add too many or hide dependencies, is unable to initialize objects, test frameworks can use methods etc.
* Do tests exist, and are they comprehensive?
* Do unit tests actually test that the code is performing the intended functionality?


## My Checklist

### Pull Requests
* Naming of pull requests , clearly recognisable event or modifications
* Do not attempt to cover more than one issue in one PR
* If a PR has a modification or update made, ensure it is stated clearly