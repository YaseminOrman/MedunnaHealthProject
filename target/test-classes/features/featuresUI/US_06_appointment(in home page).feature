@Appointment_Feature
Feature: Appointment Feature

  Background:
    Given user navigate to "https://www.medunna.com/" page5

  @TC_01A
  Scenario: TC_01 Verify making an appointment with any chars in firstname input
    When user click on make an appointment button5
    When user enter firstname that contains any chars5
    And user enter  registered lastname5
    And user enter registered SSN id5
    And user enter registered email address5
    And user enter valid phone number5
    And user click on Send and Appointment Request Button5
    Then Verify Appointment registration saved message is displayed on the page5
    Then close the application5

  @TC_02A
  Scenario: TC_02 Verify making an appointment with any chars in lastname input
    When user click on make an appointment button5
    When user enter registered firstname5
    And user enter lastname that contains any chars5
    And user enter registered SSN id5
    And user enter registered email address5
    And user enter valid phone number5
    And user click on Send and Appointment Request Button5
    Then Verify Appointment registration saved message is displayed on the page5
    Then close the application5

  @TC_03A
  Scenario: TC_03 Verify that firstname input should not be blank
    When user click on make an appointment button5
    When user enter  registered lastname5
    And user enter registered SSN id5
    And user enter registered email address5
    And user enter valid phone number5
    And user click on Send and Appointment Request Button5
    Then Verify your firstname is required message is pop up on the page5
    Then close the application5

  @TC_04A
  Scenario: TC_04 Verify that lastname input should not be blank
    When user click on make an appointment button5
    When user enter registered firstname5
    And user enter registered SSN id5
    And user enter registered email address5
    And user enter valid phone number5
    And user click on Send and Appointment Request Button5
    Then Verify your lastname is required message is pop up on the page5
    Then close the application5

  @TC_05A
  Scenario: TC_05 Verify that user can make an appointment with registered SSN id
    When user click on make an appointment button5
    When user enter registered firstname5
    And user enter  registered lastname5
    And user enter registered SSN id5
    And user enter registered email address5
    And user enter valid phone number5
    And user click on Send and Appointment Request Button5
    And Verify Appointment registration saved message is displayed on the page5
    Then close the application5

  @TC_06A
  Scenario: TC_06 Verify that user can not make an appointment with different than registered SSN id
    When user click on make an appointment button5
    When user enter registered firstname5
    And user enter  registered lastname5
    And user enter different SSN id5
    And user enter registered email address5
    And user enter valid phone number5
    And user click on Send and Appointment Request Button5
    And Verify Email is already in use message is displayed on the page5
    Then close the application5

  @TC_07A
  Scenario: TC_07 Verify that SSN id input should not be blank
    When user click on make an appointment button5
    When user enter registered firstname5
    And user enter  registered lastname5
    And user enter registered email address5
    And user enter valid phone number5
    And user click on Send and Appointment Request Button5
    Then Verify your SSN is required message is pop up on the page5
    Then close the application5

  @TC_08A
  Scenario: TC_08 Verify that email input should not be blank
    When user click on make an appointment button5
    When user enter registered firstname5
    And user enter  registered lastname5
    And user enter registered SSN id5
    And user enter valid phone number5
    And user click on Send and Appointment Request Button5
    Then Verify your email is required message is pop up on the page5
    Then close the application5

  @TC_09A
  Scenario: TC_09 Verify that user can not make an appointment with invalid email
    When user click on make an appointment button5
    When user enter registered firstname5
    And user enter  registered lastname5
    And user enter registered SSN id5
    And user enter invalid email address5
    And user enter valid phone number5
    And user click on Send and Appointment Request Button5
    And Verify This field is invalid message is pop up on the page5
    Then close the application5

  @TC_10A
  Scenario: TC_10 Verify that user can not make an appointment with invalid phone number
    When user click on make an appointment button5
    When user enter registered firstname5
    And user enter  registered lastname5
    And user enter registered SSN id5
    And user enter registered email address5
    And user enter invalid phone number5
    And user click on Send and Appointment Request Button5
    And Verify Phone number is invalid message is pop up on the page5
    Then close the application5

  @TC_11A
  Scenario: TC_11 Verify that phone number input should not be blank
    When user click on make an appointment button5
    When user enter registered firstname5
    And user enter  registered lastname5
    And user enter registered SSN id5
    And user enter registered email address5
    And user click on Send and Appointment Request Button5
    Then Verify Phone number is required message is pop up on the page5
    Then close the application5
  @TC_12A
   Scenario: Tc_12 Verify patient's information saved when user making appointment
    When staff click on user icon optionYA
    And staff click on sign in optionYA
    And staff enter registered usernameYA
    And staff enter registered passwordYA
    And staff click on Sign in submit buttonYA
    And staff click on MY PAGES on menuYA
    And staff click on Search Patient from dropdownYA
    And staff enter patient registered SSN in in the search boxYA
    Then Verify patient information appears on the pageYA
    Then close the application5



