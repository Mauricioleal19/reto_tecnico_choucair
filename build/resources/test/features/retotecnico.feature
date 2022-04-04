@stories
Feature: User register
  As a user, I want to register in platform uTest
  @scenario1
  Scenario Outline: Register in platform uTest
    Given that mauricio wants register in platform uTest
    When i go to registration form
      |strName  |strLastName  |strEmail   |strCity    |strCode   |strPassword   |strConfirmPassword  |
      |<strName>|<strLastName>|<strEmail> |<strCity>  |<strCode> |<strPassword> |<strConfirmPassword>|

    Then I check the log
      |strEndRegister  |
      |<strEndRegister>|

    Examples:
        |strName  |strLastName  |strEmail   |strCity    |strCode   |strPassword   |strConfirmPassword  |strEndRegister |
      |mauricio |Leal |prueba0001@gmail.com |villavicencio  |500001 |Leal.garcia19 |Leal.garcia19 |Welcome to the world's largest community of freelance software testers!|