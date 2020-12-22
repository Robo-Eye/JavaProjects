import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * 
 * @author Tyler Fontana
 *	 This program asks the user whether they want to: print inventory; buy a vehicle; sell a vehicle. If the user wants to print inventory, prints out the Inventory.
 *   If they want to buy vehicles, the program asks the user for the following information: (bike or car, price, model, mileage if relevant), then add the vehicle to the Inventory, 
 *   and deduct the appropriate amount from the balance. If they want to sell, the user can select the option to sell and state how much, in which the inventory and balance 
 *   is adjusted accordingly.
 */
public class Inventory {
	protected int balance = 100000;//starting balance
	protected ArrayList<Vehicle> ar = new ArrayList<Vehicle>(); //running inventory
	
	Bicycle b; //child classes
	Car c;
	/**
	 * This method essentially runs the the entire program as stated above except for the toString method
	 * @throws Exception
	 */
	public void getInput() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Current balance: $" + balance); //give balance and options
		System.out.println("Choose an option: \r\n" + 
		 		"  1. Print inventory.\r\n" + 
		 		"  2. Buy vehicle.\r\n" + 
		 		"  3. Sell vehicle.\r\n" + 
		 		"");
		int choice = 0;
			
		choice = sc.nextInt(); //takes choice from user 
		if(choice < 1 || choice > 3) { //input verification
			throw new Exception("Invalid input [Number Must Be Within the Range 1-3]");
		}else if (choice > 0 && choice < 4){
			//breaks from the "if else block if it is within correct range
		}else {
			throw new InputMismatchException("Not an integer answer.");
		}
		
		switch(choice) { //computes what option was picked
			
			case 1: 
				if(ar.isEmpty()) {
					throw new Exception("No Inventory"); //if the inventory is empty throw exception 
				}else {
					System.out.println("Current Inventory:"); //else show inventory
					System.out.println(toString());
				}
				
				break;
				
			case 2: 
				System.out.println("Do you want to buy a:\r\n" + //asks the user to specify what type of vehicle
						"  1. Bicycle\r\n" + 
						"  2. Car\r\n" + 
						"");
				choice = 0;
				
				choice = sc.nextInt(); //records choice 
				
				if(choice < 1 || choice > 3) { //input verification
					throw new Exception("Invalid input [Number Must Be Within the Range 1-3]");
				}else if (choice > 0 && choice < 4){
					//breaks from the "if else block if it is within correct range
				}else {
					throw new InputMismatchException("Not an integer answer.");
				}
				
				switch(choice) { //computes choice
				
					case 1: //asks for model name
						System.out.println("Enter model.");
						String model = sc.next(); //I figure this this is one entry point in where essentially all characters/numbers can be taken
						//ask for price
						System.out.println("Enter price.");
						int price = sc.nextInt();
						
						if(price < 0) { //input verification 
							throw new ArithmeticException("Invalid number (Must be a postive value).");
						}else if(price > this.balance) {
							throw new Exception("Not enough money.");
						}else if(price >= 0 && price < this.balance) {
							//breaks from the "if else block if it is within correct range
						}else {
							throw new InputMismatchException("Not an integer answer.");
						}
						
						
						b = new Bicycle(price, model); //send information to child class
						
						this.balance -= price; //subtract cost from balance
						
						ar.add(b); //add new object to array (inventory)
						
						System.out.println("New purchase acquired.");
						
						break;
						
					case 2:
						model = "";
						price = 0;
						
						System.out.println("Enter model.");
						model = sc.next(); //I figure this this is one entry point in where essentially all characters/numbers can be taken
						//ask user for price
						System.out.println("Enter price.");
						price = sc.nextInt();
						
						if(price < 0) { //input verification
							throw new ArithmeticException("Invalid number (Must be a postive value).");
						}else if(price > this.balance) {
							throw new Exception("Not enough money.");
						}else if(price >= 0) {
							//breaks from the "if else block if it is within correct range
						}else {
							throw new InputMismatchException("Not an integer answer.");
						}
						//ask for mileage
						System.out.println("Enter mileage.");
						int mileage = sc.nextInt();
						
						if(mileage < 0) { //input verification
							throw new Exception("Invalid number (Must be a postive value).");
						}else if(mileage >= 0) {
							//breaks from the "if else block if it is within correct range
						}else {
							throw new InputMismatchException("Not an integer answer.");
						}
						//send information to child class
						c = new Car(mileage, price, model);
						
						this.balance -= price; // account for cost in new balance
						
						ar.add(c); //add new car to inventory
						
						System.out.println("New purchase acquired.");
						
						break;
						
				}
				break;
				
			case 3: 
				System.out.println("Which number would you like to sell?");
				int removeChoice = sc.nextInt(); //ask what vehicle in inventory the user wants to sell
				
				if(removeChoice > ar.size() - 1) { //input verification
					throw new IndexOutOfBoundsException("That position doesn't exist or lacks a vechicle there in Inventory");
				}else if(removeChoice < 0) {
					throw new IndexOutOfBoundsException("That position doesn't exist or lacks a vechicle there in Inventory");
				}else if(removeChoice < ar.size() && removeChoice > -1) {
					//breaks from the "if else block if it is within correct range
				}else {
					throw new InputMismatchException("Not an integer answer.");
				}
				
				System.out.println("What is the sale price?");
				int salePrice = sc.nextInt(); //ask how much they are selling the vehicle for
				
				if(salePrice < 0) { //input verification
					throw new Exception("Invalid number (Must be a postive value).");
				}else if(salePrice >= 0) {
					//breaks from the "if else block if it is within correct range
				}else {
					throw new InputMismatchException("Not an integer answer.");
				}
				//update new balance
				this.balance += salePrice;
				
				ar.remove(removeChoice); //remove car from inventory
				
				break;
		}
		
	}
	/**
	 * To String Method for Inventory
	 */
	public String toString() {
		return ar.toString();//return toString method of array
	}
}
