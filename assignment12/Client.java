public class Client {
    public static void main (String [] args) {
	Fraction f1 = new Fraction (8, 10);
	System.out.println("f1 = " + f1);

	Fraction f2 = new Fraction (8, 10);
	System.out.println("f2 = " + f2);
        f2.setNumerator(11);
	System.out.println("f2 = " + f2);

	Fraction f3 = new Fraction (-6,12);
	System.out.println("f3 = " + f3);
	f3.reduce();
	System.out.println("f3 = " + f3);
	
    
    }
}

