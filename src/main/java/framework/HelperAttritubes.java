package framework;

import org.testng.annotations.Test;

public class HelperAttritubes {
	
	@Test
	public void Dogs()
	{
		System.out.println("I love dogs");
	}
	
	@Test(enabled =false)
	public void Cats()
	{
		System.out.println("I love cats");
	}
	
	@Test(dependsOnMethods = {"Dogs"})
	public void Cows()
	{
		System.out.println("I love cows");
	}
	
	@Test(timeOut = 5000)
	public void hen()
	{
		System.out.println("I love hens");
	}

}
