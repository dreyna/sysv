/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PINAUD;

import java.util.Scanner;

/**
 *
 * @author alum.fial8
 */
public class Emanuel {
    public static void main(String[] args) {      
        System.out.println("Ingese numero:");
        calcularFactorial();
   
    }
    
    public static void calcularFactorial(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); 
        double factorial=1;
        while (num!=0) {
        factorial=factorial*num;
        num--;
        }
        System.out.println("Factorial:"+factorial);
    }
    
}
