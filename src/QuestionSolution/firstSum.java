package QuestionSolution;

import java.util.Scanner;

public class firstSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        int i=0;
        int sum=0;

        while (i<=n){
            sum=sum+i;
            i=i+1;
        }
        System.out.println(sum);



    }
}
