package javalab;

import java.util.Scanner;

public class Vowels {
	public static void main (String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
    int len=str.length();
    int count=0;
    for(int i=0;i<len;i++) {
    	char c = str.charAt(i);
    	if(c=='a'||c=='e' ||c=='i' ||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='u') {
    		count++;
    	}
    	}
    System.out.println("number of vowels is="+count);
    

}

}
