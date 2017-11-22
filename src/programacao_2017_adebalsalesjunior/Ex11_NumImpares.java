/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao_2017_adebalsalesjunior;

import java.util.ArrayList;

/**
 *
 * @author Júnior Sales
 */
public class Ex11_NumImpares {
    public static void main(String[] args) {
		List<Integer> numerosImparesList = new ArrayList<Integer>();
		List<Integer> numerosParesList = new ArrayList<Integer>();
		int tamanhoInicial = 1;
		int tamanhoRange = 10;
		int somatoriaDosImparesResult = 0;
		int multiplicacaoDosParesResult = 0;
		for (int i = tamanhoInicial; i <= tamanhoRange; i++) {
			boolean isImpar = i % 2 == 0 ? true : false; 
			switch (valueOf(isImpar)) {
				case 0: numerosImparesList.add(i); break;
				case 1: numerosParesList.add(i);
			}
		}
		for (Integer somatoriaDosImpares : numerosImparesList) {
			somatoriaDosImparesResult = somatoriaDosImparesResult + somatoriaDosImpares;
		}
		for (Integer multiplicacaoDosPares: numerosParesList) {
			if (multiplicacaoDosParesResult != 0) {
				multiplicacaoDosParesResult = multiplicacaoDosParesResult * multiplicacaoDosPares;
			} else{
				multiplicacaoDosParesResult = multiplicacaoDosPares;
			}	
		}
		System.out.println("Resultado multiplicação dos números pares: " + multiplicacaoDosParesResult); 
		System.out.println("Resultado somatória dos números ímpares: " + somatoriaDosImparesResult); 
	}
	public static int valueOf(boolean b){
		return b ? 1 : 0;
	}
}
