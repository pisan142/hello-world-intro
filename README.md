# hello-world-intro
<br>
<!--
## Steps to download and work on the assignment
1. Download the .zip files by clicking on "Download ZIP"
![image](https://user-images.githubusercontent.com/54456351/120839210-86ba1e80-c51d-11eb-9dda-f63d612fa81a.png)
2. Click on "New" button on the top of the screen to create new respository
![image](https://user-images.githubusercontent.com/54456351/120839337-a9e4ce00-c51d-11eb-80fd-7ff96468484b.png)
3. Enter the "Repository name" (It can be any name you like) and click on "Create repository"
![image](https://user-images.githubusercontent.com/54456351/120839416-c2ed7f00-c51d-11eb-8ba6-9388a18f1956.png)
4. Click on "upload an exsiting file" to choose the .zip file you just download in Step 1 and click on "Commit changes" to submit
![image](https://user-images.githubusercontent.com/54456351/120839798-3abba980-c51e-11eb-9335-363b462bc32c.png)
- You can also upload the .zip file via "Upload files"
![image](https://user-images.githubusercontent.com/54456351/120840726-730fb780-c51f-11eb-843b-d8894afa67a0.png)
5. Work on the .java file and until you complete
-->
This is your first assignment in GitHub Classroom.

If you have not already, create a directory where you will store all your files for this course. Make sure your directory name or your file names don't have any spaces in them as 'spaces' can interfere with some command-line programs.

    - (Windows sample directory) C:\Users\pisan\2021AU\142\assignment1
    - (Mac Sample directory) /Users/pisan/2021AU/142/assignment1

1. Click on "Main.java" to see what is provided as your starter code
2. Copy the template into your Main.java file in your Java IDE (Repl.It, BlueJ, Eclipse, IntelliJ, jGRASP, etc.) and make your desired edits
    - The name of the Class you are creating **must be** Main
    - The name of the file you create **must be** Main.java
    - You can delete all the code provided by you IDE and just copy the code that you got from Main.java file from GitHub
    - By default, BlueJ uses 4 spaces for indentation. The [Google Style Guide](https://google.github.io/styleguide/javaguide.html#s4.2-block-indentation) recommends 2 spaces, so we will use 2-spaces for indentation. To change BlueJ's default indentation level see the video at https://www.youtube.com/watch?v=FuaL1b8MQHg
    - Once you have your indentation level configured properly on BlueJ, use Edit > Auto-Layout to indent your code with 2-spaces.
4. Save your file in your IDE to your local computer and then locate the file and **Upload** your code by clicking the "Add File" button. You can also upload your file using drag-and-drop. **Commit changes** on your browser.
5. Check for test results, errors, and suggestions in "Actions" tab in your browser ![image](https://user-images.githubusercontent.com/54456351/122830040-a0d55a00-d29c-11eb-8e7f-a73c1a56546d.png)
6. Repeat step 3 and 4 until the assignment is completed and all tests are passed and all code style suggestions are implemented. There are four methods that you have to modify

    - `printHello` where the output should read ""Hello, CSS 142 Student!"
    - `printStarPiramid` where the output should be a pyramid as below
<pre>
    *
   ***
  *****
 *******
*********
</pre>
.
-  `printFace` where the output should be an ASCII face as below
<pre>
 +"""""+
[| o o |]
 |  ^  |
 | '-' |
 +-----+
 </pre>
.   
- `printLongSentence` where the long sentence needs to be fixed along with some variable names.

![image](https://user-images.githubusercontent.com/54456351/119812273-d3a65100-be9c-11eb-9c53-326b5fc460c3.png)

When committing, GitHub will ask you to enter a commit message. It helps to easily understand why a change has been made to a file at a particular time and distinguish between each commission.<br>
![image](https://user-images.githubusercontent.com/54456351/119812799-66df8680-be9d-11eb-8fec-24645619be13.png)
<br>

<hr>

The rest of the README file explains additional concepts about how Actions work.

<hr>

## Action
Once you're ready to test them, edit the template files and they will be tested using GitHub Actions. 

You'll get 3 kinds of feedback:

1. Checkstyle feedback on code style mistakes in the Google Java Style
2. Misspell report on detected misspellings in your code and comments
3. Unit tests by JUnit, testing if your functions are performing as expected

This is the action page: <br>
![image](https://user-images.githubusercontent.com/54456351/119814197-fc2f4a80-be9e-11eb-86ad-00f6c5b5d238.png) <br>
The workflow are your commissions from newest to latest. <br>
Click on the one that you want to see the report. <br><br>
The yellow circle means the workflow is in progress, and you have to wait until it changes the status.<br>
![image](https://user-images.githubusercontent.com/54456351/119813577-51b72780-be9e-11eb-8449-c84e2850f125.png) <br><br>

The red circle means the workflow is failed. You can see your details in the reports inside it.<br>
![image](https://user-images.githubusercontent.com/54456351/119813655-65628e00-be9e-11eb-8c27-8b42a9e71304.png) <br><br>

The green circle means the workflow is passed, but you should check the reports to check your code style is good enough and any misspell occurs.<br>
![image](https://user-images.githubusercontent.com/54456351/119813818-95119600-be9e-11eb-82e5-d247541062cb.png) <br><br>

## CheckStyle
Click on the left sidebar on "checkstyle" to view the Checkstyle report. <br>
![image](https://user-images.githubusercontent.com/54456351/129306692-6959b6b7-308c-452e-aa44-64fd21ee95de.png) <br>
If you have any compilation errors, CheckStyle report will not be generated. Please view the JUnit Report and debug all errors first.

### For more detatils on the CheckStyle warning, you can view this website:  <a href="https://pisana.github.io/checkstyle-webpage/">checkstyle-webpage</a>
### If you don't see your warnings on the website, please fill this survey so that we can add them: <a href="https://docs.google.com/forms/d/e/1FAIpQLSf1M4lW8zU0gfX2b0JHl3O0-vluhYhtCcvS2Ox0z3LDCwWEHg/viewform">New CheckStyle Warning</a> 

## Misspell
Click "misspell" to view found mispellings.
![image](https://user-images.githubusercontent.com/54456351/129307048-27f9297e-b80c-4e16-b430-9923917aa2a3.png)

## JUnit Report
Scroll to the bottom and download the artifact to view your detailed test report. <br>
Click "Compile-Run-Report" to download the report. 
It is a zipped folder that will contain a test report and/or a build message file.  

![image](https://user-images.githubusercontent.com/54456351/129307490-b6f27859-9ea2-4b68-8712-9b211b827322.png) <br>

You will get the following information in report.txt:
1. Compilation status to check for compilation errors
2. Total score of the your current work
3. Failed/Passed test cases with hints

## What my report.txt is very short with no score? 
This means that there was an error when trying to run tests on your program. Your report.txt file may show some error messages 
that were produced when trying to run our tests. Check to see if your code compiles in your IDE or on the commandline before reuploading.
For more clues to the issue, look in the build.txt file in the zipped folder. 

## What if there's no error messages in my report.txt?
Look in the build.txt file to see build and compilation errors. Some programs can compile but fail to run in unit testing. 
It may be failing due to tests being run on parts of the program that you have not implemented yet. 
