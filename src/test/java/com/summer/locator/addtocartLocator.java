package com.summer.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.summer.utilityy.base_classSummer;

public class addtocartLocator extends base_classSummer {

	public addtocartLocator () {
		
		PageFactory.initElements(driver, this);
		
		}

	//add to cart locator	
		@FindBy(how= How.LINK_TEXT, using ="Add to cart")
		public WebElement Addtocartalert;
		
		//cart check locator
		@FindBy(how= How.ID, using ="cartur")
		public WebElement Cartcheck;
	
		
	}
	
	

