/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrighytCCana;

import java.math.*;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BrighytCcana {
    public static void main(String[] args)
    {
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese un numero");
        num=sc.nextInt();
        
        BigInteger fact=new BigInteger("1");
        for(int i=1; i<=num; i++){
            fact=fact.multiply(new BigInteger(i+""));
        }
        System.out.println("factorial: "+fact);
    }
    
}
