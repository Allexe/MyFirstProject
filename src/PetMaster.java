
public class PetMaster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String petReaction;
		Pet myPet = new Pet();
		myPet.eat();
		petReaction = myPet.say("���! ���!!");
		System.out.println(petReaction);
		myPet.sleep();
		System.out.println("������ ����� ���������� � ����, ��� - � " + myPet.color + " ;)");

	}

}
