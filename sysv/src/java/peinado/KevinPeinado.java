/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peinado;

import java.util.Scanner;

/**
 *
 * @author alum.fial8
 */
public class KevinPeinado {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int n= sc.nextInt();
        System.out.println("El resultado es: " + calcularFactorial(n));
        
    }
    
    public static int calcularFactorial(int numero){
        int res = 1;
        
        for (int i = 1; i <= numero; i++) {
            res *= i;
        }
        return res;
    }
}
