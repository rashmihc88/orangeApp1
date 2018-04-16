package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	@FindBy(xpath="//b[.='PIM']")
	private WebElement PIM;
	
	@FindBy(xpath="//b[.='Admin']")
	private WebElement Admin;
	
	@FindBy(xpath="//a[contains(.,'Welcome')]")
	private WebElement welcome;
	
	@FindBy(xpath="//a[contains(.,'Logout')]")
	private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPIM()
	{
		PIM.click();
	}
	
	public void clickAdmin()
	{
		Admin.click();
	}
	
	public void clickWelcome()
	{
		welcome.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}
}
