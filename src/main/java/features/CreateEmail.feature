Feature: Creation of email in XYZ mail box
Scenario: To check if we are able to compose an email in the mail box
Given The user logs into the application with valid username and password
Then Check if compose button is enabled and write an email
And check if send button is enabled and click on it to send the email
Then Go to sent box and check if email has been sent successfully
