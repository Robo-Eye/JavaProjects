/**
 * 
 * @author Tyler Fontana
 * Parent program of Car and Bicycle, with generic toString
 */
public class Vehicle {
	protected int price;
	protected String model;
	/**
	 * Default Constructor 
	 */
	public Vehicle() {
		this.price = 0;
		this.model = "";
	}
	/**
	 * Default toString that doesn't specify type of vehicle
	 */
	public String toString() {
		return " model: " + model + ", purchase price: " + price ;
	}
	
}
