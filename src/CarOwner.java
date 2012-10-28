
public class CarOwner {

	public static void main(String[] args) {
		int time = 2; // это время в часах
		Car myCar = new Car();
		myCar.start();
		myCar.stop();
		System.out.println("Мы проехали " + myCar.drive(time) + "км со средней скоростью " + time + "км/ч.");
	}

}
