package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmpPage 
{
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement FN;
	
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement LN;
	
	@FindBy(xpath="//input[@id='employeeId']")
	private WebElement empID;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement save;
	
	public AddEmpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setFirstName()
	{
		FN.sendKeys("ABCDTEST");
	}
	
	public void setLastName()
	{
		LN.sendKeys("123");
	}
	
	public void setEmpID()
	{
		empID.sendKeys("40");
	}
	
	public void clickSave()
	{
		save.click();;
	}
}
