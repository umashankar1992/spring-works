package FacadePattern;

public class FacadeCar {
	private HatchBack hbc;
	private Sedan sedan;
	private SUV suv;
	public FacadeCar(){
		this.hbc=new HatchBack();
		this.sedan=new Sedan();
		this.suv=new SUV();
		
	}
	public void HatchBackDriver(){
		hbc.drive();
	}
	public void sedanDriver(){
		sedan.drive();
	}
	public void suvDriver(){
	suv.drive();
	}
	

}
