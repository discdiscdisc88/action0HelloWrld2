package myTest1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Test1inTestNg1 {
	

	@BeforeMethod
	public void setUp() throws Exception {
		
	System.out.println("Start");
	
	}
	
	@Test
	public void test1() throws Exception {

		System.out.println("Hello Wrld");

	}

	@AfterMethod
	public void tearDown() throws Exception {
		
		System.out.println("Exittttttttttttt");
	}

}
