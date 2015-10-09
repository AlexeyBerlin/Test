package com.geekhub;

import java.util.Scanner;

/**
 * Created by Alex on 10/8/2015.
 */

public class Factorial {
    public void findFactorial(){
        int n;
        int factorial = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter \"n\" ");
        n = input.nextInt();
        System.out.println(".......................");

        if(n < 0){
            System.out.println("Please, enter n >= 0");
        }
        else if(n == 0) {
            System.out.println("factorial of "+ n + " is: 1");
        }
        else {
            for(int i = 1; i <= n; i++){
                factorial = factorial * i;
            }
            System.out.println("factorial of "+ n + " is: " + factorial);
        }
    }
}

