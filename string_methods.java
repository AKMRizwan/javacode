package com.company;

public class string_methods {
    public static void main(String[] args) {
        String name="   Mohd Rizwan Saifi   ";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(7));
        System.out.println(name.substring(7,15));
        System.out.println(name.replace('R','Z'));
        System.out.println(name.replace("Rizwan","Zeeshan"));
        System.out.println(name.startsWith("   "));
        System.out.println(name.endsWith("   "));
        System.out.println(name.charAt(8));
        System.out.println(name.indexOf("Rizwan"));
        System.out.println(name.indexOf("Saifi",8));
        System.out.println(name.lastIndexOf('R'));
        System.out.println(name.lastIndexOf("Rizwan",22));
        System.out.println(name.equals("Rizwan"));
        System.out.println(name.equalsIgnoreCase("   mOhD rIZwAn saIFi   "));
        System.out.println("\"Mohd\" \"Rizwan\" \"Saifi\"");
    }
}
