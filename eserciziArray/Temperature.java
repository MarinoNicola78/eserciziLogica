package eserciziArray;

public class Temperature {

	public static void main(String[] args) {

		double[] temperature = { 18.0, 19.5, 20.0, 21.0, 22.3, 24.0, 23.6,22.8, 22.9, 20.5, 19.2, 18.7 };
		double mediaTemperature = 0;
		double sommaTemperature = 0;

		for (int i = 0; i < temperature.length; i++) {
			sommaTemperature += temperature[i];
		}
		mediaTemperature = sommaTemperature / temperature.length;
		System.out.println("media temperature: " + mediaTemperature);

		for (int i = 0; i < temperature.length; i++) {
			if (temperature[i] < mediaTemperature) {
				System.out.println(temperature[i] + " inferiore alla media");
			} else
				System.out.println(temperature[i] + " superiore o uguale alla media");
		}
	}
}
