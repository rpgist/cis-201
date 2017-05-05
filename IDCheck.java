/*
	Name: James Hawkins
	Course: CIS 201 - Computer Science 1
	Section: 001
	Assignment: 7
*/

//so i can use a Scanner
import java.util.*;
public class IDCheck {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//prompt the user for the student id
		System.out.print("Enter your 7-digit student ID: ");
		//make double id to be the user input
		int id = console.nextInt();
		//call checkId method and pass it id
		boolean end = checkId(id);
		//check if the id is returned as true or false
		if (end == true){
		System.out.println("That is a legal ID");
		} else {
		System.out.println("That is NOT a legal ID");
		}
	}
	
	public static boolean checkId (int id) {
		//set variable 
		int sum=0;
		int dig=0;
		//for loop to seperate the digets
		for (int i=1; i <=6; i++){
			//select the digets by 10^7 - 10^i
			dig = id / (int)(Math.pow(10,7-i));
			//concad the sum with 10 to get the diget and multiply by i 
			dig = (dig % 10)* i;
			sum = sum + dig; 	
 		}
	 	//compare the sum with the last diget of the Id and return boolean
		sum = sum % 10;
		if (sum == (id % 10)){
		return true;
		}else {
		return false;
		}
	}
}

