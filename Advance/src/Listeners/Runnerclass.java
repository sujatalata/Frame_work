package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runnerclass {
	@Test
	public void test1()
	{
		System.out.println("hello India");
	}
	@Test
	public void test2()
	{
		System.out.println("hello Assia");
		Assert.fail();
	}
	@Test
	public void test3()
	{
		System.out.println("bangalore");
	}
}
