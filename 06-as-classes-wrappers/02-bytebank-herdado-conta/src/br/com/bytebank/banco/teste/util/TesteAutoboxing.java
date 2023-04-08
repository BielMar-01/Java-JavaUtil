package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteAutoboxing {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		
		//int idade = 29; //Integer
		Integer idadeRef = new Integer(29); // Correto a se fazer
		
		//List numeros = new ArrayList();
		List<Integer> numeros = new ArrayList<Integer>(); // Correto a se fazer
		
		
		//numeros.add(idade);
		numeros.add(idadeRef); // Correto a se fazer

		//Autoboxing é a transformação de um primitivo para um objeto
	}

}
