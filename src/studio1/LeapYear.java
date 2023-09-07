package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The year you want to check");
		int Year1 = in.nextInt();
		boolean requirement1 = (Year1 % 4 == 0 );
		boolean requirement2 = (Year1 % 100 == 0 );
		boolean requirement3 = (Year1 % 400 == 0 );
		boolean Year = ((requirement1 == true && requirement2 == false) || requirement3 == true);
		System.out.print(Year1 + "is a leap year" + Year);
	}

}
