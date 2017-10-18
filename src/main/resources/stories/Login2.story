Meta:

Narrative:
As a user
I want to login

Scenario: scenario description
Given User is on login in the system
When I fill the field user <username>
When I fill the field password <password>
When I click on the login button
Then The user should be valid


Examples:
|username |password |
|admin    |admin    |