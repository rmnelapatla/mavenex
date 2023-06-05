Feature: All type of loans validation

  Background: for very scenario
    Given open the browser and login as end user
    When I Validate landing page of user login
    Then I Click on verify the balance


  Scenario: signle test


  Scenario Outline:  Validate differ validation for registration page
    Given As user I Open chrome browser
    And I enter demo web page url "http://demowebshop.com"
    And I Click on register link
    When I validate Register page
    And Select geneder "<testdescription>" "<gender>"
    And I endter firstname "<fname>"
    And I enter lastname "<lname>"
    And I enter email "<emailid>"


    Examples:
      | testdescription                        | gender | fname   | lname  | emailid        |
      | All valid data                         | Male   | Ramana  | murthy | rama@yahoo.com |
      | No match Password with confirmpassword | Female | Krishna | murthy | llkk@123,com   |
      | wrong emil id                          | Male   | Jack    | jill   | poiu@123.com   |
      | Existing email id                      | Female | zack    | lily   | Abcd@gamil.com |


