package comparison;

import java.util.Scanner;

//Class Declaration
class LineComparsionProblem {


	//Variables
	private static double x1,x2,y1,y2,a1,a2,b1,b2;

	//Constructor Declaration of class
	public LineComparsionProblem () 
	{

	}

	//method1
	public static double midPoint1x ()
	{
		return ((x1+x2)/2);
	}

	//method2
	public static double midPoint1y ()
	{
		return ((y1+y2)/2);
	}

	//method3
	public static double midPoint2x ()
	{
		return ((a1+a2)/2);
	}

	//method4
	public static double midPoint2y ()
	{
		return ((b1+b2)/2);
	}

	//method5
	public static double Length1 () 
	{
		return Math.sqrt(Math.pow((midPoint1x() - x1),2) + Math.pow((midPoint1y() - y1),2));
	}

	//method6
	public static double Length2 ()
	{
		return Math.sqrt(Math.pow((midPoint2x() - a1),2) + Math.pow((midPoint2y() - b1),2));
	}


	//compute
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Welcome to Line Comparison Computation Program");

        @SuppressWarnings("resource")
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x1\n");
		LineComparsionProblem.x1=sc.nextInt();
		System.out.println("enter the value of x2\n");
		LineComparsionProblem.x2=sc.nextInt();
		System.out.println("enter the value of y1\n");
		LineComparsionProblem.y1=sc.nextInt();
		System.out.println("enter the value of y2\n");
		LineComparsionProblem.y2=sc.nextInt();
		System.out.println("enter the value of a1\n");
		LineComparsionProblem.a1=sc.nextInt();
		System.out.println("enter the value of a2\n");
		LineComparsionProblem.a2=sc.nextInt();
		System.out.println("enter the value of b1\n");
		LineComparsionProblem.b1=sc.nextInt();
		System.out.println("enter the value of b2\n");
		LineComparsionProblem.b2=sc.nextInt();


       System.out.printf("X coordinate is %.2f\n",midPoint1x () );
       System.out.printf("Y coordinate is %.2f\n",midPoint1y () );

       System.out.println("Length of a Line between one coordinate and Mid_Point of "+"("+x1+","+y1+"),"+"("+midPoint1x()+","+midPoint1y()+") is" +Length1());


       System.out.printf("X coordinate is %.2f\n",midPoint2x () );
       System.out.printf("Y coordinate is %.2f\n",midPoint2y () );

       System.out.println("Length of a Line between one coordinate and Mid_Point of "+"("+a1+","+b1+"),"+"("+midPoint2x()+","+midPoint2y()+") is" +Length2());

       String str1 = String.valueOf(Length1 ());
       String str2 = String.valueOf(Length2 ());

       System.out.println(Length1 () + " .equals " + Length2 ()
               + ": " + str1.equals(str2));

       System.out.println(Length1 () + " .compareTo " + Length2 ()
               + ": " + str1.compareTo(str2));

	}
}
