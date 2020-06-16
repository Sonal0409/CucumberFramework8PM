package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitionTest {
	
	
	@Given("^The user logs into the application with valid username and password$")
	public void login()
	{
		System.out.println("logginto the application");
	}
	
	@Then("^Check if compose button is enabled and write an email$")
	public void compose()
	{
		System.out.println("compose an email");
	}
	@And("^check if send button is enabled and click on it to send the email$")
	public void sendbutton()
	{
		System.out.println("send an email");
	}
	@Then("^Go to sent box and check if email has been sent successfully$")
	public void sentbox()
	{
		System.out.println("check an email in sent box");
	}
}
