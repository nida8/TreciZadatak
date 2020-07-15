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
	

	
	//7. Click on prompt box button, enter your name and click on OK
	
	public void enterPB(){
		
		
		HomePage home = getDriver();
		home.enterInPromptBox();
		
		
	}

	

}
