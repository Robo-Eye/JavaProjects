import java.util.InputMismatchException;
/**
 * 
 * @author Tyler Fontana
 * This program runs getInput from Inventory class infinitely catching all errors from Inventory and printing them out
 */
public class LotManager {
/**
 * Main that calls getInput, within a loop, and catches all errors/Exceptions
 * @param args
 */
	public static void main(String[] args) {
		boolean start = true;
		Inventory run = new Inventory();
		while(start) { //continues forever
			try {
				run.getInput(); //running getInput
			}catch(InputMismatchException e) {
				System.out.println("Not an integer answer.");
			}catch(ArithmeticException e) {
				System.out.println("Invalid number (Must be a postive value).");
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("That position doesn't exist or lacks a vechicle there in Inventory");
			}
			catch (Exception e) { //if not specific error is caught, a generic one is caught and its message is printed out
				System.out.println(e.getMessage());
			}
		}
	}

}
