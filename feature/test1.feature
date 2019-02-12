Feature: facebook
Scenario Outline:facebooklognin
Given user is on the homa page
When user is able enter "<firstname>" and "<lastname>" and "<mobile>" and "<password>"
Then user is abel to enter those information

Examples: 
      |firstname  | lastname | mobile     | password |
      | Muneef    | Ahsan    | 5713595300 | ma76616@ |
      | Maryam    | Akram    | 5047643888 | ma77743@ |

