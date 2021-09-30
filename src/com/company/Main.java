package com.company;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        //System.out.println(number);

        String tempNum = "";

        for (int i = 1; i < number + 1; i++) {
            tempNum +=i;
            System.out.println(tempNum);
        }

        for (int  i = number; i > 1; i--) {
            tempNum = "";
            for (int j = 1; j < i; j++){
                tempNum += j;
            }
            System.out.println(tempNum);
        }
    }
}
