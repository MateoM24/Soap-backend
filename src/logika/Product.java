package logika;

//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlType;
//import javax.xml.bind.annotation.XmlAccessType;

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "Card")
public class Product {
	
	//@XmlElement(name = "name")
	private String name;
	
	//@XmlElement(name = "price")
	private double price;
	
	//@XmlElement(name = "price")
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
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
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