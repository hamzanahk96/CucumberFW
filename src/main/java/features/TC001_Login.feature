Feature:Login Action 
Scenario: On sucessfile Login display a message as Login Sucessful for valid inputs 
Given user on home page
When user enters username 
And user enters password
And clicks on Submit button
Then validate User and display a message as Successful 
And Close