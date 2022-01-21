/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// @author Ajay Virmoti


import java.util.Scanner;

public class PatternsSingleLoop {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         // by using single loop 
         
         /*
            * 
           *** 
          ***** 
         ******* 
        *********
        *********
         *******
          *****
           ***
            *
        
         sum of all spaces and stars = (3n^2-n)/2
         */
        System.out.println("\nBy one loop\n");
        int count = 0;
        int J = 0;//for upper triangle
        int I = 1;//for upper triangle // this is one bcz i start from 1-28

        int P = 0;//for lower triangle
        int Q = 1;//for lower triangle // this is one bcz i start 28-56
        for (int i = 1; i <= (2 * n - 1) * 2 * n; i++) {
            //for iteration of J and I
            J++;
            if (i % (2 * n - 1) == 0) {
                count = J;
                J = 0;
                I++;
            }
            //for upper triangle 
            if (i <= (2 * n - 1) * n) {
                if (i % (2 * n - 1) == 0) {
                    if (I < n + 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                    System.out.println();
                } else {
                    //for space 
                    if (J < (n + 1) - I) {
                        System.out.print(" ");
                    } else {
                        //for stars
                        if (J >= (n) - I && J < n + I) {
                            System.out.print("*");
                        }
                    }
                }
           }
             //for lower triangle
            if (i >= (2 * n - 1) * n) {
                 //for Iteration of P and  Q
                //P iterates from 0-6 
                //Q iterates from 1-4
                if (i % (2 * n - 1) == 0 && i != (2 * n - 1) * n) {
                    count = P;
                    System.out.println();
                    P = 0;
                    Q++;
                }
                //for spaces
                if (P < Q - 1) {
                    System.out.print(" ");
                } else {
                    if (J <= (2 * n - 1) - Q) {
                        System.out.print("*");
                    }
                }
                P++;
            }
        }
        
        
        // Square Printing By one loop in single loop
        /*
        if n=5
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
   
        */
        
        System.out.println("Pattern Square");
        for(int j=1; j<=n*n; j++){
            System.out.print("* ");
        
            if(j%n==0){
                    System.out.println();
            }
            
        }
        
        
        // pattern -3
        /*
        * * * *
        *     *
        *     *
        * * * *

        */
        System.out.println(" Hollow Square ");
        int count2=1;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n || count2==1 || count2==n){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            if(i==n){
                System.out.println();
                count2++;
                i=0;
            }
            if(count2==n+1){
                break;
            }
        }
    }
    
}
