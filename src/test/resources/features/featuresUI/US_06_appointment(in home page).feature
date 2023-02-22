@Appointment_Feature
Feature: Appointment Feature

  Background:
    Given user navigate to "https://www.medunna.com/" page
    When user click on make an appointment button

  Scenario: TC_01 Make an appointment with any chars in firstname input
    When user enter firstname that contains any chars
    And user enter  registered lastname
    And user enter registered SSN id
    And user enter registered email address
    And user enter valid phone number
    And user click on 'Send and Appointment Request' Button
    Then Verify 'Appointment registration saved' message is displayed on the page
    Then close the application