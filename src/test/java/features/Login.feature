Feature: Application Login

Scenario: home page default login
Given User is on MercadoLibre landing page
When User login into application with username and password
Then Verification Message is displayed


Scenario: home page set zipcode
Given User is on MercadoLibre landing page
When user sets a zipcode
Then zipcode is displayed

Scenario: Perform a prodcut search
Given User is on MercadoLibre landing page
When User performs a product search 
Then User selects first item
