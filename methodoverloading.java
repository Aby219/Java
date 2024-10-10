package javalab;
import java.util.Scanner; 


 class Area {
	public double circle(double radius) {
		return 3.14*radius*radius;
	
	}
public double rectangle (double width,double length) {
	return length*width;

}
public double triangle(double breadth,double height) {
	return (breadth*height/2);
	
}
}
public class methodoverloading{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Area c=new Area();
		System.out.println("enter the radius of the circle:");
		double radius=sc.nextDouble();
		System.out.println("area of the circle"+c.circle(radius));
		System.out.println("enter the width of the rectangle:");
		double width=sc.nextDouble();
		System.out.println("enter the length of the rectangle:");
		double length=sc.nextDouble();
		System.out.println("area of the rectangle" +c.rectangle(width,length));
		System.out.println("enter the breadth of the triangle:");
		double breadth=sc.nextDouble();
		System.out.println("enter the height of the triangle:");
		double height=sc.nextDouble();
		System.out.println("area of the triangle" +c.triangle(breadth, height));
	}
		
		
		
		
	}
	
	

