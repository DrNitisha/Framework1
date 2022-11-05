package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	private WebElement LoginId;
	
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement loginbutton;

	public WebElement getLoginId() {
		return LoginId;
	}

	

	public WebElement getPassword() {
		return password;
	}

	

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	}


