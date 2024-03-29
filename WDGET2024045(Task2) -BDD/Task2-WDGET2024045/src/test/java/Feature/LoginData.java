package Feature;

import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class LoginData {
		WebDriver driver;
		
		@Given("I open the browser")
		public void i_open_the_browser() {
		    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://www.saucedemo.com/");
		    
		}

		@When("I enter the username {string} and password {string}")
		public void i_enter_the_username_and_password(String username, String password) {
		   
		   System.out.println("When Executed");
		   WebElement usernameField=driver.findElement(By.id("user-name"));
		   WebElement passwordField=driver.findElement(By.id("password")); 
		   
		   usernameField.sendKeys(username);
		   passwordField.sendKeys(password);

		   
		   
		}

		@Then("Login sucessfully if {string} credentails are provided")
		public void login_sucessfully_if_credentails_are_provided(String caseType) {
			WebElement loginButton=driver.findElement(By.id("login-button"));
			loginButton.click();
		   if(caseType.equals("valid")) {
			   System.out.println("First Case Valid");
		   }
		   else {
			   System.out.println("Invalid case");
		   }
		   
		   
		}
	}

