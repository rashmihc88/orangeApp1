package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import pom.AddEmpPage;
import pom.AdminPage;
import pom.HomePage;
import pom.LoginPage;
import pom.PIMPage;

public class LoginTest extends BaseTest
{
	@Test
	public void logging()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUser("admin");
		lp.setPwd();
		lp.clickLogin();
		
		HomePage hp=new HomePage(driver);
		hp.clickPIM();
		
		PIMPage pm=new PIMPage(driver);
		pm.clickAddEmp();
		
		AddEmpPage aep=new AddEmpPage(driver);
		aep.setFirstName();
		aep.setLastName();
		aep.setEmpID();
		aep.clickSave();
		
		pm.clickEmpList();
		
		Assert.assertEquals(driver.findElement(By.xpath("//a[.='ABCDTEST']")).getText(), "ABCDTEST");
		Reporter.log("text ABCDTEST present",true);
		
		/*Assert.assertEquals(driver.findElement(By.xpath("//a[.='Jasmine']")).getText(), "Jasmine");
		Reporter.log("text JASMINE present",true);*/
		
		hp.clickAdmin();
		
		AdminPage ap=new AdminPage(driver);
		ap.clickUser();
		ap.clickAddButton();
		ap.selectUserRole();
		ap.setEmpName();
		ap.addname();
		ap.setUSERName();
		ap.setStatus();
		ap.setPwd();
		ap.confirmPwd();
		ap.clickSaveButton();
		
		Assert.assertEquals(driver.findElement(By.xpath("//td[contains(.,'ABCDTEST 123')]")).getText(), "ABCDTEST 123");
		Reporter.log("text ABCDTEST 123  present and is admin",true);
		
		hp.clickWelcome();
		hp.clickLogout();
	}
}
