package intervivew;

/*
 * This class handles most of the interviewing process. There are
 * separate methods designed to handle the data entered by the user
 * (i.e. sex, age, name)...
 */

//import java.util.InputMismatchException;
import java.util.Scanner;

public class TheInterview {
	//Our scanner, this is where the information comes from.
	static Scanner sc = new Scanner(System.in); 
	
	//Instance variables...initialized later.
	public static String name; 
	public int age;
	public boolean isMale; 
	
	int n = 0; 
	
	//Method to return the name of the person being interviewed.
	public String getName() {
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		return name; 
	}
	//Method to return the age of the person being interviewed.
	public int getAge() {
		System.out.println("Enter your age, in years: ");
		age = sc.nextInt(); 
		
		/*
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
		*/
		
		//Used in switch/case statement in the Main class. 
		if(age > 14 && age < 18) {
			return 1;
		}
		else if(age < 14) {
			return 2;
		}
		else if(age > 18) {
			return 3; 
		} else {
			return 4; //Useless (in a way)
		}
	}
	//Method to handle the sex of the person being interviewed.
	public boolean getSex() {
		System.out.println("Are you a male? Enter 'true' or 'false.'");		
		isMale = sc.nextBoolean(); 
		
		if(isMale == false) {
			System.out.println("Sorr, you must join the BambiBotz!");
			return true; 
		}
		else if(isMale == true) {
			return true; 
		} else {
			return true; 
		}
	}
}
