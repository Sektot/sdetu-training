package basics;

public class Weather {
	public static void main(String[] args) {
		
		int temperature = 20;
		String sunCondition ="Overcast";
		
		if(temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler. Pheraps wear a long-sleeve shirt and jeans.");
			System.out.println("War a hat to keep the sun out of your eyes");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.print("This is a cool day, make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
		
		System.out.println("The program is ending");
	}

}
