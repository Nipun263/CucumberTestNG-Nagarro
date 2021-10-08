Feature: UserRegistraion


Scenario: Validate New user is able to login_First
    Given User wants to land on homePage
    When User Passes the userCredentials
    Then user shoudl be able to see the landing page
    And User should be able to pass the credentials to complete Registration
      | Tester-FirstName | Tester-LastName | testing@dev.com | 998829299991 |
