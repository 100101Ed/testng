--
# Basic Project
Basic Java Maven Project Struture

## helpfull links

* [SQA] (hhttp://www.sqa.org/)
* [Overview for github] (http://rogerdudler.github.io/git-guide/)
* [MarkDown syntax] (https://confluence.atlassian.com/bitbucketserver/markdown-syntax-guide-776639995.html)

## How to create an up strim
* Create project at github without initialize the project
* Create a project at your local repository
  * Follow the instructions from github 
   * git init ;Will create the init file
   * git remote add origin https://github.com/100101Ed/basic-project.git
   * Touch filename
   * git add filename 
   * git commit -m "why your moving the files up present something"
   * git status ;what is pending on stage to be pushed and what has change
   * git push -u origin master ;pushes to github repository (URL)
   
 ## How to clone a project
 
#### README Contents
* Initializing a project
 * Create a repository at GitHub and make sure to select readme.md and .gitignore so that they are created
  * Copy the Url for this repository
 * Create a repository at your local drive
 * Clone the repository from GitHub at your local Drive by navigating to the directory at your drive and running bash (Shift+righ clik) or run cmd.exe.  Make sure github software is installed. 
  * git clone URL from hit hub.
 * Update the readme file and .gitignore
  * git add . 
   * will add all files
  * git commit -m "will push all files into staging and comment added"
  * git push 
   * will push all files that are in stating (have been commited) to GitHub repository.