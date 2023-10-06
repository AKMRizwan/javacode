package com.company;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        System.out.println("please enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are an adult");
                break;
            case 23:
                System.out.println("you are eligible for marriage");
                break;
            case 26:
                System.out.println("you are eligible for job");
                break;
            default:
                System.out.println("enjoy your life");
        }
        System.out.println("thanks for using my code!");
    }
}
