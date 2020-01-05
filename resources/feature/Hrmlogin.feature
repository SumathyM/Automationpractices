Feature: Login into Orangehrm
  I want to use this URL https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers to login to Orangehrm

  @Smoke
  Scenario Outline: Title of your scenario outline
    Given I want to login to the URL <URL>
    When I enter the valid <username> and <password>
    And click submit
    Then I want to login successfully

    Examples: 
      | URL                                       | username                | password |
      | https://opensource-demo.orangehrmlive.com | ayyamuthutnuk@gmail.com | tnuk1234 |
