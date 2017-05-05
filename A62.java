 /**
   *  Name: <Fill in your name>
   *  Course: CIS 201 - Computer Science I
   *  Section: <Fill in your section: 001 or 003>
   *  Assignment: 6.2
   */

import java.util.*;

// This program accepts two integers < 10, the first integer less than
// than the second prints values in a square in this range
// in a square rotating the first value

public class A62 {

    public static void main (String [] args) {
        System.out.print("Enter two integers: ");
        Scanner input = new Scanner(System.in);
	int min = input.nextInt();
	int max = input.nextInt();
	printSquare(min, max);
    }

    // prints values min to max
    // and then rotates them
    // write printSquare() here
}
