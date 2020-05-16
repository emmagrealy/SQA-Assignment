# Version Control

## What is it?
Version control enables multiple people to simultaneously work on a single project. 
Each person edits his or her own copy of the files and chooses when to share those changes with the rest of the team. 
Thus, temporary or partial edits by one person do not interfere with another person's work

## Why is it important?
Version control is important for documents that undergo a lot of revision and redrafting and is particularly important 
for electronic documents because they can easily be changed by a number of different users.


## How I use Version Control

I am using the gitflow process to manage the version control for this project. 
I decided to create branches when a new feature was being created and then I would merge the branches accordingly. 
I decided to create 4 main branches :

### Master
This branch is where my final project will be. It will contain all documentation and code, and there will be no changes made to this branch, 
only pull requests from the develop branch will be allowed.

### Dev
This branch is where my near final changes will be kept, it is the last step before my project can make it to master.
This branch will only takes pull requests from Development or Documentation.

### Development
This branch is where any final features to my actual code for this project will be.
This branch will only take pull requests from a branch with the following naming format <BRANCH_NAME-DEV>.
This is to indicate that it is a development feature being worked on within its own individual branch. 

### Documentation 
This branch is where any final features/sections to the documentation of the project will be.
This branch will only take pull requests from a branch that is about documentation. 
These branches will not follow the Devbranch naming format.


I will be creating additional branches to these four main branches to help focus on certain features of this project.
Each extra branch will be merged into either Documentation or Development, then to Dev and finally to Master when it is all completed.