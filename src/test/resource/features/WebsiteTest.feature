Feature: Testing login action as a valid user of ParaBank
  I should be able to log in with valid credentials to access the other features provided

  Scenario Outline: An authorised user logs in to the system successfully 
    Given Open Parabank website Home page
    When user <Username> logs in using password <Password>
    Then click on Open New Account link "Open New Account"
    And click on Open New Account Button "Open New Account"
    Then click on newly created account number "12345"
    And click on Transfer Funds "Transfer Funds"
    Then Fill up the amount <amount> to be transferred 
    When from account <From> to account <To>
    Then Click on Transfer button "Transfer"
    Then Verify the transfer is complete
    Then clickon Log Out "Log Out"

    @Regression
    Examples: 
      | Username | Password | amount | From    | To      |
      | "john"   | "demo"   | "2000" | "12345" | "12456" |
     
