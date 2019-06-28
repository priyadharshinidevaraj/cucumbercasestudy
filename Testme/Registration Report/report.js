$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:p1/case1.feature");
formatter.feature({
  "name": "App Registration",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@App"
    }
  ]
});
formatter.scenario({
  "name": "Registration Success",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@App"
    },
    {
      "name": "@Testme"
    }
  ]
});
formatter.step({
  "name": "user click the signup button",
  "keyword": "Given "
});
formatter.match({
  "location": "Case1step.user_click_the_signup_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d75.0.3770.100)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027CDC2-D-45Z5N62\u0027, ip: \u002710.237.54.195\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\TRAINI~1.05\\AppDat...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51077}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.100, webStorageEnabled: true}\nSession ID: 0354a387ee449dee134fc92930483e54\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat p1.Case1step.user_click_the_signup_button(Case1step.java:22)\r\n\tat ✽.user click the signup button(classpath:p1/case1.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "registration page is displayed",
  "keyword": "When "
});
formatter.match({
  "location": "Case1step.registration_page_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the UserName \"Ushadev\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.user_enter_the_UserName(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter the First Name \"sanjeevi\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.enter_the_First_Name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter the Last Name\"sanjeevi\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.enter_the_Last_Name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter password is \"Meena123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.enter_password_is(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Again enter the Confirm password \"Meena123\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.again_the_Confirm_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click the Gender \"Female\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.click_the_Gender(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter the Email address \"priya123@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.enter_the_Email_address_priya_gmail_com(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter the mobile number \"9876543210\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.enter_the_mobile_number(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select the dateofbirth in calender \"01/05/1999\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.select_the_dateofbirth_in_calender(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter the Addres \"no.19,3rd street vallalar nagar perumbakkam\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.enter_the_Addres(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select the security Question combobox \"411011\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.select_the_security_Question_combobox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter the security Question Answer \"red\"",
  "keyword": "And "
});
formatter.match({
  "location": "Case1step.enter_the_security_Question_Answer(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on register button",
  "keyword": "Then "
});
formatter.match({
  "location": "Case1step.click_on_register_button()"
});
formatter.result({
  "status": "skipped"
});
});