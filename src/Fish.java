
public class Fish extends Pet {
	
	int currentDepth=1;
	
	public int dive(int howDeep){
	
		System.out.println("—ейчас € на глубине " + currentDepth + " метров.");
		currentDepth=currentDepth + howDeep;
		System.out.println("Ќыр€ю на глубину " + howDeep + " метров");
		System.out.println("я на глубине " + currentDepth + " метров ниже уровн€ мор€!");
	
		return currentDepth;
	}
	
	public String say(String aWord) {
		String FishResponse = "–ыбы не говор€т ...";
		return FishResponse;
	}
}
