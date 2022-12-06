package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.newJobBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.newJobPage;

public class newJobStef extends newJobBase{
	
	newJobPage page;
	
	@Given("User on HCP homepage")
	public void user_on_hcp_homepage() {
	    
		lanchBrowser();  
		
		page = PageFactory.initElements(driver, newJobPage.class);
	}

	@When("User enters user Name {string}")
	public void user_enters_user_name(String user) {
	    
	    page.getUserNameBx(user);
	}

	@When("User enter password {string}")
	public void user_enter_password(String pass) {
	    
	    page.getPasswordBx(pass);
	}

	@When("User clicks on signin button")
	public void user_clicks_on_signin_button() {
	   
		page.getsigninBtn();
	}

	@When("User clicks on New button")
	public void user_clicks_on_new_button() {
	    
	    page.getNewBtn();
	}

	@When("User clicks on job button")
	public void user_clicks_on_job_button() {
	    
	    page.getJobBtn();
	}

	@When("User clicks on New Customer button")
	public void user_clicks_on_new_customer_button() {
	    
	    page.getNewCustomerBtn();
	}

	@When("User enters First Name {string}")
	public void user_enters_first_name(String first) {
	    
	    page.getFirstNameBx(first);
	}

	@When("User enters Last Name {string}")
	public void user_enters_last_name(String last) {
	    
	    page.getLastNameBx(last);
	}
	
	@When("User clicks on Create button")
	public void user_clicks_on_create_button() {
	    
		page.getCreateBtn();
	}

	@When("User enters Item Name {string}")
	public void user_enters_item_name(String item) {
	    
	    page.getItemBx(item);
	}

	@When("User clicks on Private Note button")
	public void user_clicks_on_private_note_button() {
	    
	    page.getPrivateNoteBtn();
	}

	@When("User enters a private note {string}")
	public void user_enters_a_private_note(String note) {
	    
	    page.getprivateNoteTextAreaBx(note);
	}

	@When("User clicks on Save Job button")
	public void user_clicks_on_save_job_button() {
	    
	    page.getSaveJobBtn();
	}

	@Then("User verifies Activity Feed has the created job")
	public void user_verifies_activity_feed_has_the_created_job() {
	    
	    Assert.assertEquals(driver.findElement(By.xpath("//p[text()='Dispatched to Dipa Dey']")).getText(), "Dispatched to Dipa Dey");
	    closeBrowser();
	}

}
