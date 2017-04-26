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
		System.out.println("SERVER: wywo�ano metod� discountCart by pomniejszyc ceny prodkt�w w koszyku o "+discount+"%");
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
		System.out.println("SERVER: wywo�ano metod� getartValue, kt�ra zwr�ci�a warto�� = "+sum);
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
		System.out.println("SERVER: wywo�ano metod� getMostExpensiveProduct kt�ra zwr�ci�a taki produkt:");
		System.out.println(mostExpensiveSoFar);
		return mostExpensiveSoFar;
	}
}