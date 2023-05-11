Feature: Delete an employee record
  To goal verify action on the service
  As a user certification i want to verify the method
  To implement this service on others webs

  Background:
    * url "https://dummy.restapiexample.com/api/v1/"
    * def requestReference = read("../put/json/sampleUpdate.json")

  @delete
  Scenario Outline: Delete an employee record
   # * call read("../post/post.feature@post")
    * path "delete/" + id
    When method delete
    Then status 200
    * def id2 = $.data
    Then match $.message == message
    And match $.data == id2


    Examples:
      | message                               | status  |
      | Successfully! Record has been deleted | success |
