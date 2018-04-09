/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puma_Paco;

import java.util.Scanner;

/**
 *
 * @author alum.fial8
 */
public class DiegoPuma {
   
    public static void main (String [ ] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese  numero");
        int numero=sc.nextInt();
        DiegoPuma.calcularFactorial(numero);
        }
    
    public static void calcularFactorial( int a){
        int resultado=1;
        for (int i = 1; i <=a ;i++) {
            resultado*=i;
        }
        System.out.println(resultado);
    }
    
}
