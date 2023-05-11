Feature: we want use the post method
  To goal verify action on the service
  As a user certification i want to verify the method
  To implement this service on others webs

  Background:
    * url "https://dummy.restapiexample.com/api/v1/"
    * def requestReference = read("../post/json/sampleUpdate.json")

  @post
  Scenario Outline: post a new user
    * path "create"
    Given request requestReference
    When method post
    Then status 200
    Then match $.message == message
    * def id = $.data.id
    * def data = $.data
    * url "https://dummy.restapiexample.com/api/v1/employee/" + id
    When method get
    Then status 200
    * match $.data[0] == data


    Examples:
      | name         | salary | age | message                              |
      | jhon doe     | 3000   | 32  | Successfully! Record has been added. |
   #   | jack jhonson | 2500   | 25  | Successfully! Record has been added. |

  @postFailed
  Scenario Outline: post a new user with incorrect form
    * path "create"
    Given request requestReference
    When method post
    Then status 200
    Then match $.message == message
    * def id = $.data.id

    Examples:
      | name     | salary | age | message                              |
      |          | 3000   | 32  | Successfully! Record has been added. |
      | jhon doe |        | 32  | Successfully! Record has been added. |
      | jhon doe | 3000   |     | Successfully! Record has been added. |
