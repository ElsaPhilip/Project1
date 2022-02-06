Feature: User search for product in the Home page and in the other page

@SearchProduct
Scenario Outline: User search for product
Given : User is in landing page
When : User enter <Name> in the search page
Then : <Name> is diaplayed
And : Offer page displays the veg name

Examples: 

|	Name	|
|	Bean		|
|	Beet	|	

