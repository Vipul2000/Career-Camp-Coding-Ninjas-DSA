/*question:-Write a program to input a name(as a single character) and marks of
  three tests as m1, m2, and m3 of a student considering all the three marks
  have been given in integer format. */


package QuestionSolution;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {

        int m1,m2,m3;
        Scanner s=new Scanner(System.in);
        String str=s.next();
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        int avg=(m1+m2+m3)/3;
        System.out.println(str);
        System.out.print(avg);


    }

}
