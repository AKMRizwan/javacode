package com.company;
import java.util.Scanner;
public class cwh_16_conditionals {
    public static void main(String[] args) {
        System.out.println("enter your age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18)
        {
            System.out.println("you are eligible");
        }
        else{
            System.out.println("no, you are not eligible");
        }
    }
}
