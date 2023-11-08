package classi.smartphone;

public class SmartphoneTest {

	public static void main(String[] args) {

		Smartphone smartphone1 = new Smartphone("iPhone", "Apple", 1.300, 4, 2, true);
		Smartphone smartphone2 = new Smartphone("Android", "Samsung", 500, 9, 1, false);
		
		String resSmartphone1 = smartphone1.ottieniTipologiaSmartphone(8);
		String resSmartphone2 = smartphone2.ottieniTipologiaSmartphone(3);
		
		String resSmartphone1a = smartphone1.ottieniFasciaDiPrezzo(1.000);
		String resSmartphone1b = smartphone2.ottieniFasciaDiPrezzo(300);
		
		String info1 = smartphone1.toString();
		String info2 = smartphone2.toString();
		
		System.out.println(resSmartphone1);
		System.out.println(resSmartphone2);
		System.out.println(resSmartphone1a);
		System.out.println(resSmartphone1b);
		System.out.println(info1);
		System.out.println(info2);

		

	}

}
