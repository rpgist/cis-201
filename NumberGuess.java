/* Name: James Hawkins
   Course: CIT 201 - COmputer Science 1
   Section: 001
   Assignment: 9
*/
//this program chooses a secret number and prompts user for a guess
//so i can use a scanner
import java.util.*;

public class NumberGuess{
	
	public static void main (String[] args){
		//calls method instructions to print instructions
		instructions();
		//set up a scanner
		Scanner sc = new Scanner(System.in);
		//gets a random number
		Random rand = new Random();
		int number = rand.nextInt(100);
		//gets the first guess
		System.out.print("Your guess? ");
		int guess = sc.nextInt();
		int guessCount = 1;
		//gives hints based off user input until correct
		while (guess != number && guess != -1){
			int numberMatches = matches(number, guess);
			System.out.println("Incorrect (hint: " + numberMatches + " digits match)");
			guess = userInput(sc);
			guessCount++;
			}
		if (guess == -1){
			System.out.println("My secret number was: "+ number);
		}else{
			System.out.println("You got it right in " + guessCount + " tries.");
		}
	}
	
	//instructions method prints instructions
	public static void instructions () {
		System.out.println("Try to guess my two-digit number, and I'll");
                System.out.println("tell you how many digits from your guess");
                System.out.println("appear in my number. Enter -1 to give up.");
	}

	//returns number of digits matching
	public static int matches(int number, int guess){
		int numMatch = 0;
		//checks the first digit
		if (guess/10 == number /10 || guess /10 == number %10){
			numMatch++;
		}
		//checks the second digit
		if (guess/10 != guess%10 && (guess %10 == number/10 || guess %10 == number%10)){
			numMatch++;
		}
		return numMatch;
	}

	//gets user input and returns it if its valid
	public static int userInput(Scanner sc){
		int guess = getInt(sc, "Your Guess? ");
		//checks if the number is in the range
		while (guess<-1 || guess >= 100 && guess !=-1){
			System.out.println("Out of range; try again. ");
			guess = getInt(sc, "Your Guess? "); 
		}
		return guess;
	}

	//prompts until a vaild number is input
	public static int getInt(Scanner sc, String prompt){
		System.out.print(prompt);
		//checks if the input is an integer
		while (!sc.hasNextInt()){
			String junk= sc.next();
			System.out.println(junk +" is not an integer; try again.");
			System.out.print(prompt);
		}
		return sc.nextInt();
	}
}
