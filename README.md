package Anthony;

import java.util.Scanner;

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
