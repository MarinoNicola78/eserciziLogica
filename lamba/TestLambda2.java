package lamba;

import java.util.Arrays;
import java.util.List;

public class TestLambda2 {

	public static List<String> getName(List<String> lista) {
		// stream + map per iterare + creo la mia nuova List da mandare in output
		System.out.println(lista.stream().map(nome -> "%s".formatted(nome.charAt(0))).toList());
		return lista;

	}

	public static List<String> getName1(List<String> lista) {
		// stream + map (richiamo metodo per chiarezza nel codice)
		System.out.println(lista.stream().map(nome -> upperCase(nome)).toList());
		
		return lista;
		
	}
	
	public static List<String> getName2(List<String> lista) {
		System.out.println(lista.stream()
				.filter(nome -> nome.length() % 2 == 0)
				.map(nome -> "%s".formatted(nome.charAt(0)))
				.toList());

		return lista;
		
	}
	
	private static String upperCase(String nome) {
			String upperCase = nome.toUpperCase();
			
			return "%s ".formatted(upperCase.charAt(0));
	}

	public static void main(String[] args) {

		List<String> lista = Arrays.asList("nicola", "fede", "marco", "fabio", "dexter");

		getName2(lista);

	}

}
