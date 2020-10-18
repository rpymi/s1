package com.company;

import java.util.Scanner;

public class Main {
   static boolean run(int a, int b) {
        int tmp;
        while (b != 0) {
            if (a < b) {
                tmp = a;
                a = b;
                b = tmp;
            }
            tmp = b;
            b = a % b;
            a = tmp;
        }
       if(a==1)
           return true;
       else
           return false;
    }


    public static void main(String[] args) {
       System.out.println(run(2,3));

    }
}
