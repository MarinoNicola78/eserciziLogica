package Cicli;

public class MinMin {

	public static void main(String[] args) {

		int[] tmp = {10,3,2,2,3,1,7,8,9,13};
		
		//troviamo il piu piccolo
		int min = tmp[0];
		for (int i = 0; i < tmp.length; i++) {
			if(tmp[i] < min)
			{
				min = tmp[i];
			}
		}
		
		int minSecondo = 0;	
		for (int i = 0; i < tmp.length; i++) {
			if(tmp[i] != min)
			{
				minSecondo = tmp[i];
			}
		}
		
		// troviamo il secondo più piccolo
		for (int i = 0; i < tmp.length; i++) {
			if(tmp[i] < minSecondo && tmp[i] != min)
			{
				minSecondo = tmp[i];
			}
		}
		
		System.out.println("il minimo è:"+min);
		System.out.println("il secondo minimo è:"+minSecondo);		
	}

}
