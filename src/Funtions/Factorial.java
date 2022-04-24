package Funtions;

import java.awt.*;
import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        if (n==1){
            return 1;
        }
        else {
        return (n*factorial(n-1));
        }
    }
    static int sumArray(int m[],int n){
        if (n==1){
            return m[0];
        }else {
            return m[n-1]+sumArray(m,n-1);
        }
    }
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap b,a");
        int b=sc.nextInt();
        sc.nextLine();
        int a=sc.nextInt();
        int m [] = new int [a];
        System.out.println("nhap vao mang");
        for (int i=0;i<m.length;i++){
            m[i]=sc.nextInt();
        }
        System.out.println("Factorial:"+factorial(b));
        System.out.println("Sum:"+sumArray(m,a));
    }

}
