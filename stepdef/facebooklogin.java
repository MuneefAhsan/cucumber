package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebooklogin {
WebDriver wd;
@Given("^user is on the homa page$")
public void user_is_on_the_homa_page()   {
		wd=new FirefoxDriver();
		wd.navigate().to("https://www.facebook.com/");
	    
	}

@When("^user is able enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_is_able_enter_and_and_and(String arg1, String arg2, String arg3, String arg4)  {
	   
		wd.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys(arg1);
		wd.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys(arg2);
		wd.findElement(By.xpath(".//*[@id='u_0_h']")).sendKeys(arg3);
		wd.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys(arg4);
	}

@Then("^user is abel to enter those information$")
	public void user_is_abel_to_enter_those_information()  {
		
	 System.out.println("the user is able to enter infromations");
	}
}
