
public class Fish extends Pet {
	
	int currentDepth=1;
	
	public int dive(int howDeep){
	
		System.out.println("������ � �� ������� " + currentDepth + " ������.");
		currentDepth=currentDepth + howDeep;
		
		if (currentDepth > 100) {
			System.out.println("� ��������� ����� � �� ���� ������� ������ 100������");
			currentDepth=currentDepth-howDeep;
		} else {
			System.out.println("����� �� ������� " + howDeep + " ������");
			System.out.println("� �� ������� " + currentDepth + " ������ ���� ������ ����!");
		}
		return currentDepth;
		
	}
	
	public String say(String aWord) {
		String FishResponse = "���� �� ������� ...";
		return FishResponse;
	}
}
