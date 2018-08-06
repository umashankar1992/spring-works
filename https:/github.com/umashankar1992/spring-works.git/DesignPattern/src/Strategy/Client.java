package Strategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> itesm=Stream.of(
				new Item("ITM01-Pen",30,4),
				new Item("ITM01-Book",30,4),
				new Item("ITM01-Bottle",80,5)
				).collect(Collectors.toList());
				
			ShoppingCart shoppingCart=new ShoppingCart();
			shoppingCart.addItem(new Item("ITM01-Pen", 50, 2));
			shoppingCart.addItem();
			shoppingCart.addItem(new Item("ITM01-Book",30,4));
			shoppingCart.addItem(new Item("ITM01-Bottle",80,5));
			System.out.println("Total Amount"+shoppingCart.calculateTotal());
			Payment paymentStrategy=new EWallet("uma1452@gmail.com", "secert@123", CCAvenue);
			System.out.println("checking out with");
			for (Item item : shoppingCart.getItems) {
				
			}
			shoppingCart.checkOut(paymentStrategy);
					
	}

}
