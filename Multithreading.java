package javalab;
import java.util.*;
class EvenNum implements Runnable{
	public int a;
	public EvenNum(int a)
	{
		this.a=a;
	}
	public void run()
	{
		System.out.println("The thread is "+a+" is even and square of "+a+" is: "+a*a);
	}}
class OddNum implements Runnable{
	public int a;
	public OddNum(int a) {
		this.a=a;}
		public void run() {
			System.out.println("The thread is "+a+" is odd and cube of "+a+" is: "+a*a*a);
		}}
	class RandomNumGenerator extends Thread{
		public void run()
		{
			int n=0;
			Random rand = new Random();{
			try {
			n=rand.nextInt(20);{
			System.out.println("obtained number is"+n);
			if(n%2==0) {
				Thread thread1 = new Thread(new EvenNum(n));
				thread1.start();
			}
			else {
				Thread thread2 = new Thread(new OddNum(n));
				thread2.start();
				
			}
			Thread.sleep(1000);
			System.out.println("  ");
			}}
		catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
	}}}
   public class Multithreading{
   public static void main(String args[])
   {
	   RandomNumGenerator Rnum = new RandomNumGenerator();
	   Rnum.start();
	   
	  
   }}
   