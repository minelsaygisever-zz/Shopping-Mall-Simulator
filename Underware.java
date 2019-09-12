//An Underware object represents a real-life underware
public class Underware extends Clothing {

	//calls other constructor with the value 30.0
	public Underware(){
		this(30.0);
	}

	//sets basePrice to the given value
	public Underware(double basePrice){
		setBasePrice(basePrice);
	}

	public double calculatePrice(){
		// taxed price + 45% profit
				return ( getBasePrice() * (1 + getVat()) ) * (1 + 0.45);
	}

	public void howToWash(){
		System.out.println("Wash Underware at 60 degrees.");
	}

}
