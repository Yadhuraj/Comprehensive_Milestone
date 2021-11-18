package com.mindtree.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProrperty {
	 Properties config;

	public ReadProrperty() {
		config = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"//TestData//config.properties");
			config.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public  String readDriver()
	{
		String driver = config.getProperty("chromeDriver");
		return driver;
	}
	
	public  String readUrl()
	{
		String url = config.getProperty("url");
		return url;
	}
	
	public  String browser()
	{
		String url = config.getProperty("browser");
		return url;
	}
	public  String Excel()
	{
		String Excelfile = config.getProperty("Excelfile");
		return Excelfile;
	}
	
	public  String user()
	{
		String user = config.getProperty("user");
		return user;
	}
	public  String pass()
	{
		String pass = config.getProperty("pass");
		return pass;
	}
	public  String user2()
	{
		String user2 = config.getProperty("user2");
		return user2;
	}
	public  String pass2()
	{
		String pass2 = config.getProperty("pass2");
		return pass2;
	}

	public  String user4()
	{
		String user2 = config.getProperty("user4");
		return user2;
	}
	public  String pass4()
	{
		String pass2 = config.getProperty("pass4");
		return pass2;
	}
}
