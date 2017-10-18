Meta:

Narrative:
As a admin
I want to perform an action
So that I can achieve a business goal

GivenStories: stories/Deposit.story

Scenario: Open the page
When User clicks on menu Withdrawn

Scenario: Withdraw susscceful
When User choice account <account>
When User fill the field amount <value>
When User click on Withdraw button
Then The system show the message <message>

Examples:
|account    |value |message                                 |
|41253778477|0     |The ammount is invalid for the operation|
|00000000000|1000 |The CPF information is invalid           |
|41253778477|5000  |The ammount is invalid for the operation|
|41253778477|1000  |Operation completed with success        |
|41253778477|500   |Operation completed with success        |