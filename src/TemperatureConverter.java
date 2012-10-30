
public class TemperatureConverter {
	
	public String convertTemp (int temperature, char convertTo) {
		int tempInt = 0;
		
		switch (convertTo) {
			case 'F':
				tempInt = temperature * 2;
				break;
			case 'C':
				tempInt = temperature;
				break;
		}
			
		String tempString = tempInt + " " + convertTo;
		return tempString;
	}
	
	public static void main(String[] args){
		
		TemperatureConverter tc = new TemperatureConverter();
		String ts = tc.convertTemp(10, 'F');
		System.out.println(ts);
		
	}

}
