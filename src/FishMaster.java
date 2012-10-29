
public class FishMaster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fish myFish = new Fish();
		myFish.dive(95);
		myFish.dive(6);
		myFish.sleep();
		System.out.println(myFish.say("Hi!"));
		System.out.println("Да-да, я буду спать на глубине " + myFish.currentDepth + " метров!");
		
	}

}
