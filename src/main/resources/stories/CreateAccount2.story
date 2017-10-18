Narrative:
In other create a new account
Is a admin
I want a new account

GivenStories: stories/Login2.story

Scenario: Open the page
When User clicks on menu Create Account

Scenario: The customer cpf was wrong
When User clicks on menu Create Account
When User fill the customer Id with customer cpf <cpfValue>
When User click the Create account button
Then Show the <message>

Examples:
|cpfValue 		|message 						  |
|11123      	|The CPF information is invalid   |
|22222222222    |The CPF information is invalid   |
|41253778477    |Operation completed with success |
|19358764732    |Operation completed with success |
|41253778477    |Account already exists 		  |


