/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao_2017_adebalsalesjunior_marciopPiter;

import java.util.Scanner;

/**
 *
 * @author Júnior Sales
 */
public class Ex09_MaiorNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor[] = new int[4];
        int maior = 0, menor = 0;
        for (int i = 0; i < valor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valor[i] = sc.nextInt();
            if (valor[i] > maior) {
                maior = valor[i];
            }
        }
        for (int j = 0; j < valor.length; j++) {
            if (valor[j] < menor) {
                menor = valor[j];
            }
        }
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);
    }
}
