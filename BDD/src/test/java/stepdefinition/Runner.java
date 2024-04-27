package stepdefinition;

import org.testng.annotations.Test;


public class Runner extends StepDefinition{
	@Test
public void login()
{
StepDefinition c=new StepDefinition();
c.goToFacebook();
c.clickOnCreateAccount();
c.passData();
}
}
