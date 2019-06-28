package com.techlistic.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	static Properties prop;
	public static void readPropertyFile() {
		String filePath=Constants.PROPERTY_FILE_PATH;
		
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
