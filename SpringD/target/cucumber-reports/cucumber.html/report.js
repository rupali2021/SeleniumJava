$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("eShop.feature");
formatter.feature({
  "line": 1,
  "name": "Verify user is able to retrieve accessories after applying filters on Accessories page",
  "description": "",
  "id": "verify-user-is-able-to-retrieve-accessories-after-applying-filters-on-accessories-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Retrieval of accessories",
  "description": "",
  "id": "verify-user-is-able-to-retrieve-accessories-after-applying-filters-on-accessories-page;retrieval-of-accessories",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Usera is at eshop Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User looks for accessories in products \u0026 services menu",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User filters accessories by filter By, Brands and Sort By",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is displayed with minimum three Accessorries",
  "keyword": "Then "
});
formatter.match({
  "location": "TC01.usera_is_at_eshop_Home_page()"
});
formatter.result({
  "duration": 4109381544,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d89.0.4389.72)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Yuvens-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:1c4a:d437:f462:b808%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.72, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: /var/folders/wb/mc34wf2n5t5...}, goog:chromeOptions: {debuggerAddress: localhost:53219}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: eb3bf45f624c9fc255533e9e9fb4070f\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteWindow.maximize(RemoteWebDriver.java:837)\n\tat resources.base.InitialiseDriver(base.java:52)\n\tat stepDefinitions.TC01.usera_is_at_eshop_Home_page(TC01.java:24)\n\tat ✽.Given Usera is at eshop Home page(eShop.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "location": "TC01.user_looks_for_accessories_in_products_services_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC01.user_filters_accessories_by_filter_By_Brands_and_Sort_By()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC01.user_is_displayed_with_minimum_three_Accessorries()"
});
formatter.result({
  "status": "skipped"
});
});