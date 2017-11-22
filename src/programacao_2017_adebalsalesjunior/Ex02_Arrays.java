/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao_2017_adebalsalesjunior;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Júnior Sales
 */
public class Ex02_Arrays {
    public static void main(String args[]) {
  List<Integer> lista = new ArrayList<>();
        //ele vai adicionar 5 elementos aqui 1, 2, 3, 4, 5
        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }

        int soma = 0;
        for (int b : lista){
            soma += b * b;
            System.out.println("Valor da lista: " + b + " seu quadrado: " + (b * b));
        }
        System.out.println("Soma total: " + soma);
    }   }
