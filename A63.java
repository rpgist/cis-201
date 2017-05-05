 /**
   *  Name: <Fill in your name>
   *  Course: CIS 201 - Computer Science I
   *  Section: <Fill in your section: 001 or 003>
   *  Assignment: 6.3
   */

import java.util.*;


// This program accepts a string an indents it by the given number of spaces

public class A63 {

    public static void main (String [] args) {
        System.out.print("Enter a word followed by an integer: ");
        Scanner input = new Scanner(System.in);
	String word = input.next();
	int spaces = input.nextInt();
        System.out.println("\""+ word + "\" indented by " + spaces +
                           " spaces  is:" + indent(word, spaces));
                           
    }

    // write indent() here

}
