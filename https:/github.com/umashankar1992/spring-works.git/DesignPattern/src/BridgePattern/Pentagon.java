package BridgePattern;

public class Pentagon extends Shape{
	public Pentagon(IColor color){
		super(color);
		
	}
	public void applyColor(){
		System.out.println("Pentagon  is apply with color");
		getColor().applyColor();
	}

}
