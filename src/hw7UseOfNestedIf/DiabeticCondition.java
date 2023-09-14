package hw7UseOfNestedIf;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println("<-- Please Enter your Hemoglobin A1C value below -->");
		Scanner scanner = new Scanner(System.in);
		double hbA1c = scanner.nextDouble();
		if (hbA1c > 6.4) {
			System.out.println("I am a diabetic patient");
		} else if (hbA1c < 6.4) {
			System.out.println(" Congratulation ! you are not daibetic ");
			if (hbA1c >= 5.7) {
             System.out.println("I am a pre-diabetic patient");
             if(hbA1c < 5.7) {
            	 System.out.println("I am a heathy person");
             }
             
			}
		}

	scanner.close();
	}
}
/*
 * HW07A: Hemoglobin A1C is measured to determine - you are diabetic or not.
 * Now, Create a package name --> "hw7UseOfNestedIf" inside your HW project.
 * Create a Class, named "DiabeticCondition". Type the main method. After the
 * main method, print -- "<-- Please Enter your Hemoglobin A1C value below -->".
 * Instantiate Scanner class to type your Hemoglobin A1C value in the console.
 * Declare a double type variable hbA1c and initialize it by
 * scanner.nextDouble(). Now write some conditions. a) If your hbA1c value is
 * more than 6.4, the outcome will be "I am a diabetic patient". b) If your
 * hbA1c value is not more than 6.4, Congratulation! you are not diabetic. Now
 * introduce the nested if condition below. if hbA1c >= 5.7, the outcome will be
 * "I am a pre-diabetic patient". if hbA1c < 5.7, the outcome will be
 * "I am a healthy person". In the above conditions, use an appropriate keyword
 * like if, else if, or else to execute your health condition. Please organize
 * the code. Any white space is not acceptable. push the code to GitHub and add
 * the link below.
 */