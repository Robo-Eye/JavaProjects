/**
 * 
 * @author Tyler Fontana
 *	Child class of Vehicle which specifies values associated with model and price while specifying
 *  in the to string what typer of vehicle is being printed out.
 */
public class Bicycle extends Vehicle {
	/**
	 * Default constructor
	 */
	public Bicycle() {
		this.model = "";
		this.price = 0;
	}
	/**
	 * Constructor in which sent values are assigned to price and model
	 * @param takes in a value for price
	 * @param takes in a value for model
	 */
	public Bicycle(int price, String model){
		this.price = price;
		this.model = model;
	}

	@Override
	/**
	 * ToString that is modified to print out bicycle and its respective information 
	 */
	public String toString() {
		return "Bicycle -" + super.toString();
	}
}
