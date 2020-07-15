package pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage{
	
	
	private WebDriver driver;
	
	private By hideBtn = By.id("hide-textbox");

 
	
	
	public HomePage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public HomePage clickBtn() {
		
		driver.findElement(hideBtn).click();
		
		return new HomePage(driver);
	}
	
	public String getHiddenTxt() {
		return driver.findElement(By.id("displayed-text")).getText();
	}
	
	
	public void clickRadioBtn() {
		
		driver.findElement(By.cssSelector("input[value=\"Jezeva kucica\"]")).click();

	}

	
	
	//7
	public void enterInPromptBox () {

		
		 driver.findElement(By.id("promptBox")).click();
		 driver.switchTo().alert().sendKeys("Senida Granov");
		 driver.switchTo().alert().accept();
		
		
		
	}
	
}
