$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/base.feature");
formatter.feature({
  "name": "verifying the Details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying Adactin login with value with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the Adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter \"\u003cUserName\u003e\",\"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should Click Login",
  "keyword": "And "
});
formatter.step({
  "name": "user should select \"\u003cLocation\u003e\",\"\u003cHotel\u003e\",\"\u003cRoomType\u003e\",\"\u003cNoOfRoom\u003e\",\"\u003cChkIn\u003e\",\"\u003cChkOut\u003e\",\"\u003cAdltroom\u003e\",\"\u003cChildroom\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should slect btn",
  "keyword": "And "
});
formatter.step({
  "name": "user should seclt \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cAddress\u003e\",\"\u003cCardNo\u003e\",\"\u003cCardType\u003e\",\"\u003cExpryMnt\u003e\",\"\u003cExpyYr\u003e\",\"\u003cCardCvv\u003e\",",
  "keyword": "And "
});
formatter.step({
  "name": "user can get order Id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "Location",
        "Hotel",
        "RoomType",
        "NoOfRoom",
        "ChkIn",
        "ChkOut",
        "Adltroom",
        "Childroom",
        "FirstName",
        "LastName",
        "Address",
        "CardNo",
        "CardType",
        "ExpryMnt",
        "ExpyYr",
        "CardCvv"
      ]
    },
    {
      "cells": [
        "Mayilsamy",
        "U65Z7D",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "1 - One",
        "20/08/2021",
        "29/08/2021",
        "1 - One",
        "0 - None",
        "Boss",
        "S",
        "Omr Chennai",
        "15987532156487895",
        "VISA",
        "September",
        "2022",
        "452"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Adactin login with value with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the Adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsdefine.user_is_on_the_Adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"Mayilsamy\",\"U65Z7D\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepsdefine.user_should_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should Click Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepsdefine.user_should_Click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select \"Sydney\",\"Hotel Creek\",\"Standard\",\"1 - One\",\"20/08/2021\",\"29/08/2021\",\"1 - One\",\"0 - None\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepsdefine.user_should_select(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should slect btn",
  "keyword": "And "
});
formatter.match({
  "location": "stepsdefine.user_should_slect_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should seclt \"Boss\",\"S\",\"Omr Chennai\",\"15987532156487895\",\"VISA\",\"September\",\"2022\",\"452\",",
  "keyword": "And "
});
formatter.match({
  "location": "stepsdefine.user_should_seclt(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can get order Id",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});