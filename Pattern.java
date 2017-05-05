/*  Name: James Hawkins
    Course: CIS 201 ­ Computer Science I
    Section: 001 
    Assignment: 2
*/
public class Pattern {
	public static void main (String[] args) {
		Doubleup();
		Dash();
		Uparrow();
		Doubledash();
		Downarrow();
		Uparrow();
		Doubledash();
		Downarrow();
		Dash();
		Doubledown();
	}

	public static void Doubleup() {
		Uparrow();
		Uparrow();
	}

	public static void Doubledown() {
		Downarrow();
		Downarrow();
	}

	public static void Doubledash() {
		Dash();
		Dash();
	}

	public static void Uparrow() {
		System.out.println("  *  ");
		System.out.println(" * * ");
		System.out.println("*   *");
	}

	public static void Downarrow() {
		System.out.println("*   *");
		System.out.println(" * * ");
		System.out.println("  *  ");
	}

	public static void Dash() {
		System.out.println("^^^^^");
		System.out.println("^^^^^");
	}
}

