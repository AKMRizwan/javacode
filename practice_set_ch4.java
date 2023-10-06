package com.company;
import java.util.Scanner;
public class practice_set_ch4 {

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("* Problem 1");
        System.out.println("\n");
        int a=10;
        if(a==11) {
            System.out.println("i'm eleven");
        }
        else {
          System.out.println("i'm not eleven!");
        }
        System.out.println("\n");
        System.out.println("* Problem 2");
        System.out.println("\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name:");
        String str=sc.nextLine();
        System.out.println("Enter standard of "+str);
        int std=sc.nextInt();
        System.out.println("Enter maximum marks:");
        int max=sc.nextInt();
        System.out.println("Enter maximum marks of each subject:");
        int submax=sc.nextInt();
        System.out.println("Enter Physics marks:");
        int m1=sc.nextInt();
        double phyper=(double)(m1*100)/submax;
        System.out.println("% obtained in Physics:");
        System.out.println(phyper);
        System.out.println("Enetr Chemistry marks:");
        int m2=sc.nextInt();
        double chemper=(double)(m2*100)/submax;
        System.out.println("% obtained in chemistry:");
        System.out.println(chemper);
        System.out.println("Enetr Mathematics marks:");
        int m3=sc.nextInt();
        double mathper=(double)(m3*100)/submax;
        System.out.println("% obtained in mathematics:");
        System.out.println(mathper);
        int sum=m1+m2+m3;
        System.out.println("Total marks obtained: ");
        System.out.println(sum);
        double percentage=(double)(sum*100)/max;
        System.out.println("Overall % obtained by student is:");
        System.out.println(percentage);
        System.out.println("\n");
        System.out.println("Criteria for PASS or FAIL");
        System.out.println("-------------------------");
        System.out.println("\n");
        System.out.println(" => Student should obtaine 33% in each subject");
        System.out.println(" => student should obtaine overall 40% \n");
        if(phyper>=33&&chemper>=33&&mathper>=33&&percentage>=40) {
            System.out.println(" Student is passed in each subject with "+phyper +"% in Physics, " + +chemper+"% in Chemistry, " +mathper+"% in Mathematics.");
            System.out.println("Student is passed in overall percentage with "+percentage+"%");
        }
        else{
            System.out.println("sSorry! Better luck next time.");
        }
        System.out.println("\n");
        System.out.println("* Problem 3");
        System.out.println("\n");

        Scanner cs=new Scanner(System.in);
        System.out.println("Please enter your income in lakhs per annum:");
        float income = cs.nextFloat();
        float tax=0;
        if (income<=2.5f) {
            tax = tax + 0;
        } else if (income>2.5f&&income<=5.0f) {
            tax=tax+.05f*(income-2.5f);
        } else if (income>5.0f&&income<=10.0f) {
            tax=tax+.05f*(5.0f-2.5f);
            tax=tax+.2f*(income-5.0f);
        } else if (income>10.0f) {
            tax=tax+.05f*(5.0f-2.5f);
            tax=tax+.2f*(10.0f-5.0f);
            tax=tax+.3f*(income-10.0f);
        }
        System.out.println("Your tax amount is : "+tax+" Lakhs");

        System.out.println("\n");
        System.out.println("* Problem 4");
        System.out.println("\n");

        Scanner scc=new Scanner(System.in);
        System.out.println("Please enter your no. to find out the day:");
        int day= scc.nextInt();
        switch(day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
        }

        System.out.println("\n");
        System.out.println("* Problem 5");
        System.out.println("\n");


        Scanner css=new Scanner(System.in);
        System.out.println("Please enter your website:");
        String website=css.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an organizational website.");
        } else if (website.endsWith(".com")){
            System.out.println(" This is a commercial website.");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website.");
        }
        else {
            System.out.println("sorry! Incorrect website.");
        }

        System.out.println("\n");
        System.out.println("* Problem 6");
        System.out.println("\n");


        Scanner sccc=new Scanner(System.in);
        System.out.println("Please enter current year :");
        int currentyear=sccc.nextInt();
        System.out.println("Please enter your year to check :");
        int year= sc.nextInt();

        if (year<currentyear) {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " was a leap year");
                    } else {
                        System.out.println(year + " was not a leap year");
                    }
                } else {
                    System.out.println(year + " was a leap year");
                }
            } else {
                System.out.println(year + " was not a leap year");
            }
        }
        else if (year==currentyear) {

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year");
                    } else {
                        System.out.println(year + " is not a leap year");
                    }
                } else {
                    System.out.println(year + " is a leap year");
                }
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
        else if(year>currentyear){

                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println(year + " will be a leap year");
                        } else {
                            System.out.println(year + " will not be a leap year");
                        }
                    } else {
                        System.out.println(year + " will be a leap year");
                    }
                } else {
                    System.out.println(year + " will not be a leap year");
                }
            }


    }
}
