package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(23, 11);
		contas[1] = cc2;
		
		ContaCorrente cc3 = new ContaCorrente(24, 11);
		contas[2] = cc3;
		
		ContaCorrente cc4 = new ContaCorrente(25, 11);
		contas[3] = cc4;
		
		ContaCorrente cc5 = new ContaCorrente(26, 11);
		contas[4] = cc5;
		
		System.out.println(contas[1].getAgencia());
		
		ContaCorrente ref = contas[1];
	}

}
