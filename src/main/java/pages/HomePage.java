package pages;




import java.util.Set; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class HomePage{
	
	
	private WebDriver driver;
	
	private By hideBtn = By.id("hide-textbox");
	//private By newWinBtn = By.id("win1"); 
	private By oNama = By.id("menu-item-22");
	private By tim = By.cssSelector("menu-item-1464 > a");
	private By bottom = By.id("clickAndHold");
	private By top = By.id("click");
	//private By mouseOver = By.id("demo2");
 
	
	
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

	
	
	//6
	
	public void selectCourse(){
		
		driver.findElement(By.xpath("//*[@id=\"Nahla Course\"]")).click();
		driver.findElement(By.cssSelector("option[value=\"Turski\"]")).click();
	}
	
	
	//7
	public String enterInPromptBox() {

		 String promptTxt = ("Senida Granov");
		 driver.findElement(By.id("promptBox")).click();
		 driver.switchTo().alert().sendKeys(promptTxt);
		 driver.switchTo().alert().accept();
		 return promptTxt;
	
	}
	
	//8
	 public String checkText(){ 
	
		 return driver.findElement(By.id("demo")).getText();
	
	
	 }
	
	 
	 //11
	 public void opnNewWin(String elementId){
		 
		 
		 driver.findElement(By.id(elementId)).click();
		 Set<String> allHands= driver.getWindowHandles();
		 
			
			for(String hand:allHands) {
			
				driver.switchTo().window(hand);
				//System.out.println("Current url" + driver.getCurrentUrl());	
				}
			
			
			
	 } 
	 
	 
	 //12
	 
	 public String openTabAndGetUrl() {
	  
	  
	  return driver.getCurrentUrl();
	 
	  
	} 
	
	 //13
	 
	 public void oNamaTim(String elementId){
		 
		 
		 driver.findElement(By.id(elementId)).click();
		 Set<String> allHands= driver.getWindowHandles();
		 
			
			for(String hand:allHands) {
			
				driver.switchTo().window(hand);
				//System.out.println("Current url" + driver.getCurrentUrl());	
				}
			
			 System.out.println("Current url" + driver.getCurrentUrl());	
			 driver.findElement(oNama).click();
			 //driver.findElement(tim).click();
			
			
	 } 
	 
	 
	 //16. Re-order elements by using drag and drop - "Click and hold" move to the top of list
	 
	 public void dragAndDropIt() {
			
			
			Actions action = new Actions(driver);
			
			WebElement sourceElement = driver.findElement(bottom);
			WebElement targetElement = driver.findElement(top);
			
			action.dragAndDrop(sourceElement, targetElement).perform();
			

		}
	 
	 public void mouseOverMe (){
		 
		 Actions action = new Actions(driver);
		 
		 WebElement text= driver.findElement(By.id("demo2"));
	 
		 action.moveToElement(text).perform();  
		

	 
	 }
	 
	 
	 
}
