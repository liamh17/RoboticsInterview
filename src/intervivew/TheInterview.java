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
		
		//Used in switch/case statement in the Main class.
		//Are they between 14 and 18?
		if(age > 14 && age < 18) {
			return 1; 
		}
		//Is their age less than 14? (i.e. are they in elementary school?) 
		else if(age < 14) {
			return 2;
		}
		//Is ther age greater than 18? (i.e. are they in college?)
		else if(age > 18) {
			return 3; 
		} else {
			return 4; //Useless 
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
