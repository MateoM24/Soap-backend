package logika;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Product {
	
	private String name;
	
	private double price;
	
	private int quantity;
	
	public Product(){}
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + (new DecimalFormat("#,##0.00").format(new BigDecimal(price))) + ", quantity=" + quantity + "]";
	}
	
	@Override
	public boolean equals(Object otherProduct){
		if(otherProduct==null)return false;
		Product otherOne=(Product)otherProduct;
		if(this.name.equals(otherOne.getName())){
			return true;
		}else{
			return false;	
		}
	}
}