/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao_2017_adebalsalesjunior;

/**
 *
 * @author Júnior Sales
 */
public class Ex03_Matrizes {

       public static void main(String[] args){
  
    int [][] m = new int[2][2];
    
    m[0][0] = 1;
    m[0][1] = 2;
    m[1][0] = 3;
    m[1][1] = 4;
    
           for (int[] m1 : m) {
               for (int j = 0; j < m[0].length; j++) {
                   System.out.print(m1[j] + "");
               }
               System.out.println();
           }        
  }
}
