package test.scanario;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.HomePage;

import Generic.BaseTest;

public class DemoTest extends BaseTest {

	 public static Logger log =LogManager.getLogger(BaseTest.class.getName());
	
	
	
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
		log.info("Varify user click on register tab");
		HomePage hp = new HomePage(driver);
		hp.clickonregister().click();


}}
