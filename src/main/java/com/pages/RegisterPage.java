package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseTest;

public class RegisterPage extends BaseTest {

	public WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//input[@name='firstName']")
	@CacheLookup
	WebElement firstname;

	private @FindBy(xpath = "//input[@name='lastName']")
	@CacheLookup
	WebElement lastname;

	private @FindBy(xpath = "//input[@name='phone']")
	@CacheLookup
	WebElement phone;

	private @FindBy(xpath = "//input[@id='userName']")
	@CacheLookup
	WebElement email;

	private @FindBy(xpath = "//input[@name='address1']")
	@CacheLookup
	WebElement address;

	private @FindBy(xpath = "//input[@name='city']")
	@CacheLookup
	WebElement city;

	private @FindBy(xpath = "//input[@name='state']")
	@CacheLookup
	WebElement state;

	private @FindBy(xpath = "//input[@name='postalCode']")
	@CacheLookup
	WebElement postalcode;

	private @FindBy(xpath = "//select[@name='country']")
	@CacheLookup
	WebElement country;

	private @FindBy(xpath = "//input[@id='email']")
	@CacheLookup
	WebElement userName;

	private @FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement userPassword;

	private @FindBy(xpath = "//input[@name='confirmPassword']")
	@CacheLookup
	WebElement confirmPassword;

	private @FindBy(xpath = "//input[@name='submit']") 
	@CacheLookup
	WebElement submit;

	public WebElement clickonfirstName() {
		return firstname;
	}

	public WebElement clickonLastName() {
		return lastname;
	}
	public WebElement enterphonenumber() {
		return phone;
	}
	public WebElement enteremail() {
		return email;
	}
	public WebElement enteraddress() {
		return address;
	}
	public WebElement entercity() {
		return city;
	}
	public WebElement enterpostalcode() {
		return postalcode;
	}
	public WebElement enterstate() {
		return state;
	}
	public void registerNewMembers(String ftname, String ltname, String phnumber, String mailid, String useraddress,
			String usercity, String userstate, String userpostalcode, String usercountry, String username, String userpassword,
			String confirmpassword)
	{
		firstname.sendKeys(ftname);
		lastname.sendKeys(ltname);
		phone.sendKeys(phnumber);
		email.sendKeys(mailid);
		address.sendKeys(useraddress);
		city.sendKeys(usercity);
		state.sendKeys(userstate);
		postalcode.sendKeys(userpostalcode);
		country.sendKeys(usercountry);
        userName.sendKeys(username);
        userPassword.sendKeys(userpassword);
        confirmPassword.sendKeys(confirmpassword);
	}}
	


