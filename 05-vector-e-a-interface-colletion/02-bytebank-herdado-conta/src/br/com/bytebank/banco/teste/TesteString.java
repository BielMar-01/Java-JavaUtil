package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
		String vazio1 = " ";
		String outroVazio = vazio1.trim(); // trim() - tira os espaços do começo e do fim da string
		System.out.println(outroVazio.isEmpty());
		
		String nome = "Alura";
		System.out.println("Contains: " + nome.contains("Alu"));
		
		String outro = nome.replace("A", "a"); 
		System.out.println(nome);
		System.out.println(outro);
		
		char a = 'A';
		char b = 'b';
		String outros = nome.replace(a, b).toUpperCase();
		System.out.println(outros);
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		int d = nome.indexOf("ur");
		System.out.println(d);
		
		String e = nome.substring(1);
		System.out.println(e);
		
		System.out.println("Tamanho do Nome é: " + nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}

}
