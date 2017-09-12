# SeleniumDemo
SeleniumDemo is a project that is dedicated to demostrate continuous integration testing using
- <b>Build Automation Tools:</b> Apache ANT and Apache Maven<br/>
<b>Note:</b> Gradle will be included in future releases.<br/>
- <b>Test Driven Development (TDD):</b> Junit and TestNG<br/>
- <b>Behavioural Driven Development (BDD):</b> Cucumber-JVM using Gherkins language and Junit Framework<br/>

# How are files being organized?
<b>SeleniumDemo</b><br/>
&nbsp;&nbsp;&nbsp;<b>src</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.automationframework<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.cucumber.features<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.cucumber.steps<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.junittestcases<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.pageobjects<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.testngtestcases<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.resources.jquery<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.resources.webdriver<br/>
&nbsp;&nbsp;&nbsp;Build-cucumber.xml<br/>
&nbsp;&nbsp;&nbsp;Build-junit.xml<br/>
&nbsp;&nbsp;&nbsp;Build-testng.xml<br/>
&nbsp;&nbsp;&nbsp;build.properties<br/>
&nbsp;&nbsp;&nbsp;pom-cucumber.xml<br/>
&nbsp;&nbsp;&nbsp;pom-junit.xml<br/>
&nbsp;&nbsp;&nbsp;pom-testng.xml<p>

<b>Automation Framework</b><br/>
All automation related classes are located in <i>test.java.automationframework</i> package. <br/>
<b>Note:</b> Future releases of DAO factory library will be created in this package to access database, read excel/CSV/JSON files.<p/>

<b>Object Repository</b><br/>
The Page Objects are located in <i>test.java.pageobjects</i> package.<p/>

<b>Test Suite</b><br/>
For Junit/TestNG test cases, they are located in <i>test.java.<junit/testng>testcases</i> package.<br/>
For cucumber test cases, they are located in <i>test.java.cucumber.features</i> package.<p/>

<b>Build Scripts</b><br/>
The build scripts come in 2 flavours, ANT or MAVEN. Please install ANT or MAVEN in your deployment machine before running the scripts.<br/>
- For ANT scripts, they are named as <i>build-<cucumber/junit/testng>.xml</i>. The lib folder housed dependency libraries for the ANT script.<br/>
- For MAVEN scripts, they are named as <i>pom-<cucumber/junit/testng>.xml</i>. The depencency libaries are housed in the user's <i>.M2</i> folder.<p/>

<b>Resource Folder</b><br/>
The res folder contains 2 other sub folders,<br/>
- jquery folder contains neccessary files to enhance TestNG's report using ReportNG, jquery and lightbox JS.
- webdriver folder contains web drivers for different web browsers. They are generally used by Selenium library to interface between the actual browser.<p/>

# Deploying Build Scripts in Jenkins
Make sure that the appropriate properties are amended accordingly in the build.properties file, depending on the location of your Jenkins workspace.<p/>
<b>Source Code Management</b><br/>
Under the Source Code Management tab > Repositories, enter the <a href ="https://github.com/weilianlow/SeleniumDemo.git">Project url</a><p/>
<b>Build</b><br/>
- For ANT Scripts, click on Add build step button, and select the option <i>Invoke Ant</i>. Enter the following Build File name <i>build-<cucumber/junit/testng>.xml</i> in the Build File textbox.
- For MAVEN Scripts, click on Add build step button, and select the option <i>Execute Windows batch command</i>. Enter the following command <i>mvn clean test -Dmaven.source=pom-<cucumber/junit/testng>.xml</i> in the Command textbox.
