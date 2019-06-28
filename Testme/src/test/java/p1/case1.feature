
@App
Feature: App Registration
  I want to use this template for my feature file

  @Testme
  Scenario: Registration Success
    Given user click the signup button
    When registration page is displayed
    And user enter the UserName "Ushadev"
    And enter the First Name "sanjeevi"
    And Enter the Last Name"sanjeevi"
    And Enter password is "Meena123"
    And Again enter the Confirm password "Meena123"
    And click the Gender "Female"
    And enter the Email address "priya123@gmail.com"
    And enter the mobile number "9876543210"
    And select the dateofbirth in calender "01/05/1999"
    And enter the Addres "no.19,3rd street vallalar nagar perumbakkam"
    And Select the security Question combobox "411011"
    And enter the security Question Answer "red"
    Then click on register button