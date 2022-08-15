package org.akshay.calculator;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("please select any one operation below ");
		sb.append("\n 1. Addition");
		sb.append("\n 2. Substraction");
		sb.append("\n 3. Multiplication");
		sb.append("\n 4. Division");
		System.out.println(sb);
		Scanner sc = new Scanner(System.in);
		int menuItem = sc.nextInt();
		System.out.println("u selected operation no : " + menuItem);
		System.out.println("please enter 2 numbers for the operation ");
		int operand1 = sc.nextInt();
		int operand2 = sc.nextInt();
		int result = 0;
		switch(menuItem){
			case 1 : {
				result = operand1 + operand2;
				break;
			}
			case 2 : {
				result = operand1 - operand2;
				break;
			}
			case 3 : {
				result = operand1 * operand2;
				break;
			}
			case 4 : {
				try {
				result = operand1 / operand2;
				}catch(ArithmeticException e) {
					System.out.println("exception occurred, please try again");
				}finally {
					sc.close();
				}
				break;
			}
			default : {
				System.out.println("please enter valid choice");
				break;
				}
		}
		System.out.println("result is : "  + result);
		sc.close();
	}
	
}
