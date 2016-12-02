import java.util.Scanner; // Needed for the Scanner class
 	public class BackwardsString
 	{
 	public static void main(String[] args)
 	{
 	Scanner keyboard = new Scanner(System.in); // Create a Scanner object to read input.
 	String input; // To hold the input
 	 
 	// Ask the user to input a string
 	System.out.print("Enter a word: ");
 	input = keyboard.nextLine();
 	 
 	// Demonstrate the method by passing it the inputted string.
 	reverse(input);
 	}
 	 
 	/*
 	Method: Accepts a String object as an argument
 	and displays its contents backward.
 	For instance, if the string argument is "gravity" the method
 	displays "ytivarg".
 	*/
 	private static void reverse(String word)
 	{
 	System.out.print("Your word reversed: ");
 	for (int i = 0; i < word.length(); i++)
 	System.out.print(word.charAt(word.length() - 1 - i) );
 	 
 	System.out.println();
 	}
 	}
