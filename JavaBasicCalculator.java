package JavaBasicCalculator;

import java.util.Scanner;

public class JavaBasicCalculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("*This is a basic calculator in Java*");
		System.out.println("The available operations are: +, -, /, *");
		
		System.out.println("Input the first number: ");
		int number1 = input.nextInt();
		
			System.out.println("Enter the operation: + - / *");
			char operator = input.next().charAt(0);
		
		System.out.println("Input the second number: ");
		int number2 = input.nextInt();
		
			int result;
		
		
		switch(operator) {
			
			case '+':
				result = number1 + number2;
				break;
			
			case '-':
				result = number1 - number2;
				break;
			
			case '*':
				result = number1 * number2;
				break;
			
			case '/':
				if(number2 != 0) {
					result = number1 / number2;
				} else {
					System.out.println("Error: Division by 0");
					return;
				}
				break;
				
				default:
					System.out.println("Invalid operator.");
					return;
		}
		
		System.out.println("The result of the opearation is: " + result);
		
	}
}
