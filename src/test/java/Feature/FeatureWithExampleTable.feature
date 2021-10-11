Feature: UserRegistraion


  Scenario Outline: Validate New user is able to login
    Given User wants to land on homePage
    When User Passes the userCredentials
    Then user shoudl be able to see the landing page
    And User should be able to pass the credentials to complete Registration "<FirstName>" , "<LastName>" ,"<EmailAddress>" ,"<PhoneNumber>"
  
  
 Examples: 
 		|FirstName | LastName | EmailAddress | PhoneNumber |
    | FIRST_FN | FIRST_LN | testing11@dev.com | 111111111 |
    | Second_FN | Second_LN | testing22@dev.com | 99999999 |
    | THIRD_FN | THIRD_LN | testing33@dev.com | 777777777 |
    | FORTH_FN | FORTH_LN | testing44@dev.com | 43434343 |