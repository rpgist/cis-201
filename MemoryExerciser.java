/*
	Name: James Hawkins
	Course: CIS 201 - Computer Science 1
	Section: 001
	Assignment: 1
*/
import java.util.*;
public class MemoryExerciser {
	public static final int MAX_SIZE = 10;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//prompt the user for the numbers
		System.out.print("How many integers (up to " + MAX_SIZE);
		System.out.print(") would you like to see? ");
		// get the number of numbers
		int size = input.nextInt();
		if (size > MAX_SIZE)
		size = MAX_SIZE;

		int [] numbers = new int[size];		//the list of integers
		// fill the list with 'size' random numbers
		makeList(numbers);

		// display the numbers
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);

		// prompt the user to hide the numbers
		System.out.print("Type 1 when you are ready to hide the numbers: ");
		input.nextInt();
		// scroll the numbers off the terminal
		for (int i = 0; i < 50; i++)
			System.out.println();

		// get the user's answers, report how many are correct
		System.out.println("Score: " + numCorrect(numbers) +
				" correct out of " + size + " numbers.");
}

//fills the list with 'size' unique random numbers
public static void makeList(int [] list) {
	Random rand = new Random();
	int count = 0;
	while (count < list.length) {
		int number = rand.nextInt(1000) + 1;
		if (!found(list, count, number)) {
			//add the number to the list
			list[count] = number;
			count++;
		}
	}
}

// conducts a search to find the value in the list so far
// returns true if found
public static boolean found(int [] a, int size, int value) {
	for (int i = 0; i < size; i++)
		if (a[i] ==value)
		// key is found
		return true;
	// key not found
	return false;
	}

	// gets the user's answers and returns the number of correct against the list
	public static int numCorrect(int [] list) {
		Scanner input = new Scanner(System.in);
		int correct = 0;
		System.out.print ("Enter the " + list.length + " numbers: ");
		for (int i = 0; i < list.length; i++) {
			int next = input.nextInt();
			if (list[i] == next)
				correct++;
		}
		return correct;
	}
}
