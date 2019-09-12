//A Top object represents a real-life top clothing
public class Trousers extends Clothing{

	//calls other constructor with the value 40.0
	public Trousers(){
		this(40.0);
	}

	// sets basePrice to the given value
	public Trousers(double basePrice){
		setBasePrice(basePrice);
	}

	public double calculatePrice(){
		// taxed price + 20% profit
		return ( getBasePrice() * (1 + getVat()) ) * (1 + 0.2);
	}

	public void howToWash(){
		System.out.println("Wash Trousers at 30 degrees.");
	}

}
