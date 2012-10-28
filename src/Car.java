
public class Car {

	public void start() {
		System.out.println("Поехали :) !");
	}
	
	public void stop(){
		System.out.println("Приехали");
	}
	
	/*
	 howlong - время которое нужно ехать
	 60 - средняя скорость движения
	 */
	public int drive(int howlong) {
		int distance = howlong*60;
		return distance;
	}
	
}
