package Strategy;

public class Item {
	private String itmCode;
	private int price;
	private int qty;
	public Item(String itmCode, int price, int qty) {
		super();
		this.itmCode = itmCode;
		this.price = price;
		this.qty = qty;
	}
	public String getItmCode() {
		return itmCode;
	}
	public void setItmCode(String itmCode) {
		this.itmCode = itmCode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Item [itmCode=" + itmCode + ", price=" + price + ", qty=" + qty + "]";
	}
	

}
