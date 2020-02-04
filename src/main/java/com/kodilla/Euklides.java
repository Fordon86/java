package com.kodilla;

public class Euklides {
    public static void main (String[] args) {

        int a = 282;
        int b = 78;
        int loop = 1;

        while ( a % b != 0 ){

            int rest = a % b;

            if (rest != 0){

                System.out.println("Loop nr: " + loop);

                a = b;
                System.out.println(" A = " + a);

                b = rest;
                System.out.println(" B = " + b);

                rest = a % b;
                System.out.println("Rest = " + rest);

                loop ++;

            }

            else {

                System.out.println(rest);

            }

        }

        System.out.println(" Greatest common divisor = " + b);

    }
}
