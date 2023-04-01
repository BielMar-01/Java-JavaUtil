package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

	public class TesteColletion {
	
		public static void main(String[] args) {
	
	    Collection<Conta> lista = new Vector<Conta>();
	    
	    Conta cc = new ContaCorrente(22, 11);
	    lista.add(cc);
	
	    Conta cc2 = new ContaCorrente(22, 22);
	    lista.add(cc2);
	    
	    Conta cc3 = new ContaCorrente(22, 33);
	    lista.add(cc3);
	    
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