Feature: Testing ParaBank website features as a valid user
  As a valid user of ParaBank
  I should be able to log in
  to use the banking functionalities provided

  Scenario Outline: An authorised user logs in to the system successfully and access the features
    Given Open Parabank website Home page
    When user <Username> logs in using password <Password>
    Then click on Open New Account link "Open New Account"
    And click on Open New Account Button "Open New Account"
    Then click on newly created account number
    And click on Transfer Funds "Transfer Funds"
    Then Fill up the amount <amount> to be transferred
    When from account <From> to account <To>
    Then Click on Transfer button "Transfer"
    Then Verify the transfer is complete
    Then clickon Log Out "Log Out"

    @Regression
    Examples: 
      | Username | Password | amount | From    | To      |
      | "john"   | "demo"   | "2000" | "13344" | "13455" |
      
      
      
      
      
