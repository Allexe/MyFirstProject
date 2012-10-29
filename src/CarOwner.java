
public class CarOwner {

	public static void main(String[] args) {
		int time = 2; // это время в часах
		//Car myCar = new Car();
		JBCar myCar = new JBCar();
		myCar.start();
		myCar.stop();
		System.out.println("Мы проехали " + myCar.drive(time) + "км за " + time + " часа!");
	}

}
