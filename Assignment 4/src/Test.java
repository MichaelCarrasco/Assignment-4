/* Programming Fundamentals
 * NAME: Michael Carrasco
 * 8/27/2020
 * PROGRAMMING ASSIGNMENT 4
 * Summer 2020
 */

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		heading();
		int num=0;
		Set set = new Set();
		Scanner input = new Scanner(System.in);
		
		while (true) {
		System.out.print("Enter command: ");
		String command= input.nextLine();
		String [] commandInt=command.split(" ");
			try {
				num=Integer.parseInt(commandInt[1]);
				switch (commandInt[0]) {
				default:
					System.out.println("Re-enter a valid command ");
				case "add":
					set.add(num);
					System.out.println(set.toString());
					break;
				case "del":
					set.delete(num);
					System.out.println(set.toString());
					break;
				case "exists":
					System.out.println(set.exists(num));
					break;
				}
			}catch(Exception e) {
				System.out.println("Re-enter a valid number ");
			}
		}
	}
		
		
	
	//this method creates a print out for our heading
	public static String heading() {
	String output=("Programming Fundamentals\n"+"NAME: Michael Carrasco\n"+"PROGRAMMING ASSIGNMENT 3 - SET\n");
	System.out.println(output);
	return output;
	}

}
