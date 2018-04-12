import java.util.*;

public class getUserInfo {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		int age; 
		String firstName;
		String lastName;
		
		System.out.println("First Name?");
		firstName = keyboard.nextLine();
		System.out.println("Last Name?");
		lastName = keyboard.nextLine();
		System.out.println("Your Age?");
		age = keyboard.nextInt();
		
		System.out.printf("Hello, %s %s! \n", firstName, lastName);
		System.out.printf("Do you like being %d years old? \n", age);
		System.out.println("You know, in 10 years, you will be " + (age + 10) +" years old");
		System.out.printf("Hey, is it OK if I call you \"%s\"?", firstName);
		
	}
}

