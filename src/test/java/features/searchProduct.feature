Feature: Search and Place the order for Products

@OffersPage
Scenario Outline: Search experience for product search in both home and offers page

	Given user is on GreenCart landing page
	When  user searched with shortname <vegetable_name> and extracted actual name of product
	Then 	user searched for <vegetable_name> shortname in offers page 
	And   validate product name in offers page matches with Landing page
	Examples:
	|vegetable_name|
	|Tom|
	|Pota|