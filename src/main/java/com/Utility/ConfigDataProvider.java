package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;
	public ConfigDataProvider() throws Exception {
		String path="C:\\Users\\verma\\eclipse-workspace\\AAAA\\ConfigData\\Config.properties";
		FileInputStream file=new FileInputStream(path);
		pro=new Properties();
		pro.load(file);
		
		
		}
	public String getURL() {
		return pro.getProperty("URL");
	}

}
