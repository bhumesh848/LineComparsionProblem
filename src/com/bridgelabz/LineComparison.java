package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Enter x1 coordinate point and y1");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter x2 coordinate point and y2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("x1--> "+x1 + " y1--> "+y1 + " x2--> "+x2 + " y2--> "+ y2);
        double lengthOfLine = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("length of a line is = " + lengthOfLine);
    }
}
