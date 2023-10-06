package com.company;

public class practice_set_string {
    public static void main(String[] args) {
        //problem 1
        String str1="Mohd Rizwan Saifi";
        System.out.println(str1);
        System.out.println(str1.toLowerCase());
        //problem 2
        System.out.println(str1.replace(" ","_"));
        //problem 3
        String str2 = "Dear <|name|>,Thanks a lot";
        System.out.println(str2);
        System.out.println(str2.replace("<|name|>","Rizwan"));
        //problem 4
        String str3="My Name  is Mohd   Rizwan  Saifi";
        System.out.println("index of double spaces");
        System.out.println(str3.indexOf("  "));
        System.out.println("index of tripple spaces");
        System.out.println(str3.indexOf("   "));
        //problem 5
        String str4="Dear Rizwan,\n\tThis course is nice.\nThanks";
        System.out.println(str4);

    }
}
