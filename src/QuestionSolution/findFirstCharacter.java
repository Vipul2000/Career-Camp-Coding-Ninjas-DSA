/*Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
        1, if the character is an uppercase alphabet (A - Z)
        0, if the character is a lowercase alphabet (a - z)
        -1, if the character is not an alphabet
*/


package QuestionSolution;

import java.util.Scanner;

public class findFirstCharacter {
    public static void main(String[] args) {

        char ch;
        Scanner sc = new Scanner(System.in);

        ch= sc.next().charAt(0);

        if(ch>=65 && ch<=90){
            System.out.println("1");
        }
        else if(ch>=97 && ch<=122){
            System.out.println("0");
        }
        else{
            System.out.println("-1");
        }

    }
}
