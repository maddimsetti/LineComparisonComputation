package comparison;

import java.util.Scanner;

public class LineComparsionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome to Line Comparison Computation Program");

       int x1,x2,y1,y2;
       double lengthOfALine;

	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);

       System.out.println("enter x1 point\n");
       x1=sc.nextInt();

       System.out.println("enter y1 point\n");
       y1=sc.nextInt();

       System.out.printf("enter x2 point\n");
       x2=sc.nextInt();

       System.out.println("enter y2 point\n");
       y2=sc.nextInt();

	lengthOfALine = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
       System.out.println("Length of a Line between two coordinates of "+"("+x1+","+y1+"),"+"("+x2+","+y2+") is" +lengthOfALine);     
	}

}
