package test_case;


import org.testng.Assert;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;





@Test
public class Zad3Test extends BaseTest {
	
	
	//1. Click on Hide button
	public void clickOnBtn(){
		
		
		HomePage home = getDriver();
		home.clickBtn();
		
		
	}
	
	//2. Verify that "Tekst koji treba biti sakriven" is hidden
	public void hiddenTxt() {	
		
		HomePage home = getDriver();
		
		String sakriveniTekst = home.getHiddenTxt();
		Assert.assertEquals(sakriveniTekst, "","Text is not hidden");
	 
	}
	
	
	//5. Select Radio button Jezeva kucica
	
	public void clickRB(){
		
		
		HomePage home = getDriver();
		home.clickRadioBtn();
		
		
	}
	
	
	//6. From Nahla Courses select Turski 
	
	public void selectTur(){
		HomePage home = getDriver();
		home.selectCourse();
	}
	

	
	//7. Click on prompt box button, enter your name and click on OK
	//8. Check that under "Prompt box!" button following text: "Hello <name>" is displayed
	
	public void enterPB(){
		
		
		HomePage home = getDriver();
		String enterTxt = home.enterInPromptBox();
		
		String prTxt = home.checkText();
		Assert.assertEquals(prTxt, "Hello " + enterTxt,"Text is not correct");
		
		
	}
	
	//11. Click on "Click to open a new browser window!" button 
	public void openNBW(){
	
		HomePage home = getDriver();
		home.opnNewWin("win1");
		
	 }

	
	//12. Verify that Nahla.ba is open in another browser
	public void verifyUrl(){
    
    HomePage home = getDriver();
    String nUrl = home.openTabAndGetUrl();
    Assert.assertEquals(nUrl, "https://nahla.ba/","The correct page is not opened");
   
    }
	
	//13. When on Nahla page click on "O NAMA" menu and click on "Nahlin tim"
	//14. Verify that user is on "Nahla tim" page
	
	public void oNahlinTim() {
	
		HomePage home = getDriver();
		home.oNamaTim("menu-item-22");
	}
	
	
	//16. Re-order elements by using drag and drop - "Click and hold" move to the top of list
	
	public void reorder(){
		
		 HomePage home = getDriver();
		 home.dragAndDropIt();
		
	}
	
	//17. Move mouse over "Mouse over me"
	
	public void moveMouse(){
		
		HomePage home = getDriver();
		home.mouseOverMe();
		
	}

	
	
	
}
