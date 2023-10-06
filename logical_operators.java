package com.company;
import java.util.Scanner;
public class logical_operators {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>56) {
            System.out.println("you are experienced");
        }
            else if(age>46) {
            System.out.println("you are semi-experienced");
        }
                else {
            System.out.println("you are not eligible");
        }
    }
}
