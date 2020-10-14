package test.scanario;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.pages.HomePage;

import com.pages.RegisterPage;

import Generic.BaseTest;

public class RendomDataTest extends BaseTest {

	Faker faker = new Faker();

	@BeforeMethod
	public void setUP() throws InterruptedException {
		try {
			launchBrowser();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void registeruser() {
		HomePage hp = new HomePage(driver);
		hp.clickonregister().click();

		RegisterPage rs = new RegisterPage(driver);
		String firstname = faker.name().firstName();
		rs.clickonfirstName().sendKeys(firstname);
		String lastname = faker.name().firstName();
		rs.clickonLastName().sendKeys(lastname);
		String phone = faker.phoneNumber().cellPhone();
		rs.enterphonenumber().sendKeys(phone);
		String Email = faker.internet().emailAddress();
		rs.enteremail().sendKeys(Email);

		String streetName = faker.address().streetName();
		rs.enteraddress().sendKeys(streetName);
		String number = faker.address().buildingNumber();
		rs.enteraddress().sendKeys(number);
		String city = faker.address().city();
		rs.entercity().sendKeys(city);
		String state = faker.address().state();
		rs.enterstate().sendKeys(state);

		String zipCode = faker.address().zipCode();
		rs.enterpostalcode().sendKeys(zipCode);

	}
@Test
	
	public void validatehomepageurl() {
	String actualurl=driver.getCurrentUrl();
	
	Assert.assertEquals(actualurl, "http://demo.guru99.com/test/");
}
}
