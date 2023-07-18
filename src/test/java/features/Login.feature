Feature: Application Login

  Scenario:
    Given User open browser and access to facebook
    When User input phone number and password
    And User click Login
    Then  Verify User can access to facebook newfeeds successfully
