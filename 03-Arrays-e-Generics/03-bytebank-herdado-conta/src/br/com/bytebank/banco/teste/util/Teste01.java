package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste01 {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println("Tamanho: "  + lista.size());
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        
        Conta cc3 = new ContaCorrente(33, 44);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(44, 33);
        lista.add(cc4);
        
        System.out.println("Tamanho: "  + lista.size());
        
        for(int i = 0; i < lista.size(); i++) {
        	Object oRef = lista.get(i);
        	System.out.println(oRef);
        }
        
        System.out.println("---------------------------");
        
        for(Object oRef : lista) {
        	System.out.println(oRef);
        }

	}

}
