Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

GivenStories: stories/Transfer.story

Scenario: Open the page
When User clicks on menu Loans

Scenario: Open the page
When User clicks on menu Make Loan

Scenario: Make a Loan
When User choice account <accountNum> for loan
When User fill the field amount  <valueNum> to loan
When User click on Get Loan button
Then The system show the loan message <message>

Examples:
|accountNum |valueNum  |message                                 |
|41253778477|0         |The ammount is invalid for the operation|
|00000000000|1000      |The CPF information is invalid          |
|41253778477|1000      |Insufficient balance in account for the loan operation. Minimum of $2000 is required|
|19358764732|2000      |The requested loan ammount exceeds the available credit limit|
|19358764732|1000      |Operation completed with success        |