package comparison;

import java.util.Scanner;

public class LineComparsionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Line Comparison Computation Program");
       
       int a1,a2,b1,b2,c1,c2;
       double x,y;
  
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
       
       System.out.println("enter the value of a1,b1,c1 of first-line in form of a1x+b1y+c=0\n");
       a1=sc.nextInt();
       b1=sc.nextInt();
       c1=sc.nextInt();
       
       System.out.println("enter the values of a2,b2,c2 of second-line in form of a2x+b2y+c2=0\n");
       a2=sc.nextInt();
       b2=sc.nextInt();
       c2=sc.nextInt();
       
       x=(((b1*c2)-(b2*c1))/((a1*b2)-(a2*b1)));
       y=(((a2*c1)-(a1*c2))/((a1*b2)-(a2*b1)));
       System.out.printf("X coordinate is %,.2f\n:",x);
       System.out.printf("Y coordinate is %,.2f\n:",y);
       
	   double firstLine=(a1*x)+(b1*y)+c1;
	   double secondLine=(a2*x)+(b2*y)+c2;
	   
	   String str1 = Double.toString(firstLine);
	   String str2 = Double.toString(secondLine);
	   
	   System.out.println(firstLine + " .equals " + secondLine + ":" + str1.equals(str2));
	}
}
