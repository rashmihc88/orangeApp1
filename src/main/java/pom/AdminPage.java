package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage
{
	Select s;
	
	@FindBy(xpath="//a[contains(.,'User Management')]")
	private WebElement UserM;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	private WebElement AddButton;
	
	@FindBy(xpath="//select[@id='systemUser_userType']")
	private WebElement UserRole;
	
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	private WebElement EmpName;
	
	@FindBy(xpath="(//li[contains(.,'ABCDTEST 123')])[2]")
	private WebElement addName;
	
	@FindBy(xpath="//input[@id='systemUser_userName']")
	private WebElement UserNAME;
	
	@FindBy(xpath="//select[@id='systemUser_status']")
	private WebElement Status;
	
	@FindBy(xpath="//input[@id='systemUser_password']")
	private WebElement newPwd;
	
	@FindBy(xpath="//input[@id='systemUser_confirmPassword']")
	private WebElement confirmPwd;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement savebtn;
	
	public AdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickUser()
	{
		UserM.click();
	}
	
	public void clickAddButton()
	{
		AddButton.click();
	}
	
	public void selectUserRole()
	{
		s=new Select(UserRole);
		s.selectByIndex(1);
	}
	
	public void setEmpName()
	{
		EmpName.sendKeys("ABCDTEST");
	}
	
	public void addname()
	{
		addName.click();
	}
	
	public void setUSERName()
	{
		UserNAME.sendKeys("testABCD1234");
	}
	
	public void setStatus()
	{
		s=new Select(Status);
		s.selectByIndex(0);
	}
	
	public void setPwd()
	{
		newPwd.sendKeys("12345667");
	}
	
	public void confirmPwd()
	{
		confirmPwd.sendKeys("12345667");
	}
	
	public void clickSaveButton()
	{
		savebtn.click();
	}
}
