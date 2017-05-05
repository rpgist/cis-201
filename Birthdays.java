 /**
   *  Name: <James Hawkins>
   *  Course: CIS 201 - Computer Science I
   *  Section: <001>
   *  Assignment: 8
   */
//This program asks for two birthdays and calculates
//how many days until the birthdays from the current date
import java.util.*;

public class Birthdays{

	public static void main(String[] args){

		//set up scanner
		Scanner console = new Scanner(System.in);
		//get person 1's bday
		System.out.print("Person 1, enter your birthday (mm/dd): ");
		String bday1 = console.nextLine();
		//get person 2's bday
		System.out.print("Person 2, enter your birthday (mm/dd): ");
		String bday2 = console.nextLine();
		//get todays date
		System.out.print("Enter today's date (mm/dd): ");
		String today = console.nextLine();
		//call toDate to calculate how many days till person 1's bday and set as pers1
		int pers1 = toDate(bday1,today);
		System.out.println("Days to person 1's birthday: " + pers1);
		//call toDtae to calculate how many days till person 2's bday anf set as pers2
		int pers2 = toDate(bday2,today);
		System.out.println("Days to person 2's birthday: " + pers2);
		//compare pers1 and pers2 to see which comes sooner
		if (pers1 <= pers2){
			System.out.println("Person 1's birthday will come first");
		}else{
			System.out.println("Person 2's birthday will come first");
		}
	}
	
	//toDate method converts string to int, calcs days to bday
	public static int toDate (String bday, String today){
		//var to represent # of days to go until a bday
		int days;
		//converts string to a int
		int bdayMonth = Integer.parseInt(bday.substring(0,2 ));
		int bdayDay = Integer.parseInt(bday.substring(3));
		int currentMonth = Integer.parseInt(today.substring(0,2));
		int currentDay = Integer.parseInt(today.substring(3));

		//calculates days to persons birthday
		
		if( currentMonth == bdayMonth && currentDay < bdayDay ){
			days = bdayDay - currentDay;
			return days;
		}else if (currentMonth == bdayMonth && currentDay > bdayDay){
			days = 365 - (currentDay - bdayDay);
			return days;
		}else if (currentMonth <  bdayMonth){
			days = ((currentMonth*30) + (currentDay));
			days = days - ((bdayMonth*30) + (bdayDay));
			return days;	
		}else {
			days = currentMonth * 30 + currentDay;
			days =  (bdayMonth * 30 + bdayDay) - days;
			return days;
		}
	}
}
