$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/registrationform/RegistrationForm.feature");
formatter.feature({
  "line": 2,
  "name": "registration user",
  "description": "\tIn order to complete registration\n\tAs administrator\r\n\tI want to registering a user in the system",
  "id": "registration-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@registration"
    }
  ]
});
formatter.background({
  "line": 7,
  "name": "Access the registration form",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "the administrator is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterFieldsSteps.the_administrator_is_logged_in()"
});
formatter.result({
  "duration": 3993666301,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Performs registration form",
  "description": "",
  "id": "registration-user;performs-registration-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@basicRegistration"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "insert a name",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "insert a login",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "insert a password",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "insert a email",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "insert a main adress",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "insert a reference address",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select an academic background",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select a course of interest",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "save the form",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "the system informs the administrator of successfully register.",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_name()"
});
formatter.result({
  "duration": 400018813,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_login()"
});
formatter.result({
  "duration": 400270156,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_password()"
});
formatter.result({
  "duration": 404273845,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_email()"
});
formatter.result({
  "duration": 399361939,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_main_adress()"
});
formatter.result({
  "duration": 483752814,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.insert_a_reference_address()"
});
formatter.result({
  "duration": 570218709,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.select_an_academic_background()"
});
formatter.result({
  "duration": 164349044,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.select_a_course_of_interest()"
});
formatter.result({
  "duration": 311579922,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.save_the_form()"
});
formatter.result({
  "duration": 183106511,
  "status": "passed"
});
formatter.match({
  "location": "RegisterFieldsSteps.the_system_informs_the_administrator_of_successfully_register()"
});
formatter.result({
  "duration": 160843746,
  "status": "passed"
});
formatter.after({
  "duration": 170517688,
  "status": "passed"
});
});