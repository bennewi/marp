package com.company;

public class SwingForm {

    static int mynum = 3;

    static {
        mynum = 5555;
    }

    public static void main(String[] args) {
        System.out.println(mynum);
    }
}
