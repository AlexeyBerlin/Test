package com.geekhub;

import java.util.Scanner;

/**
 * Created by Alex on 10/8/2015.
 */

public class Converter {
    public void convertDigitToWord() {
        int digit;
        String arrayOfWords[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter digit to convert");
        digit = input.nextInt();

        if(digit < 0 || digit > 9){
            System.out.print("Please, enter digit >= 0 and <= 9");
        }else{
            System.out.print(digit + " -> " + arrayOfWords[digit]);
        }
    }
}
