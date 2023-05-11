##Author: sanchezvegaing@gmail.com

Feature: Use the exito page foy buy
  Me as a user
  I want to use the exito page and will try Demo Modules
  To verify functioning of the page

  @HappyLine
  Scenario: full up the car
    Given "subCategoryA" logs in Exito
    When selects category and sub-category
    Then searches the product values and should see the product values are the same
