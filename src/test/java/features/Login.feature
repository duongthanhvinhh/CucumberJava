Feature: Application Login
@Login
  Scenario Outline:
    Given User open browser and access to Rahulshetty page
    When User input username "<userName>" and password "<password>"
    And User click Login
    Then  Verify User can access to Rahulshetty newfeeds successfully
  Examples:
        |userName           |password     |
        |vinhd duong        |a1234        |
        |foden duong        |abcd1        |