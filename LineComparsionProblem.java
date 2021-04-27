package comparison;

import java.util.Scanner;

public class LineComparsionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Line Comparison Computation Program");
       
       double x1,x2,y1,y2,a1,a2,b1,b2;
       double midPoint1x,midPoint1y,Length1,Length2;
  
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
       
       System.out.println("enter the value of x1\n");
       x1=sc.nextInt();
       
       System.out.println("enter the value of x2\n");
       x2=sc.nextInt();
       
       System.out.println("enter the value of y1\n");
       y1=sc.nextInt();
       
       System.out.println("enter the value of y2\n");
       y2=sc.nextInt();
       
       midPoint1x = (x1+x2)/2;
       midPoint1y = (y1+y2)/2;
       System.out.printf("X coordinate is %.2f\n",midPoint1x);
       System.out.printf("Y coordinate is %.2f\n",midPoint1y);
      
       Length1 = Math.sqrt(Math.pow((midPoint1x - x1),2) + Math.pow((midPoint1y - y1),2));
       System.out.println("Length of a Line between one coordinate and Mid_Point of "+"("+x1+","+y1+"),"+"("+midPoint1x+","+midPoint1y+") is" +Length1);
       
       System.out.println("enter the value of a1\n");
       a1=sc.nextInt();
       
       System.out.println("enter the value of a2\n");
       a2=sc.nextInt();
       
       System.out.println("enter the value of b1\n");
       b1=sc.nextInt();
       
       System.out.println("enter the value of b2\n");
       b2=sc.nextInt();
       
       double midPoint2x,midPoint2y;
       
       midPoint2x = ((a1+a2)/2);
       midPoint2y = ((b1+b2)/2);
       System.out.printf("X coordinate is %.2f\n",midPoint2x);
       System.out.printf("Y coordinate is %.2f\n",midPoint2y);
       
       Length2 = Math.sqrt(Math.pow((midPoint2x - a1),2) + Math.pow((midPoint2y - b1),2));
       System.out.println("Length of a Line between one coordinate and Mid_Point of "+"("+a1+","+b1+"),"+"("+midPoint2x+","+midPoint2y+") is" +Length2);

       String str1 = String.valueOf(Length1);
       String str2 = String.valueOf(Length2);
       
       System.out.println(Length1 + " .equals " + Length2
               + ": " + str1.equals(str2));
       
       System.out.println(Length1 + " .compareTo " + Length2
               + ": " + str1.compareTo(str2));
      
	}
}
