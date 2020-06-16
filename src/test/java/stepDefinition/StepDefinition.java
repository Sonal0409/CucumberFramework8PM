package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("^Open the chrome browser and open mercury page$")
	public void method1()
	{
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
	}

	@When("^verify the url and title of the page$")
	public void method2()
	{
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

	@Then ("^Enter the details for Username, passowrd click the sigin$")
	public void method3() throws InterruptedException
	{
driver.findElement(By.name("userName")).sendKeys("Mittal");
		
		driver.findElement(By.name("password")).sendKeys("abc@1234");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();


		
	}


	@Then("^the account created successfully$")
	
	public void method4()
	{
		System.out.println(driver.getCurrentUrl());
		System.out.println("Account created successfully");
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
