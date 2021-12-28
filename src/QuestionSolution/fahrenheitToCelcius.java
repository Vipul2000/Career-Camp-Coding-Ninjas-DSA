/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size
(W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their
 corresponding Celsius values and print the table.
 */


package QuestionSolution;

import java.util.Scanner;

public class fahrenheitToCelcius {

    public static void main(String[] args) {

        int S,E,W;
        Scanner sc= new Scanner(System.in);

        S=sc.nextInt();
        E=sc.nextInt();
        W=sc.nextInt();


        int fah;

        while(S<=E){
            fah=((5*(S-32))/9);
            System.out.println(S + " " +fah);
            S=S+W;
        }

    }
}
