package logika;

import java.util.ArrayList;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlType;
//import javax.xml.bind.annotation.XmlAccessType;


//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "Card")
public class Cart{
	
	//@XmlElement(name = "firstName")
	private ArrayList<Product> list;
	
	public Cart() {
		list=new ArrayList<Product>();
	}

	public void addProduct(Product product){
		list.add(product);
	}
	
	public void removeProduct(Product product){
		list.remove(product);
	}
	
	public void clearTheCart(){
		list.clear();
	}

	public ArrayList<Product> getList() {
		return list;
	}

	public void setList(ArrayList<Product> list) {
		this.list = list;
	}
}