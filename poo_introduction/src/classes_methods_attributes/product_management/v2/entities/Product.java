package classes_methods_attributes.product_management.v2.entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	
	public double priceToQuantity() {
		return price * quantity;
	}
	
	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeQuantity(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
				
		return "Name: "+ name+
				"\nPrice: $"+String.format("%.2f", price)+
				"\nQuantity: "+quantity+
				"\nTotal: $"+String.format("%.2f", priceToQuantity());
				
	}

}
