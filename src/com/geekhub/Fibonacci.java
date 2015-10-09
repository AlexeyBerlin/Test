package com.geekhub;

import java.util.Scanner;

/**
 * Created by Alex on 10/8/2015.
 */

public class Fibonacci {
    public void printFibonacciSequence() {
        int n;
        int F0 = 0;
        int F1 = 1;
        int Fn;

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter \"n\" (number of elements in fibonacci sequence)");
        n = input.nextInt();
        System.out.println(".......................");

        if(n < 2){
            System.out.println("Please enter n >= 2 ");
        }
        else{
            System.out.print(F1 + " ");
            for(int i = 0; i < n-1; i++){
                Fn =  F0 + F1;
                System.out.print(Fn + " ");
                F0 = F1;
                F1 = Fn;
            }
        }
    }
}
