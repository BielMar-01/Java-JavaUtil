package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayCast {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cp1 = new ContaPoupanca(23, 11);
		referencias[1] = cp1;
		
		// Object referenciaGenerica = contas[1];
		// System.out.println(referenciaGenerica.getNumero()); // Precisa fazer um cast
		
		Conta ref = (ContaPoupanca) referencias[1];
		System.out.println( ref.getAgencia());
		
		ContaCorrente ref1 = (ContaCorrente) referencias[0];
		System.out.println(ref1.getAgencia());
	}

}
