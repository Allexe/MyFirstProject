
public class Fish extends Pet {
	
	int currentDepth=1;
	
	public int dive(int howDeep){
	
		System.out.println("������ � �� ������� " + currentDepth + " ������.");
		currentDepth=currentDepth + howDeep;
		System.out.println("����� �� ������� " + howDeep + " ������");
		System.out.println("� �� ������� " + currentDepth + " ������ ���� ������ ����!");
	
		return currentDepth;
	}
	
	public String say(String aWord) {
		String FishResponse = "���� �� ������� ...";
		return FishResponse;
	}
}
