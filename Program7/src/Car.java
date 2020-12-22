/**
 * 
 * @author Tyler Fontana 
 * Child class of Vehicle which specifies values associated with model and price while specifying
 * in the to string what typer of vehicle is being printed out.
 */
public class Car extends Vehicle {

	protected int mileage; //specific variable for cars only
	/**
	 * default constructor
	 */
	public Car() {
		this.mileage = 0;
		this.model = "";
		this.price = 0;
	}
	/**
	 * Constructor in which sent values are assigned to price, model, and mileage
	 * @param takes in a value for mileage
	 * @param takes in a value for price
	 * @param takes in a value for model
	 */
	public Car(int mileage, int price, String model) {
		this.mileage = mileage;
		this.model = model;
		this.price = price;
		
	}
	
	@Override
	/**
	 * ToString that is modified to print out car and its respective information 
	 */
	public String toString() {
		return "Car - mileage: " + mileage + "," + super.toString();
	}
}
