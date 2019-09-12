//150116028 Minel SAYGISEVER
//This program is a kind of shopping mall simulator with an OOP approach.

public class Test {

	public static void main(String[] args) {

		//Create a new ShoppingMall object
		ShoppingMall mall = new ShoppingMall();

		//Add a default Dairy, a default Fruit, a default Top, a default Trousers,
		//a default Underware, a default Vegetable object to the ShoppingMall object.
		mall.addDairy();
		mall.addFruit();
		mall.addTop();
		mall.addTrousers();
		mall.addUnderware();
		mall.addVegetable();

		// Add a Top object with basePrice = 100
		mall.addArbitrary(new Top(100.0));

		printContent(mall);
		System.out.println();

		printWashingInstructions(mall);
		System.out.println();

		//Print the bill of the ShoppingMall object
		System.out.println("Total bill is " + mall.bill());

	}

	//invokes madeOf method of the all the Vegan instances
	//inside the ShoppingMall’s ArrayList
	public static void printContent(ShoppingMall mall){
		for (int i = 0; i < mall.getItems().size(); i++){
			//if it is fruit, calls fruit's method
			if(mall.getItems().get(i) instanceof Fruit){
				Fruit f = new Fruit();
				f.madeOf();
			}
			//if it is Vegetable, calls Vegetable's method
			else if(mall.getItems().get(i) instanceof Vegetable){
				Vegetable v = new Vegetable();
				v.madeOf();
			}
		}
	}

	//howToWash method of the all the Washable instances
	//inside the  ShoppingMall’s ArayList
	public static void printWashingInstructions(ShoppingMall mall){
		for (int i = 0; i < mall.getItems().size(); i++){
			//if it is fruit, calls fruit's method
			if(mall.getItems().get(i) instanceof Fruit){
				Fruit f = new Fruit();
				f.howToWash();
			}
			//if it is vegetable, calls vegetable's method
			else if(mall.getItems().get(i) instanceof Vegetable){
				Vegetable v = new Vegetable();
				v.howToWash();
			}
			//if it is trousers, calls trousers' method
			else if(mall.getItems().get(i) instanceof Trousers){
				Trousers t = new Trousers();
				t.howToWash();
			}
			//if it is underware, calls underware's method
			else if(mall.getItems().get(i) instanceof Underware){
				Underware u = new Underware();
				u.howToWash();
			}
			//if it is top, calls top's method
			else if(mall.getItems().get(i) instanceof Top){
				Top t = new Top();
				t.howToWash();
			}
		}
	}

}
