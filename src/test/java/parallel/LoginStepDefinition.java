package parallel;

	import java.io.IOException;

import org.testng.Assert;

import com.pages.LoginPage;
import com.qa.factory.Driver_Factory;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class LoginStepDefinition {

		private LoginPage loginPage = new LoginPage(Driver_Factory.getDriver());

		//public WebDriver driver;


		@Given("user is on login page")
		public void user_is_on_login_page() {

			Driver_Factory.getDriver().get("https://www.amazon.in/");

			loginPage.clickonsigin();
		}

		@When("user enter Username")
		public void user_enter_username() throws IOException {

			loginPage.enterUserName();
			loginPage.clickoncontinue();

		}

		@When("user enter Password")
		public void user_enter_password() throws InterruptedException {
			loginPage.enterPassword();

		}
		@Then("forgot your password link should be displayed")
		public void forgot_your_password_link_should_be_displayed() {
			Assert.assertTrue(loginPage.isForgotPwdLinkExist());

		
		}

					
		}

