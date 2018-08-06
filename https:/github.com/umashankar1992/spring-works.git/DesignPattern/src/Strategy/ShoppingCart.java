package Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> itms;
	public ShoppingCart(){
		this.itms=new ArrayList<Item>();
		
	}
	public void addItem(){
		this.itms.add((Item) itms);
	}
	public void removeItem(){
		this.itms.remove(itms);
		
	}
	public void midifyItemCoutn(Item item){}
	
	public int calculateTotal(){
		int sum=0;
		for (Item item : itms) {
			sum=sum+itms.g;
			
		}
		return sum;
	}
	public void checkOut(Payment paymentStrategy){
		paymentStrategy.pay(calculateTotal());
	}

}
