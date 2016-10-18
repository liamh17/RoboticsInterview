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
	public static int n; 
	public static boolean isMale; 
	
	//Main method.
	public static void main(String[] args) {
		TheInterview person = new TheInterview(); 
		
		//Execute code specified...if error is found, execute catch() 
		try {
			//Repeat indefinitely.
			while(true) {
				System.out.println(" \t Apply for membership to the club..");
				System.out.println(" \t ----------------------------------");
				
				//Count members of the team.
				for(int x = 0; x < 8; x++) {
					name = person.getName();
					age = person.getAge(); 
				
					isMale = person.getSex(); 
					
					//Is the person above 14 and less than 18, are the M/F?
					if(age == -1 && isMale == false) {					
						x++; 
						System.out.println("Congratulations, " + name + 
								" you are member number " + x + 
								" to join the team!");
					}
				}
			}
		
		}
		//Handler for any unwanted inputs. 
		catch(InputMismatchException ex) {
			System.out.println("Please enter the proper information!");
		}
		
		//Add any extra error's found here (catch{} statements).
	}
}
