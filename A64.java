 /**
   *  Name: <Fill in your name>
   *  Course: CIS 201 - Computer Science I
   *  Section: <Fill in your section: 001 or 003 or 005>
   *  Assignment: 6.4
   */

import java.util.*;

// accepts a string and produces vertically and in reverse

public class A64 {

    public static void main (String [] args) {
        System.out.print("Enter a string: " );
        Scanner sc = new Scanner(System.in);
	String word = sc.next();
	System.out.println("\"" + word + "\" reversed and vertical: ");
        System.out.println(verticalReverse(word));
    }

    // write verticalReverse() here
}
