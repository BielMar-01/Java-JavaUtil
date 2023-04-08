package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteAutoboxing2 {

	public static void main(String[] args) {
		
		int idade = 29;
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		
		int valor = idadeRef.intValue();
		String s = args[0];
		Integer numero = Integer.valueOf(s);
		System.out.println(numero);
		int numero2 = Integer.parseInt(s);
		System.out.println(numero2);
		
		List<Integer> numeros = new ArrayList<Integer>(); 
		numeros.add(29);
	}

}
