package calculator;

import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static double fnum;
	public static double snum;
	private static Scanner input = new Scanner(System.in);
	private static String newLine = System.getProperty("line.separator");

	public static void main(String[] args) {
		boolean moreMath;

		do{
			moreMath = userSelection();
		}
		while (moreMath == true);
		input.close();

	}

	public static boolean userSelection() {

		System.out.println("Options:" + newLine + " 1. Addition ( a + b = c)" + newLine
				+ " 2. Multiplication ( a * b = c)" + newLine + " 3. Subtraction (a - b = c)" + newLine
				+ " 4. Division a / b = c)" + newLine +  " 5. Exit Calculator" + newLine + " 6. Exponatation");

		System.out.println(newLine + "Select operation to perform: ");

		int selection = input.nextInt();
		System.out.println("You've selected option: " + selection);
		System.out.println("Please enter first number: ");
		fnum = input.nextDouble();

		System.out.println("Enter second number");
		snum = input.nextDouble();

		if (selection == 1) {
			return addition();
		}
		if (selection == 2) {
			return multiplication();
		}
		if (selection == 3) {
			return subtraction();
		}
		if (selection == 4) {
			return division();
		}

		if (selection == 5) {
			System.out.println("Thank you for Using my calculator, Goodbye");
			return false;
		}
		if (selection == 6){
			return exponatation();
		}
		
		return false;
	}
	public static boolean addition(){

		double answer = fnum + snum;

		System.out.println("The Answer is: " + answer);
		return true;
		
	}
	public static boolean multiplication(){

		double answer = fnum * snum;

		System.out.println("The Answer is: " + answer);
		return true;

	}
	public static boolean subtraction(){

		double answer = fnum - snum;

		System.out.println("The Answer is: " + answer);
		return true;
	}
	public static boolean division(){
		if(snum == 0){ 
			System.out.println("Error, please enter 1 or greater, cannot divide by 0");
		}
		else{
			double answer = fnum / snum;
			System.out.println("The Answer is: " + answer);
		}
		return true;
	}
	public static boolean exponatation(){
		double answer = Math.pow(fnum, snum);
		System.out.println("The Answer is: " + answer);
		return true;
	}
}
