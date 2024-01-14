#language : en
#Autor: Luis


Feature: As user I want to login successfully

  Scenario Outline: Login user successfully

    Given the user id in demo login page
    When the user puts correct credentials
      | username   | password   |
      | <username> | <password> |
    Then user can see <text>
    Examples:
      | username | password | text      |
      | admin    | serenity | dashboard |