Feature: sing up and add items to car
  I as a user
  Want select items to check app
  To goal validate function on app

Scenario: start sesion and select items
  Given register user "userA"
  When login on app exito with the user register early "userA"
  And  select items for car
  Then validate items into car


