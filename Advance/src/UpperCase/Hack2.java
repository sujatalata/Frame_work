package UpperCase;

import java.util.Scanner;

public class Hack2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
	for(int i=0; i<s.length(); i++)  
	{
		char ch=s.charAt(i);
		if(Character.isLowerCase(ch))
		{
			ch=Character.toUpperCase(ch);
			System.out.print(ch);
		}
		else if(Character.isUpperCase(ch))
		{
			ch=Character.toLowerCase(ch);
			System.out.print(ch);
		}
	}
		
		
	}

}
