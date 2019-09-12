//A Fruit object represents a real-life fruit

public class Fruit extends Food
				   implements Vegan, Washable {

	//calls other constructor with the value 6.0
	public Fruit() {
		this(6.0);
	}

	//sets basePrice to the given value
	public Fruit(double basePrice){
		setBasePrice(basePrice);
	}

	//returns the retail price of the dairy product
	public double calculatePrice(){
		// taxed price + 20% profit
		return ( getBasePrice() * (1 + getVat()) ) * (1 + 0.2);
	}

	public void howToWash(){
		System.out.println("Wash Fruit with cold water.");
	}

	public void madeOf(){
		System.out.println("It is made only of fruits.");
	}

}
