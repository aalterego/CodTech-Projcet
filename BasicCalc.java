package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalc {

	public static void main(String[] arg) {
		System.out.println("This is Console Based Calculator to perform Basic Operation!!");

		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean flag=true;
			System.out.println();
			System.out.println("For Addition type +");
			System.out.println("For Subtraction type -");
			System.out.println("For Multiplication type *");
			System.out.println("For Division  type /");
			System.out.println();
			
			System.out.println("To Exit the calculator type X");
			String opertaion = sc.next();
			if ("X".equalsIgnoreCase(opertaion))
				break;

			Double num1=0.00;
			Double num2=0.00;
			try {
				System.out.println("Enter The 1st Number : ");
				num1 = sc.nextDouble();
				System.out.println("Enter The 2nd Number : ");
				num2 = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Enter the Valid Number");
				flag=false;
			}
			if(!flag) continue;
			System.out.println();
			Double ans=0.00;
			if ("+".equals(opertaion)) {
				ans = num1 + num2;
				System.out.println("Addition of " + num1 + " and " + num2 + " = " + ans);
			}
			
			else if ("-".equals(opertaion)) {
				ans = num1 - num2;
				System.out.println("Subtraction of " + num1 + " and " + num2 + " = " + ans);
			}
			else if("*".equals(opertaion))
					{
				ans = num1*num2;
				System.out.println("Multiplication of " + num1 + " and " + num2 + " = " + ans);
					}
			
			else if("/".equals(opertaion))
			{
				ans = num1 / num2;
				System.out.println("Division of " + num1 + " and " + num2 + " = " + ans);
			}
			
			else {
				System.out.println(opertaion+ " This is not a valid Opertaion");
			}

		}
		System.out.println("See you Soon :) ");

	}

}
