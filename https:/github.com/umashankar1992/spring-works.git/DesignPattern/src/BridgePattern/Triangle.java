package BridgePattern;

public class Triangle extends Shape{
	public Triangle (IColor color){
		super(color);
	}
public void applyColor(){
	System.out.println("triangle is apply with color");
	getColor().applyColor();
}
}
