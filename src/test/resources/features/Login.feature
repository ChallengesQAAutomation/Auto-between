#author: Luis Carlos Marin Campos
Feature: Verification of Privacy Policy in Login

  Background:
    Given the user has entered their username and password

  @TC01
  Scenario: Successful login with acceptance of privacy policy
    And the user has selected the privacy policy checkbox
    When the user do login
    Then the system should allow the user to access successfully

  @TC02
  Scenario: Login without accepting the privacy policy
    And the user has not selected the privacy policy checkbox
    Then an error message indicating the requirement of accepting the privacy policy should be displayed

  @TC03
  Scenario: Change of privacy policy checkbox state
    And the user has initially selected the privacy policy checkbox
    When the user unchecks the privacy policy checkbox
    And an error message indicating the requirement of accepting the privacy policy should be displayed