/*
 * Tyler Fontana  
 * 8/29/2020
 */
import java.util.Scanner;
public class Program1aFontanaTyler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the maximum room capacity of the meeting room?");
		int maxCap = sc.nextInt();
		System.out.println("How many people plan to attend this meeting?");
		int pplAttending = sc.nextInt();
		
		if (pplAttending <= maxCap) {
			System.out.println("It is legal to hold a meeting in this room."); 
			System.out.println("Moreover, there is room for " + (maxCap - pplAttending) +
					" person(s) to attend this meeting while staying under the " +
					"legal capacity limit");
		}else {
			System.out.println("The meeting cannot be held as planned due to fire regulations. " + (pplAttending - maxCap) +
					" person(s) need to be excluded to hold this meeting");
		}
		
		sc.close();
	}

}
