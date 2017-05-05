/*  Name: James Hawkins
    Course: CIS 201 ­ Computer Science I
    Section: 001 
    Assignment: 3
*/
public class Games {
	public static final int N = 6;

	public static void main (String[] args) {

		/*Print out the first line using 2N+1 */

		System.out.print("The probabiltiy that ");
		System.out.print (2 * N + 1);
		System.out.println(" games will need to be");
		System.out.println("played by two evenly matched teams to determine");
		System.out.print("a winner is ");

		/*Use a for loop to calc probability using (2i-1)/2i */

		double b = 1;
		for (int i = 1; i <= N ; i++) {
			b = b *  (2 * i - 1) / (2 * i ); 

		}

		System.out.print(b);
		System.out.println(".");



	}
}
