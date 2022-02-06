Feature: Chekout product 

@PlaceOrder
Scenario Outline: Add items and checkout
Given : User is in landing page
When : User enter <Name> in the search page
And : Add "3" items into the cart
Then : Proceed to chekoutPage and validate <Name> in the chekout page
And : Verify user has the provision to enter Promo code and place order

Examples: 

|	Name	|
|	Tom		|
|	Beet	|	