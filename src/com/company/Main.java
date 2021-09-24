package com.company;

import java.sql.SQLOutput;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(number);

        String tempNum = "";

        for (int i = 0; i < number; ++i) {
            //System.out.println(i);
            tempNum +=i;
            System.out.println(tempNum);
        }
    }
}
