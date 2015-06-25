# language:en
@registration
Feature: registration user
  	In order to complete registration
  	As administrator
  	I want to registering a user in the system

  Background: Access the registration form
    Given the administrator is logged in

  @basicRegistration
  Scenario: Performs registration form
    When insert a name
    And insert a login
    And insert a password
    When insert a email
    And insert a main adress
    And insert a reference address
    And select an academic background
    And select a course of interest
    And save the form
    Then the system informs the administrator of successfully register.
