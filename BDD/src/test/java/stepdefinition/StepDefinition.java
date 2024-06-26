package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
WebDriver driver=null;
@Given("I want to write a step with precondition")
public void goToFacebook() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
   driver.get("https://www.facebook.com");
}
@Given("to create a facebook account")
public void clickOnCreateAccount()
{
	
	driver.findElement(By.linkText("Create new account")).click();
}
@Given("send data to elemments")
public void passData()
{
	System.out.println("in passData()");
 WebElement first=driver.findElement(By.xpath("//input[@name='firstname']"));
   first.sendKeys("kanak"); 
	/*
	 * WebElement lastName=driver.findElement(By.name("lastname"));
	 * lastName.sendKeys("suvarna"); WebElement emailField =
	 * driver.findElement(By.name("reg_email__"));
	 * emailField.sendKeys("your.email@example.com");
	 * 
	 * WebElement passwordField = driver.findElement(By.name("reg_passwd__"));
	 * passwordField.sendKeys("YourPassword");
	 * 
	 * // You can add more fields (e.g., birthday, gender) as needed
	 * 
	 * // Click on the "Sign Up" button WebElement signUpButton =
	 * driver.findElement(By.name("websubmit")); signUpButton.click();
	 * 
	 * // Close the browser driver.quit();
	 */
}

/*
 * @Given("some other precondition") public void some_other_precondition() {
 * 
 * }
 * 
 * @When("I complete action") public void i_complete_action() {
 * 
 * }
 * 
 * @When("some other action") public void some_other_action() { // Write code
 * here that turns the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @When("yet another action") public void yet_another_action() { // Write code
 * here that turns the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @Then("I validate the outcomes") public void i_validate_the_outcomes() { //
 * Write code here that turns the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @Then("check more outcomes") public void check_more_outcomes() { // Write
 * code here that turns the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @Given("I want to write a step with name1") public void
 * i_want_to_write_a_step_with_name1() { // Write code here that turns the
 * phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @When("I check for the {int} in step") public void
 * i_check_for_the_in_step(Integer int1) { // Write code here that turns the
 * phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @Then("I verify the success in step") public void
 * i_verify_the_success_in_step() { // Write code here that turns the phrase
 * above into concrete actions throw new io.cucumber.java.PendingException(); }
 * 
 * @Given("I want to write a step with name2") public void
 * i_want_to_write_a_step_with_name2() { // Write code here that turns the
 * phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @Then("I verify the Fail in step") public void i_verify_the_Fail_in_step() {
 * // Write code here that turns the phrase above into concrete actions throw
 * new io.cucumber.java.PendingException(); }
 */
}
