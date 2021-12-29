/*Write a program to print all the factors of a number other than 1 and the number itself.*/.



package QuestionSolution;

import java.util.Scanner;

public class FactorsSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=2; i<=n-1; i++){
            if (n%i==0){
                System.out.print(i+ " ");
            }
        }
    }
}
