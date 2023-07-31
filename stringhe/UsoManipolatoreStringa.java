package stringhe;

import javax.swing.JOptionPane;

public class UsoManipolatoreStringa {

	
	public static void main(String[] args) {

		String str, str1, str2, str3;
		
		JOptionPane.showMessageDialog(null, "PROGRAMMA SULLE STRINGHE");
		str = JOptionPane.showInputDialog(
				"Digitare una stringa una STRINGA ");

		ManipolatoreStringa ms = new ManipolatoreStringa(str);
		
		str1 = ms.inverti(str);
		
		str2 =ms.rimuoviSpazi(str);
		
		str3 = ms.concatenaCon(str2);
		
		JOptionPane.showMessageDialog(null, "Stringa immessa prima della manipolazione: \n" + str);
		JOptionPane.showMessageDialog(null, "Stringa dopo la prima manipolazione -> inversione: \n" + str1);
		JOptionPane.showMessageDialog(null, "Stringa dopo la seconda manipolazione -> rimozione spazi bianchi: \n" + str2);
		JOptionPane.showMessageDialog(null, "Stringa dopo la terza manipolazione -> concatere le stranghe: \n" + str3);

		JOptionPane.showMessageDialog(null, "PROGRAMMA TERMINATO");

		
		

		
	}

}
