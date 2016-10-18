package intervivew;

/*
 * This class is our main class. It will handle the initial 
 * questions, such as the title. Additionally, it will 
 * determine the position of the member on the team (i.e. 1st,
 * 2nd, 3rd...8th). 
 */

import java.util.InputMismatchException;

public class Main {
	
	//Instance variables used...initialized later.
	public static String name; 
	public static int age; 
	public static int ageSwitch; 
	public static int n; 
	public static int numApplicants; 
	public static boolean isMale; 
	
	static TheInterview person = new TheInterview(); 
	
	//Main method.
	public static void main(String[] args) {a
		numApplicants = 0; 
		
		//Execute code specified...if error is found, execute catch() 
		try {
			//Repeat indefinitely.
			while(true) {
				System.out.println(" \t Apply for membership to the club..");
				System.out.println(" \t ----------------------------------");
			
				name = person.getName();
				age = person.getAge(); 
				
				isMale = person.getSex(); 
					
				//Is the person above 14 and less than 18, are the M/F?
				/*
				if(age == -1 && isMale == false) {		
					numApplicants++; 
					//System.out.println("Congratulations, " + name + 
					//		" you are member number " + x + 
					//		" to join the team!");
				}
				*/
				
				/*
				ageSwitch = 0; 
				switch(age) {
					//Age is between 14 and 18.
					case 1:
						ageSwitch += 1;
					//Age is less than 14.
					case 2:
						ageSwitch += 2;
						System.out.println("We ask you to join the FIRST Lego League.");
					//Age is greater than 18. 
					case 3:
						ageSwitch += 3;
						System.out.println("We ask you to join a club at your University.");
				}
				*/
				
			}
		
		}
		//Handler for any unwanted inputs. 
		catch(InputMismatchException ex) {
			System.out.println("Please enter the proper information!");
		}
		
		//Add any extra error's found here (catch{} statements).
	}
	
	public static void getAgePart2() {
		age = person.getAge(); 
		ageSwitch = 0; 
		
		switch(age) {
			case 1:
				ageSwitch += 1; 
			case 2:
				ageSwitch += 2;
			case 3:
				ageSwitch += 3; 
		}
	}
}
