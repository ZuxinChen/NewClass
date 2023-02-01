
package com.mycompany.newclass;

/**
 *
 * @author user
 */
/*
    This program finds the prime number from 0 to n
    and then sums all numbers that have digit 5.
*/
public class newClass {
    public static void main(String[] args) {
        
        newClass nc = new newClass();
        int n = 1500;
        int sum = 0;
        
        System.out.println("These are Prime numbers that have "
                + "digit 5 bewteen 2  " + n + ": ");
        
        for(int i = 2; i <= n; ++i){
            
            // when number is prime go to check the digit 5
            if(nc.checkPrime(i)){
                
                //do not print the prime number without digit 5
                if(nc.findDigit5(i)!= 0){
                    System.out.print(nc.findDigit5(i) + " " );
                }
                //add all the numbers but the number without digit 5 is 0
                sum +=nc.findDigit5(i);  
            }
        }
        System.out.println("\nSum: "+sum);
   
    }
    
    // check the number is prime
    boolean checkPrime(int num){       
        for(int i=2; i<=num/2; ++i){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    // find the digits 5 from prime numbers
    int findDigit5(int num){
        int origin = num;        
        int digit;   
        while(num > 0){
            digit = num%10;      
            // if number have digit 5 that return orgin number
            if(digit == 5){
                return origin; 
            }
            num/=10;
        }
        return 0;
    }
}


