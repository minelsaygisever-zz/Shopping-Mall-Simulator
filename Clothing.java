//The Clothing class represents any piece of clothing

public abstract class Clothing extends Item
							   implements Washable{

	//the constructor to set vat data field to 0.18
	public Clothing() {
		setVat(0.18);
	}

}
