$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/samplefolder/scenario4.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Displays hello message",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "displaying hello message",
  "keyword": "Given "
});
formatter.match({
  "location": "Sam4Class.displaying_hello_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Searching for flight",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "user searches for the particular flight",
  "keyword": "Given "
});
formatter.match({
  "location": "Sam4Class.user_searches_for_the_particular_flight()"
});
formatter.result({
  "status": "passed"
});
});