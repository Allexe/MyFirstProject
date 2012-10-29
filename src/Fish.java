
public class Fish extends Pet {
	
	int currentDepth=1;
	
	public int dive(int howDeep){
	
		System.out.println("Сейчас я на глубине " + currentDepth + " метров.");
		currentDepth=currentDepth + howDeep;
		
		if (currentDepth > 100) {
			System.out.println("Я маленькая рыбка и не могу плавать глубже 100метров");
			currentDepth=currentDepth-howDeep;
		} else {
			System.out.println("Ныряю на глубину " + howDeep + " метров");
			System.out.println("Я на глубине " + currentDepth + " метров ниже уровня моря!");
		}
		return currentDepth;
		
	}
	
	public String say(String aWord) {
		String FishResponse = "Рыбы не говорят ...";
		return FishResponse;
	}
}
