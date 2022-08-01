package br.com.bytebank.banco.teste;

public class TesteArray {

	//Array
	public static void main(String[] args) {
		
		int[]idades = new int[5];
		
		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idade1 = idades[1];
		System.out.println(idade1);
		
		System.out.println(idades.length);
		
		//int idade40 = idades[40];
		//System.out.println(idade40);
		
		System.out.println("----Começo do laço----");
		
		for(int i = 0; i< idades.length; i++) {
			System.out.println(i);
		}
		
		System.out.println("----Começo do laço das idades----");
		
		for(int i = 0; i< idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
