
public class Car {

	public void start() {
		System.out.println("������� :) !");
	}
	
	public void stop(){
		System.out.println("��������");
	}
	
	/*
	 howlong - ����� ������� ����� �����
	 60 - ������� �������� ��������
	 */
	public int drive(int howlong) {
		int distance = howlong*60;
		return distance;
	}
	
}
