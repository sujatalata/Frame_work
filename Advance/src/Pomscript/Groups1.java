package Pomscript;

import org.testng.annotations.Test;

public class Groups1 {
	@Test(groups="sanity")
	public void test1()
	{
		System.out.println("hellow world");
	}
@Test(groups= {"sanity","smoke"})
		public void test2()
		{
	System.out.println("hellow india");
}
@Test(groups="sanity")
public void test3()
{
System.out.println("hellow karnataka");
}	

}
