Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

GivenStories: stories/CreateAccount2.story

Scenario: Open the page
When User clicks on menu Deposit

Scenario: Make deposits
When User select account <account>
When User fill the amount <value>
When User click on Deposit button
Then Show the message <message>

Examples:
|account    |value |message                                 |
|41253778477|0     |The ammount is invalid for the operation|
|00000000000|1000  |The CPF information is invalid          |
|41253778477|1000  |Operation completed with success        |
|19358764732|500000|Operation completed with success        |