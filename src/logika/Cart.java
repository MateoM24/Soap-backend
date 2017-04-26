package logika;

import java.util.ArrayList;

public class Cart{
	
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