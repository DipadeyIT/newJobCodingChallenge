package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newJobPage {
	
	public WebDriver driver;
	
	public newJobPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		
	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement userNameBx;
	
	public void getUserNameBx(String user) {
		userNameBx.sendKeys(user);
	}
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordBx;
	
	public void getPasswordBx(String pass) {
		passwordBx.sendKeys(pass);
	}
	
	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement signinBtn;
	
	public void getsigninBtn() {
		signinBtn.click();
	}
	
	@FindBy(xpath = "//span[text()='New']")
	WebElement newBtn;
	
	public void getNewBtn() {
		newBtn.click();
	}
	
	@FindBy(xpath = "//li[text()='Job']")
	WebElement jobBtn;
	
	public void getJobBtn() {
		jobBtn.click();
	}
	
	@FindBy(xpath = "//span[text()='+ New customer']")
	WebElement newCustomerBtn;
	
	public void getNewCustomerBtn() {
		newCustomerBtn.click();;
	}
	
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstNameBx;
	
	public void getFirstNameBx(String first) {
		firstNameBx.sendKeys(first);
	}
	
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastNameBx;
	
	public void getLastNameBx(String last) {
		lastNameBx.sendKeys(last);
	}
	
	@FindBy(xpath = "//span[text()='create']")
	WebElement createBtn;
	
	public void getCreateBtn() {
		createBtn.click();
	}
	
	@FindBy(xpath = "//input[@id='item-name']")
	WebElement itemBx;
	
	public void getItemBx(String item) {
		itemBx.sendKeys(item);
	}
	
	@FindBy(xpath = "//p[text()='Private notes']")
	WebElement privateNoteBtn;
	
	public void getPrivateNoteBtn() {
		privateNoteBtn.click();
	}
	
	@FindBy(xpath = "//textarea[@data-testid='private-notes-textfield']")
	WebElement privateNoteTextAreaBx;
	
	public void getprivateNoteTextAreaBx(String note) {
		privateNoteTextAreaBx.sendKeys(note);
	}
	
	@FindBy(xpath = "//span[text()='Save job']")
	WebElement saveJobBtn;
	
	public void getSaveJobBtn() {
		saveJobBtn.click();
	}
	
	
	
}






