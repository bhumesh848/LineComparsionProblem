package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Double lengthOfLine1 = getLengthOfLine();
        System.out.println("Length of line 1 is " + lengthOfLine1);

        Double lengthOfLine2 = getLengthOfLine();
        System.out.println("Length of line 2 is " + lengthOfLine2);

//       if (lengthOfLine1.equals(lengthOfLine2)){
//           System.out.println("Two lines are equal");
//       }else {
//           System.out.println("Two lines are not equal");
//       }

        int result = Double.compare(lengthOfLine1,lengthOfLine2);
        if (result == 0){
            System.out.println("Two Lines are equal");
        } else if (result < 0) {
            System.out.println("Line 1 is smaller then line 2");
        }
        else {
            System.out.println("Line 1 is greater then line 2");
        }
    }


    private static double getLengthOfLine() {
        System.out.println("Enter x1 coordinate point and y1");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter x2 coordinate point and y2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("x1--> " + x1 + " y1--> " + y1 + " x2--> " + x2 + " y2--> " + y2);
        double lengthOfLine = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("length of a line is = " + lengthOfLine);
        return lengthOfLine;
    }
}
