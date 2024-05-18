package classes_methods_attributes.product_management.v1.entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	public int removeQuantity;
	public int addQuantity;
	
	
	public double priceToQuantity() {
		return price * quantity;
	}
	
	public int addProduct() {
		return quantity + addQuantity;
	}
	
	public int removeProduct() {
		return addProduct() - removeQuantity;
	}
	
	public double priceToQuantityAdd() {
		return price * addProduct();
	}
	
	public double priceToQuantityremove() {
		return price * removeProduct();
	}
	
	
	public void viewDataProduct() {
		System.out.println("Produto: "+name);
		System.out.println("Preço: "+price);
		System.out.println("Quantidade: "+quantity);
		System.out.println("Total: "+priceToQuantity());
	}
	
	public void viewDataProductAdd() {
		System.out.println("Produto: "+name);
		System.out.println("Preço: "+price);
		System.out.println("Quantidade: "+addProduct());
		System.out.println("Total: "+priceToQuantityAdd());
	}
	
	public void viewDataProductRemove() {
		System.out.println("Produto: "+name);
		System.out.println("Preço: "+price);
		System.out.println("Quantidade: "+removeProduct());
		System.out.println("Total: "+priceToQuantityremove());
	}
	

}


