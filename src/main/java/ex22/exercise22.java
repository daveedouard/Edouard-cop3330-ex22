/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex22;

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        System.out.print("Enter the third number: ");
        int third = input.nextInt();

        if(first==second || second==third || first==third){
            System.exit(0);
        }
        else if(first>second && first>third){
            System.out.print("The largest number is "+first);
        }
        else if(second>first && second>third){
            System.out.print("The largest number is "+second);
        }
        else if(third>first && third>second){
            System.out.print("The largest number is "+third);
        }
    }
}
