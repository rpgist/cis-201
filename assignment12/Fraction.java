/**
   *  Name: <James Hawkins>
   *  Course: CIS 201 - Computer Science I
   *  Section: <001>
   *  Assignment: 12
   */
public class Fraction{

    //feilds
    private int x;
    private int y;
    private int newy;
    private int newx;
    
    //constructors
    //constructs a new fraction given (x,y)
    public Fraction(int numerator, int denominator){
	x = numerator;
	y = denominator;
	newx = numerator;
	newy = denominator;
    }

    //methods
    //sets the numerator to the new number
    public int setNumerator(int newX){
	x = newX;
	return x;
    }
    
    //reduces the fraction
    public void reduce(){
	int num = gcd();
	x = x/num;
	y = y/num;
	
	
    //finds the gcd
    }
    public int gcd() {
	if (x == 0){
	    return newx;
	}else{
	    while (newy != 0){
		if (newx > newy){
		    newx = newx - newy;
		}else{
		    newy = newy - newx;
		}
	    }
	return newx;
	}
    }
    //returns a fraction representation
    public String toString(){
	return(x + "/" + y);
    }  
}
