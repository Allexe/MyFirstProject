
public class CarOwner {

	public static void main(String[] args) {
		int time = 2; // ��� ����� � �����
		Car myCar = new Car();
		myCar.start();
		myCar.stop();
		System.out.println("�� �������� " + myCar.drive(time) + "�� �� ������� ��������� " + time + "��/�.");
	}

}
