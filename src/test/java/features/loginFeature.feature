Feature: To test login scenarios of fb with different credentials

Scenario Outline: To test the login scenario using credential 1
	Given I launch the browser
	And I load the <url>
	Then I enter the <credentials>
Examples:
|		url		|	credentials	|
|https://fb.com |		cred2	|