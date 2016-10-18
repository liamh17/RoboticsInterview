package intervivew;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TheInterview {
	static Scanner sc = new Scanner(System.in); 
	
	public static String name; 
	public int age;
	public boolean isMale; 
	
	int n = 0; 
	
	public String getName() {
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		return name; 
	}
	public int getAge() {
		System.out.println("Enter your age, in years: ");
		age = sc.nextInt(); 
		
		if(age < 14) {
			System.out.println("You must join FIRST Lego League.");
			return -1; 
		}
		else if(age > 18) {
			System.out.println("You will need to find a Robotics Club at your University.");
			return -1; 
		} else {
			return age; 
		}
	}
	public boolean getSex() {
		try {
			System.out.println("Are you a male? Enter 'true' or 'false.'");		
			isMale = sc.nextBoolean(); 
		
			if(isMale == false) {
				System.out.println("Sorr, you must join the BambiBotz!");
				return true; 
			}
			else if(isMale == true) {
				return true; 
			}
		}
		catch(InputMismatchException ex) {
			System.out.println("Please enter 'true' or 'false'!");
		}
		
	    return true; 
	}
}
