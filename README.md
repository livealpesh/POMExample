# POMExample
This is the Page Object Modal Example for https://demo.nopcommerce.com/
This POM have a just screenshort method including with only local various browser to perform.
I have just put a chromedriver,msEdge and mozila firefox exe. file for browser but I am only Implimented a chromedrive driver method in to the Driver Manager so you can only perfom automation in chrome browser.

Below notes sent by dharmeshbhai on dated 18/12/2022 for refrence and i keep in my masil as well alpesh*****12@*****.com




Page Object Model



Notes: 

1. Create all web application pages class in under org.example folder
2. Add maven dependency where required
3. Import class/interface/package where required



Page Object Model




1. Create Maven project with 1.8 JDK version and select quickstart maven archtypes
2. Delete App class (Main -> java -> org.example) and AppTest class (Test -> java ->
org.example)
3. Create BasePage class (Main) and add only protected static WebDriver driver
4. Create Utils class (Main) with extend to BasePage and create all reusable methods in it like
clickElement, typeText, timestamp, etc.
5. Create drivers folder (under Test -> java) and save all webdrivers .exe file in it
6. Create DriverManager class (Main) with extend to Utils and create openBrowser and
closeBrowser methods only
7. Create BaseTest class (test) with extend to Utils and create @AfterMethod and
@BeforeMethod in it (Make sure the maven dependancies from TestNG)
8. Create TestSuit class (test) with extend to BaseTest and create all test cases method with
@Test in it
9. Create screenshots folder (under src) and implement captureScreenshot method in Utils
class
10. To capture screenshot only when a test case fail, so in Base test class @AfterMethod before
closing browser we implement it there
11. Create TestConfig folder (under Test -> java) and create TestData.properties file in it
12. Create LoadProp class (Main) and implement getProperty method to get test data from
TestData.properties file
13. To run code LOCALLY Put if-else-if condition to implement multiple browsers according to
browser name updated in TestData.properties file
14. To run code in CLOUD (BrowserStak, SauceLab,etc) put if-else-if condition and get the code
from particular platform and update in open browser method






Hybrid Framework




Notes: 

1. Create all web application pages class in under org.example folder
2. Add maven dependency where required
3. Import class/interface/package where required


Hybrid Framework




1. Create Maven project with 1.8 JDK version and select quickstart maven archtypes
2. Delete App class (Main -> java -> org.example) and AppTest class (Test -> java ->
org.example)
3. Create BasePage class (Main) and add only protected static WebDriver driver
4. Create Utils class (Main) with extend to BasePage and create all reusable methods in it like
clickElement, typeText, timestamp, etc.
5. Create drivers folder (under Test -> java) and save all webdrivers .exe file in it
6. Create DriverManager class (Main) with extend to Utils and create openBrowser and
closeBrowser methods only
7. Create Hooks class (test) with extend to BasePage and create @After and @Before in it
(Make sure the maven dependancies from io.cucumber)
8. Create RunCuke class (test) and implement annotation for RunCuke class
9. To capture screenshot only when a test case fail, so in Base test class @After before closing
browser we implement it there
10. Create TestConfig folder (under Test -> java) and create TestData.properties file in it
11. Create LoadProp class (Main) and implement getProperty method to get test data from
TestData.properties file
12. To run code LOCALLY Put if-else-if condition to implement multiple browsers according to
browser name updated in TestData.properties file
13. To run code in CLOUD (BrowserStak, SauceLab,etc) put if-else-if condition and get the code
from particular platform and update in open browser method
