package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage
{
	@FindBy(xpath="//a[@id='menu_pim_addEmployee']")
	private WebElement addEmp;
	
	@FindBy(xpath="//a[@id='menu_pim_viewEmployeeList']")
	private WebElement EmpList;
	
	public PIMPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddEmp()
	{
		addEmp.click();
	}
	
	public void clickEmpList()
	{
		EmpList.click();
	}
	
	
	
}
