# SeleniumDemo
Selenium demo is a project that is dedicated to demostrate continuous integration testing with using
- Build Automation Tools: Apache ANT and Apache Maven<br/>
- Test Driven Development (TDD): Junit and TestNG<br/>
- Behavioural Driven Development (BDD): Cucumber-JVM using Gherkins language and Junit Framework<br/>
<b>Note:</b> Gradle will be included in future releases.

# How are files being organized?
<b>SeleniumDemo</b><br/>
&nbsp;&nbsp;&nbsp;<b>src</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.automationframework<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.cucumbertestcases<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.junittestcases<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.pageobjects<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;test.java.testngtestcases<br/>
&nbsp;&nbsp;&nbsp;<b>lib</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;cucumber<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;junit<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;reportng<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;selenium-java<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;testng<br/>
&nbsp;&nbsp;&nbsp;<b>res</b><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;jquery<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;webdriver<br/>
&nbsp;&nbsp;&nbsp;Build-cucumber.xml<br/>
&nbsp;&nbsp;&nbsp;Build-junit.xml<br/>
&nbsp;&nbsp;&nbsp;Build-testng.xml<br/>
&nbsp;&nbsp;&nbsp;build.properties<br/>
&nbsp;&nbsp;&nbsp;pom-cucumber.xml<br/>
&nbsp;&nbsp;&nbsp;pom-junit.xml<br/>
&nbsp;&nbsp;&nbsp;pom-testng.xml<p>

<b>Automation Framework</b><br/>
All automation related classes are located in test.java.automationframework package. Future releases of DAO factory library will be created in this package to access database, read excel/CSV/JSON files.<p/>

<b>Object Repository</b><br/>
The Page Objects are located in test.java.pageobjects package.<p/>

<b>Test Suite</b><br/>
For Junit/TestNG/Cucumber test cases, they are located in test.java.<cucumber/junit/testng>testcases package.<p/>

<b>Build Scripts</b><br/>
The build scripts come in 2 flavours, ANT or MAVEN. Please install ANT or MAVEN in your deployment machine before running the scripts.<br/>
- For ANT scripts, they are name as build-<cucumber/junit/testng>.xml. The lib folder housed dependency libraries for the ANT script.<br/>
- For MAVEN scripts, they are name as pom-<cucumber/junit/testng>.xml. The depencency libaries are housed in the user's .M2 folder.<br/>

<b>Resource Folder</b><br/>
The res folder contains 2 other sub folders,<br/>
- jquery folder which is meant for beautifying the TestNG's report using ReportNG and lightbox JS.
- webdriver folder contains web drivers for different web browsers. They are generally used by Selenium library to interface between the actual browser.

# Deploying Build Scripts in Jenkins
Make sure that the appropriate properties are amended accordingly in the build.properties file, depending on the location of your Jenkins workspace.<br/>
<b>Source Code Management</b><br/>
Under the Source Code Management tab > Repositories, enter the <a href ="https://github.com/weilianlow/SeleniumDemo.git">Project url</a><br/>
<b>Build</b><br/>
- For ANT Scripts, click on Add build step button, and select the option 'Invoke Ant'. Enter the Build File name in the Build File textbox.
- For MAVEN Scripts, click on Add build step button, and select the option 'Execute Windows batch command'. Enter the following command 'mvn clean test -Dmaven.source=pom-<cucumber/junit/testng>.xml' in the Command textbox.
