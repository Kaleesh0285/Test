Feature: To validate the loginpage with multiple data
@BookCart
 Scenario Outline: Login Page validation

    Given user enters the "<username>" and "<Password>"
    When user clicks the login button
   Examples:
     | username    | Password  |
     | John ken    | Qwerty123 |
     | John milton | Qwerty123 |


