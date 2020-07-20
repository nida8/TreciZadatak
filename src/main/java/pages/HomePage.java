package pages;




import java.util.List;
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
	private By emu = By.id("emu-checkbox");
	
	public HomePage(WebDriver driver){
		
		this.driver = driver;
	}
	
	//1
	public HomePage clickBtn() {
		
		driver.findElement(hideBtn).click();
		
		return new HomePage(driver);
	}
	
	//2
	public String getHiddenTxt() {
		
		return driver.findElement(By.id("displayed-text")).getText();
	}
	
	//3
	
	public void CheckEmuIsDisabled() {
		
		driver.findElement(emu).isEnabled();
	
	}
	
	//4
	public int NumberOfCheckboxes () {
		List<WebElement> checkboxList = driver.findElements(By.cssSelector("[type=\"checkbox\"]"));
		System.out.println("Number of checkboxes is: " + checkboxList.size());
		return checkboxList.size();
		}
	
	
	
	
	//5
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
	 
	 //9
	 public void NumberOfRows() {
		int rows = driver.findElements(By.xpath("//table[@id='studentTable']/tbody/tr")).size()-1;
		System.out.println("Total number of rows in the table is: "+ rows);
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
