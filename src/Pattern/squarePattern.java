/*Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444 */


package Pattern;

import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int row=1; row<=n; row++){

            for(int col=1; col<=n; col++){

                System.out.print(n);
            }

            System.out.println();
        }


    }
}


