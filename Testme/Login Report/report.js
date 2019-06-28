$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:p2/2case.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login successful",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "User click on signin Button",
  "keyword": "Given "
});
formatter.match({
  "location": "Case2step.user_click_on_signin_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to enter credantials",
  "rows": [
    {
      "cells": [
        "name",
        "password"
      ]
    },
    {
      "cells": [
        "lalitha",
        "password123"
      ]
    },
    {
      "cells": [
        "Meenakshi",
        "Meena123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Case2step.i_want_to_enter_credantials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am login succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Case2step.i_am_login_succesfully()"
});
formatter.result({
  "status": "passed"
});
});