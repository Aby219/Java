package javalab;

import java.util.Scanner;

public class frequency {
	public static void main (String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
    System.out.println("enter the character");
    String ch=sc.nextLine();
    int count=0;
    for(int i=0;i<str.length();i++)
    {
    	if (str.charAt(i)==ch.charAt(0))
    	{
    count++;}
    }
    		
    		
    System.out.println("no of count in the string="+count+ch);
}
}
