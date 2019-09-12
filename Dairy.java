//A Dairy object represents a dairy product

public class Dairy extends Food {

	//calls other constructor with the value 8.0
	public Dairy(){
		this(8.0);
	}

	//sets basePrice to the given value.
	public Dairy(double basePrice){
		setBasePrice(basePrice);
	}

	//returns the retail price of the dairy product
	public double calculatePrice(){
		// taxed price + 30% profit
		return ( getBasePrice() * (1 + getVat()) ) * (1 + 0.3);
	}

}
