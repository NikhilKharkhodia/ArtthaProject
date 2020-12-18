package test.scanario;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.RegisterPage;
import com.utill.TestUtil;

import Generic.BaseTest;

public class DataDriverTest extends BaseTest {

	@BeforeMethod
	public void setUP() throws InterruptedException {
		try {
			launchBrowser();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@DataProvider
	public Object[][] getUserData() {
		Object data[][] = TestUtil.getTestData("Sheet1");
		return data;
	}

	@Test(enabled = true, dataProvider = "getUserData")
	public void test1(String firstname, String lastname, String phone, String email, String address, String city,
			String state, String postalcode, String country, String username, String userpassword,
			String confirmpassword) throws InterruptedException, AWTException {

		HomePage hp = new HomePage(driver);
		hp.clickonregister().click();
		Thread.sleep(2000);
		RegisterPage rp = new RegisterPage(driver);
		rp.registerNewMembers(firstname, lastname, phone, email, address, city, state, postalcode, country, username,
				userpassword, confirmpassword);

	}
}
