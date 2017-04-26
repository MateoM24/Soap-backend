package logika;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Cashier {
	
	@WebMethod
	public Cart discountCart(Cart cart, double discount) throws NoCartException{
		if(cart==null)throw new NoCartException();
		for(Product p:cart.getList()){
			double priceBefore=p.getPrice();
			double priceAfter=priceBefore*((100-discount)/100);
			p.setPrice(priceAfter);
		}
		System.out.println("SERVER: wywo³ano metodê discountCart by pomniejszyc ceny prodktów w koszyku o "+discount+"%");
		System.out.println("discount = "+discount);
		return cart;
	}
	
	@WebMethod
	public double getCartValue(Cart cart) throws NoCartException{
		if(cart==null)throw new NoCartException();
		double sum=0;
		for(Product p:cart.getList()){
			sum+=p.getPrice()*p.getQuantity();
		}
		System.out.println("SERVER: wywo³ano metodê getartValue, która zwróci³a wartoœæ = "+sum);
		return sum;
	}
	
	@WebMethod
	public Product getMostExpensiveProduct(Cart cart) throws NoCartException{
		if(cart==null)throw new NoCartException();
		double value=0;
		Product mostExpensiveSoFar=null;
		for(Product p:cart.getList()){
			if(p.getPrice()>value){
				value=p.getPrice();
				mostExpensiveSoFar=p;
			}
		}
		System.out.println("SERVER: wywo³ano metodê getMostExpensiveProduct która zwróci³a taki produkt:");
		System.out.println(mostExpensiveSoFar);
		return mostExpensiveSoFar;
	}
}