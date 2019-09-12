//The Item class represents anything that is being sold at the shopping mall.

public abstract class Item {
	private double vat; //represents value added tax for each item
	private double basePrice; //represents the price of the item
	                          //when there is no taxes or profit added.

	//getVat and setVat methods are accessor methods for vat data field
	public double getVat(){
		return vat;
	}
	public void setVat(double vat){
		this.vat = vat;
	}

	//getBasePrice and setBasePrice methods are
	//accessor methods for basePrice data field
	public double getBasePrice(){
		return basePrice;
	}

	public void setBasePrice(double price){
		basePrice = price;
	}

	//calculatePrice abstract method will be implemented in subclasses
	//to calculate the final price of the item.
	public abstract double calculatePrice();

}
