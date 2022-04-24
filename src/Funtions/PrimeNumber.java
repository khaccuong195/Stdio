package Funtions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        Integer n =sc.nextInt();
      if(isPrime(n))
      {
       System.out.println(n+": prime number");
      }
      else {
          System.out.println(n+": not prime number");
      }
    }
    public static boolean isPrime(Integer n){
        if (n<2){
            return false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
