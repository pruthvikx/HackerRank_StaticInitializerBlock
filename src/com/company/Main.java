package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static boolean flag = true;
    public static int B = scan.nextInt();
    public static int H = scan.nextInt();
    static {
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
	// write your code here

        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
