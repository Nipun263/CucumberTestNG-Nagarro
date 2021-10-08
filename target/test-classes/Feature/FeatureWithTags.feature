Feature: UserRegistraion

@Smoke
Scenario: Validate New user is able to login_First
    Given User wants to land on homePage
    When User Passes the userCredentials
    Then user shoudl be able to see the landing page
    And User should be able to pass the credentials to complete Registration
      | Tester-FirstName | Tester-LastName | testing@dev.com | 998829299991 |

@Progression   
Scenario: Validate New user is able to login_Second
    Given User wants to land on homePage
    When User Passes the userCredentials
    Then user shoudl be able to see the landing page
    And User should be able to pass the credentials to complete Registration
      | Tester-FirstName | Tester-LastName | testing@dev.com | 998829299991 |
      
      
@Regression    
Scenario: Validate New user is able to login_Third
    Given User wants to land on homePage
    When User Passes the userCredentials
    Then user shoudl be able to see the landing page
    And User should be able to pass the credentials to complete Registration
      | Tester-FirstName | Tester-LastName | testing@dev.com | 998829299991 |
      
      
@Smoke
Scenario: Validate New user is able to login_Forth
    Given User wants to land on homePage
    When User Passes the userCredentials
    Then user shoudl be able to see the landing page
    And User should be able to pass the credentials to complete Registration
      | Tester-FirstName | Tester-LastName | testing@dev.com | 998829299991 |
      
      
@Smoke @Sanity
Scenario: Validate New user is able to login_Forth
    Given User wants to land on homePage
    When User Passes the userCredentials
    Then user shoudl be able to see the landing page
    And User should be able to pass the credentials to complete Registration
      | Tester-FirstName | Tester-LastName | testing@dev.com | 998829299991 |