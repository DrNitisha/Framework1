package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test1 extends BaseClass{
	
	@Test
	public void m1() {
		LoginPom login =PageFactory.initElements(driver,LoginPom.class);
		
		Library.custom_sendKeys(login.getLoginId(), excel.getDataFromExcel("Sheet1", 0, 0),"email field");
		Library.custom_sendKeys(login.getPassword(),excel.getDataFromExcel("Sheet1", 0, 1), "password field");
		Library.custom_click(login.getLoginbutton(), "login button");
		String title=driver.getTitle();
		System.out.println(title);
		
		String expectedtitle="Home Page";
		
		Assert.assertEquals(title, expectedtitle);
				
	}
	

}
