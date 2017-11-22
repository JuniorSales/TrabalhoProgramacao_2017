/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao_2017_adebalsalesjunior;

import java.util.Scanner;

/**
 *
 * @author Júnior Sales
 */
public class Ex13_MediaAluno {
        public static float media(float... valores){
        float media=0;
        
        for(float valor: valores){
            media +=valor;
        }
        
        return media/valores.length;
    }
    
    public static float maiorNota(float nota1, float nota2, float nota3){
        
        if(nota1 >= nota2){
            if(nota1 >= nota3)
                return nota1;
        }else{
            if(nota2 >= nota3)
                return nota2;
        }
        return nota3;
            
    }
    
    public static float menorNota(float nota1, float nota2, float nota3){
        
        if(nota1 <= nota2){
            if(nota1 <= nota3)
                return nota1;
        }else{
            if(nota2 <= nota3)
                return nota2;
        }
        return nota3;
            
    }

    public static void main(String[] args){
            float nota1, nota2, nota3;
            Scanner entrada = new Scanner(System.in);
            
            System.out.print("Entre com o valor 1: ");
            nota1 = entrada.nextFloat();
            System.out.print("Entre com o valor 2: ");
            nota2 = entrada.nextFloat();
            System.out.print("Entre com o valor 3: ");
            nota3 = entrada.nextFloat();
            
            System.out.println("Sua maior nota foi: "+maiorNota(nota1,nota2,nota3));
            System.out.println("Sua menor nota foi: "+menorNota(nota1,nota2,nota3));
            System.out.println("Sua média com as três notas é: " + media(nota1,nota2,nota3));
            System.out.println("Sua média sem a menor nota é: "+ (nota1+nota2+nota3 - menorNota(nota1,nota2,nota3))/2);
            
        }
}