package logika;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Cashier {
	
	@WebMethod
	public Cart discountCart(Cart cart, double discount){
		for(Product p:cart.getList()){
			double priceBefore=p.getPrice();
			double priceAfter=priceBefore*((100-discount)/100);
			p.setPrice(priceAfter);
		}
		return cart;
	}
	
	@WebMethod
	public double getCartValue(Cart cart){
		double sum=0;
		for(Product p:cart.getList()){
			sum+=p.getPrice()*p.getQuantity();
		}
		return sum;
	}
	
	@WebMethod
	public Product getMostExpensiveProduct(Cart cart){
		double value=0;
		Product mostExpensiveSoFar=null;
		for(Product p:cart.getList()){
			if(p.getPrice()>value){
				value=p.getPrice();
				mostExpensiveSoFar=p;
			}
		}
		return mostExpensiveSoFar;
	}
}