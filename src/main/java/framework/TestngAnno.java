package framework;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestngAnno {
	@Test(groups = {"smoke"})
	public void actualtest()
	{
		System.out.println("Testcase 1");
	}
	
	@BeforeSuite
	public void Beforesuite()
	{
		System.out.println("I am the first = Before Suite");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("I am the first = Before Class");
	}

	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("I am the before method bro...");
	}

	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("I am the before test ");
	
	}
	
	@Test
	public void actualtest2()
	{
		System.out.println("Testcase 2");
	}
	
	@AfterSuite
	public void Aftersuite()
	{
		System.out.println("I am the first = After Suite");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("I am the first = After Class");
	}

	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("I am the After method bro...");
	}

	@AfterTest
	public void AfterTest()
	{
		System.out.println("I am the After test ");
	
	}
	
	
}
