Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

GivenStories: stories/Withdraw.story

Scenario: Open the page
When User clicks on menu Transfer


Scenario: Transfer value to another account

When User choice account <accountFrom> from transfer
When User choice account <accountTo> to transfer
When User fill the field ammount to transfer <value>
When User click on the transfer button
Then The system show the message about the transfer <message>

Examples:
|accountFrom|accountTo  |value |message                                 |
|41253778477|00000000000|0     |The CPF information is invalid          |
|00000000000|41253778477|1000  |The CPF information is invalid          |
|41253778477|19358764732|0     |The ammount is invalid for the operation|
|41253778477|19358764732|500   |Operation completed with success        |
|41253778477|19358764732|5000  |The ammount is invalid for the operation|
|41253778477|41253778477|500   |The CPF information is invalid          |