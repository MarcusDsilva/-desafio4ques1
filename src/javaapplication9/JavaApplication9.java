/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double p, e, m;
     e =0;
     m = 0; 
    Scanner ler = new Scanner(System.in);
     System.out.println("peso do peixe:");
     p = ler.nextDouble();
     if (p > 50){
         System.out.println("Voce pagara uma multa");
         e = p - 50;
         m = e * 4;
      System.out.println("Voce pescou acima do estabelecido");
     }
    System.out.println("Peso:"+p+" \nExcesso:"+e+"\nMulta:" +m);
    }
}

