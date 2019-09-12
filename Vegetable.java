//A Vegetable object represents a real-life vegetable
public class Vegetable extends Food
					   implements Vegan, Washable{
	//calls other constructor with the value 10.0
	public Vegetable(){
		this(10.0);
	}

	//sets basePrice to the given value
	public Vegetable(double basePrice){
		setBasePrice(basePrice);
	}

	public double calculatePrice(){
		// taxed price + 25% profit
				return ( getBasePrice() * (1 + getVat()) ) * (1 + 0.25);
	}

	public void howToWash(){
		System.out.println("Wash Vegetable with warm water.");
	}

	public void madeOf(){
		System.out.println("It is made only of vegetables.");
	}

}
