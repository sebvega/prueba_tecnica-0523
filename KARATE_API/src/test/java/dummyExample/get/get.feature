Feature: we want use the get method
  To goal verify action on the service
  As a user certification i want to verify the method
  To implement this service on others webs

  Background:
    * url "https://dummy.restapiexample.com/api/v1/"


  @getAll
  Scenario: get all users
    * path "employees"
    When method get
    Then status 200
    And match $.status == "success"
    * match $.data[0] == read("../get/response.json")

  @getOne
  Scenario Outline: get one user
    * path "employee/" + id
    When method get
    Then status 200
    And match $.status == "success"
    * match $.data == read("../get/response.json")
    * match $.message == message

    Examples:
      | id | message                                |
      | 1  | Successfully! Record has been fetched. |

  @getBad
  Scenario Outline: get one user without exist
    * path "employee/" + id
    When method get
    Then status 200
    And match $.status == "success"
    * match $.data == null
    * match $.message == message

    Examples:
      | id         | message                                |
      | 9999999997 | Successfully! Record has been fetched. |