package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;
	
	public static ExtentReports getReports() {
		String path="C:\\Users\\verma\\eclipse-workspace\\AAAA\\Reports";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("AAAA Automation Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "FaceBook Testing");
		extent.setSystemInfo("Module Name", "Login Page");
		extent.setSystemInfo("Automatation Tool", "Selenium WebDriver");
		extent.setSystemInfo("O.S.","Windows10");
		extent.setSystemInfo("QA", "NITISHA");
		extent.setSystemInfo("Test Date", "29 oct");
		return extent;
		
	}

}
