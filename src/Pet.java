
public class Pet {

	int age = 5;
	float weight = 15;
	float height = 120;
	String color = "белый и пушистый - white and cool ;)";
	
	public void sleep() {
		System.out.println("Спокойной ночи! До завтра!");
	}
	
	public void eat() {
		System.out.println("Я голоден, давай перекусим!");
	}
	
	public String say(String aWord) {
		String petResponse = "Ну ладно! " + aWord;
		return petResponse;
	}
	
	/*
	weight = 15;
	height = 120;
	color = "белый и пушистый";
	*/
	
}

