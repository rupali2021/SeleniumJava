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
      "name": "@Regression"
    },
    {
      "line": 4,
      "name": "@Sanity"
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
  "duration": 9895917006,
  "status": "passed"
});
formatter.match({
  "location": "TC01.user_looks_for_accessories_in_products_services_menu()"
});
formatter.result({
  "duration": 6579064277,
  "status": "passed"
});
formatter.match({
  "location": "TC01.user_filters_accessories_by_filter_By_Brands_and_Sort_By()"
});
formatter.result({
  "duration": 1551535409,
  "status": "passed"
});
formatter.match({
  "location": "TC01.user_is_displayed_with_minimum_three_Accessorries()"
});
formatter.result({
  "duration": 196439948,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User can add Broadband plan in shopping cart and do checkout",
  "description": "",
  "id": "verify-user-is-able-to-retrieve-accessories-after-applying-filters-on-accessories-page;user-can-add-broadband-plan-in-shopping-cart-and-do-checkout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Userb is at eshop Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User looks for Broadband plan in Boardband menu",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Selects 1 Gbps fibre plan",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Enters postal code, floor No and unit No for New fibre Broadband Plan",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Check fibre availbility for new plan",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Enters new number for fibre plan",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User is displayed with plan details and Total in shopping card",
  "keyword": "Then "
});
formatter.match({
  "location": "TC02.userb_is_at_eshop_Home_page()"
});
formatter.result({
  "duration": 5902828998,
  "status": "passed"
});
formatter.match({
  "location": "TC02.user_looks_for_Broadband_plan_in_Boardband_menu()"
});
formatter.result({
  "duration": 4811393917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    }
  ],
  "location": "TC02.selects_Gbps_fibre_plan(int)"
});
formatter.result({
  "duration": 10761270353,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//div[@class\u003d\u0027section-header title\u0027][text()\u003d\u0027I want a new Fibre Broadband plan\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Yuvens-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:104d:27a:fa24:6c99%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002714.0.1\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat pageObjectFiles.NewPlanOrCustomer.getNewFibreBand(NewPlanOrCustomer.java:17)\n\tat stepDefinitions.TC02.selects_Gbps_fibre_plan(TC02.java:67)\n\tat ✽.And Selects 1 Gbps fibre plan(eShop.feature:16)\n",
  "status": "failed"
});
formatter.match({
  "location": "TC02.enters_postal_code_floor_No_and_unit_No_for_New_fibre_Broadband_Plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC02.check_fibre_availbility_for_new_plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC02.enters_new_number_for_fibre_plan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC02.user_is_displayed_with_plan_details_and_Total_in_shopping_card()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 25,
  "name": "User can add TV plan in shopping cart and  do checkout",
  "description": "",
  "id": "verify-user-is-able-to-retrieve-accessories-after-applying-filters-on-accessories-page;user-can-add-tv-plan-in-shopping-cart-and--do-checkout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "Userc is at eshop Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User looks for packs in TV menu",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Select new packs",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Enters postal code, floor No and unit No for New customer",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Check fibre availbility for new customer",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "new user is displayed with plan details and Total in shopping card",
  "keyword": "Then "
});
formatter.match({
  "location": "TC03.userc_is_at_eshop_Home_page()"
});
formatter.result({
  "duration": 5879738270,
  "status": "passed"
});
formatter.match({
  "location": "TC03.user_looks_for_packs_in_TV_menu()"
});
formatter.result({
  "duration": 5479143511,
  "status": "passed"
});
formatter.match({
  "location": "TC03.select_new_packs()"
});
formatter.result({
  "duration": 8559886830,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//div[@class\u003d\u0027section-header title\u0027 and text()\u003d\u0027I am a New Customer\u0027]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Yuvens-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:104d:27a:fa24:6c99%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002714.0.1\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat pageObjectFiles.NewPlanOrCustomer.getNewCustomer(NewPlanOrCustomer.java:21)\n\tat stepDefinitions.TC03.select_new_packs(TC03.java:62)\n\tat ✽.And Select new packs(eShop.feature:28)\n",
  "status": "failed"
});
formatter.match({
  "location": "TC03.enters_postal_code_floor_No_and_unit_No_for_New_customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC03.check_fibre_availbility_for_new_customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TC03.new_user_is_displayed_with_plan_details_and_Total_in_shopping_card()"
});
formatter.result({
  "status": "skipped"
});
});