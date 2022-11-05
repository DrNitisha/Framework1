package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	public static ExtentTest test;

	public static void custom_sendKeys(WebElement element,String value,String FieldName) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS,FieldName+"=successfully sent value :"+  value );
			
		}catch(Exception e) {
			test.log(Status.FAIL,e.getMessage());
			//System.out.println(e.getMessage());
			
			
		}
	}
	public static void custom_click(WebElement element,String fieldname) {
		try {
			element.click();
			test.log(Status.PASS,fieldname+"=Successfully clicked the button" );
			}catch(Exception e) {
				test.log(Status.FAIL,e.getMessage());
				System.out.println(e.getMessage());
			}
	}

}
