public class Pet {

	int age = 5;
	float weight = 15;
	float height = 120;
	String color = "����� � �������� - white and cool ;) пробую ещё раз!";
	
	public void sleep() {
		System.out.println("��������� ����! �� ������!");
	}
	
	public void eat() {
		System.out.println("� �������, ����� ���������!");
	}
	
	public String say(String aWord) {
		String petResponse = "�� �����! " + aWord;
		return petResponse;
	}
	
	/*
	weight = 15;
	height = 120;
	color = "����� � ��������";
	*/
	
}

