package intervivew;

public class Main {
	
	public static String name; 
	public static int age; 
	public static int n; 
	public static boolean isMale; 
	
	public static void main(String[] args) {
		TheInterview person = new TheInterview(); 
		
		n = 0; 
		while(n < 0) { 
			System.out.println(" \t Apply for membership to the club");
			
			name = person.getName();
			age = person.getAge();
		
			if(age == -1) { 
				isMale = person.getSex();
				
				if(isMale == true) {
					System.out.println("You may join the Father Judge Robotics Team");
				}	
			}
		  n++; 
		}
		
	}
}	
