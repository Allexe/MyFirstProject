
public class FishMaster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fish myFish = new Fish();
		myFish.dive(2);
		myFish.dive(3);
		myFish.sleep();
		System.out.println("��-��, � ���� ����� �� ������� " + myFish.currentDepth + " ������!");
		
	}

}
