//150116028 Minel SAYGISEVER
//This program is a kind of shopping mall simulator with an OOP approach.

//A ShoppingMall object represents a shopping malls
import java.util.*;

public class ShoppingMall {

	//The data field items keeps all the items in the shopping mall
	private ArrayList<Item> items = new ArrayList<Item>();

	//getItems method is getter for items ArrayList
	public ArrayList<Item> getItems(){
		return items;
	}

	//addDairy method adds a default Dairy object to items ArrayList
	public void addDairy(){
		items.add(new Dairy());
	}

	//addFruit method adds a default Fruit object to items ArrayList
	public void addFruit(){
		items.add(new Fruit());
	}

	//addTop method adds a default Top object to items ArrayList.
	public void addTop(){
		items.add(new Top());
	}

	//addTrousers method adds a default Trousers object to items ArrayList
	public void addTrousers(){
		items.add(new Trousers());
	}

	//addUnderware method adds a default Underware object to items ArrayList.
	public void addUnderware(){
		items.add(new Underware());
	}

	//addVegetable method adds a default Vegetable object to  items ArrayList
	public void addVegetable(){
		items.add(new Vegetable());
	}

	//addArbitrary method adds the given Item object to  items ArrayList.
	public void addArbitrary(Item item){
		items.add(item);
	}

	//calculates the total price of  items in the ArrayList
	public double bill(){
		double bill = 0;

		for(int i = 0; i < items.size(); i++){
			bill += items.get(i).calculatePrice();
		}

		return bill;
	}

}
