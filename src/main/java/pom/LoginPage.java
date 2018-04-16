package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement UN;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUser(String username)
	{
		UN.sendKeys(username);
	}
	
	public void setPwd()
	{
		pwd.sendKeys("admin");
	}
	
	public void clickLogin()
	{
		login.click();
	}
}
