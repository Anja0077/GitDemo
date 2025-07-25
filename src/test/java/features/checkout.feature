Feature: Place the order for Products

@PlaceOrder
Scenario Outline: Search experience for product search in both home and offers page

	Given user is on GreenCart landing page
	When  user searched with shortname <name> and extracted actual name of product
	And   added "3" items of the selected product to cart
	Then  user proceeds to checkout and validate the <name> items checkout page
	And 	verify user has ability to enter promocode and place the order

	Examples:
	|name|
	|Beet|