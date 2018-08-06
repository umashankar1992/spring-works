package FacadePattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeCar myCar=new FacadeCar();
		myCar.HatchBackDriver();
		myCar.sedanDriver();
		myCar.suvDriver();

	}

}
