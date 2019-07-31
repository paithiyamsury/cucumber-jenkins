package stepdef;


import org.junit.Assert;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;

 
import cucumber.api.java.en.Given;
 
import cucumber.api.java.en.Then;
 
import cucumber.api.java.en.When;

 
public class Sam3Class

{
 
WebDriver driver;
 
@Given("user opens the testme app in chrome browser")
 
public void user_opens_the_testme_app_in_chrome_browser()

{
 
System.setProperty("webdriver.chrome.driver","C:\\sel\\chromedriver.exe");
 
driver=new ChromeDriver();
 
driver.get("http://10.232.237.143:443/TestMeApp/");
 
driver.findElement(By.linkText("SignIn")).click();


}

 
@When("user gives {string} and {string}")
 
public void user_gives_and(String UN, String UP)

{
 
driver.findElement(By.name("userName")).sendKeys(UN);
 
driver.findElement(By.name("password")).sendKeys(UP);


}

 
@When("user clicks login button")
 
public void user_clicks_login_button()

{
 
driver.findElement(By.name("Login")).click(); 

}

 
@Then("verify login as success")
 
public void verify_login_as_success() 

{
 
Assert.assertTrue(driver.getTitle().contains("Home"));
 
driver.close();

}
@Given("display welcome message")
public void display_welcome_message() {
    System.out.println("WELCOME");
}

}
