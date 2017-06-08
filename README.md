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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;webdriver<br/>
&nbsp;&nbsp;&nbsp;Build-cucumber.xml<br/>
&nbsp;&nbsp;&nbsp;Build-junit.xml<br/>
&nbsp;&nbsp;&nbsp;Build-testng.xml<br/>
&nbsp;&nbsp;&nbsp;build.properties<br/>
&nbsp;&nbsp;&nbsp;pom-cucumber.xml<br/>
&nbsp;&nbsp;&nbsp;pom-junit.xml<br/>
&nbsp;&nbsp;&nbsp;pom-testng.xml<p>

<b>Automation Framework</b>
All automation related classes are located in test.java.automationframework package. Future releases of DAO factory library will be created in this package to access database, read excel/CSV/JSON files.<p/>

<b>Object Repository</b>
The Page Objects are located in test.java.pageobjects package.<p/>

<b>Test Suite</b>
For Junit/TestNG/Cucumber test cases, they are located in test.java.<cucumber/junit/testng>testcases package.<p/>

<b>Build Scripts</b>
The build scripts come in 2 flavours, ANT or MAVEN. Please install ANT or MAVEN in your deployment machine before running the scripts.<br/>
- For ANT scripts, they are name as build-<cucumber/junit/testng>.xml
- For MAVEN scripts, they are name as pom-<cucumber/junit/testng>.xml
