//A Top object represents a real-life top clothing
public class Top extends Clothing{

	//calls other constructor with the value 20.0
	public Top(){
		this(20.0);
	}

	//sets basePrice to the given value
	public Top(double basePrice){
		setBasePrice(basePrice);
	}

	//returns the retail price of the dairy product
	public double calculatePrice(){
		// taxed price + 20% profit
		return ( getBasePrice() * (1 + getVat()) ) * (1 + 0.2);
	}

	public void howToWash(){
		System.out.println("Wash Top at 40 degrees.");
	}

}
