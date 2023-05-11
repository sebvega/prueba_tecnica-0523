Feature: Update an employee record
  To goal verify action on the service
  As a user certification i want to verify the method
  To implement this service on others webs

  Background:
    * url "https://dummy.restapiexample.com/api/v1/"
    * def requestReference = read("../put/json/sampleUpdate.json")

  @put
  Scenario Outline: Update an specific employee record
    * call read("../post/post.feature@post")
    * def id = 2
    * path "update/" + id
    Given request reference
    When method put
    Then status 200
    Then match $.message == message
    * def id = $.data.id
    * def data = $.data

    * url "https://dummy.restapiexample.com/api/v1/employee/" + id
    When method get
    Then status 200
    * match $.data[0] == data


    Examples:
      | name           | salary | age | message                              |
      | juan sebastian | 3000   | 26  | Successfully! Record has been added. |
      | jack Black     | 2500   | 25  | Successfully! Record has been added. |

  @putIncompetence
  Scenario Outline: Update an specific employee record
    * call read("../post/post.feature@post")
    * def id = 2
    * path "update/" + id
    Given request reference
    When method put
    Then status 200
    Then match $.message == message
    * def id = $.data.id
    * def data = $.data

    * url "https://dummy.restapiexample.com/api/v1/employee/" + id
    When method get
    Then status 200
    * match $.data[0] == data


    Examples:
      | name           | salary        | age | message                              |
      | juan sebastian | (@(!#valores) | 26  | Successfully! Record has been added. |
      | 32233213#@_.,  | 3000          | 26  | Successfully! Record has been added. |
      | juan sebastian | 3000          | dos | Successfully! Record has been added. |
