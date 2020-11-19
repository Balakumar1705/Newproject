Feature: Verifying the addactin details

Scenario Outline: Verifying Addactin Login details
     Given User is on the Addactin Page
      When User Should enter "<username>" and "<password>"
      And User should click login button
      Then User should verify the msg
      
      
      Examples:
      |username  | password|
      |Bala      |Bala     | 

  