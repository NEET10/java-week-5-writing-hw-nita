package programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //Declaring a scanner object
        Scanner s = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please enter first number: "); //input wizard
            int a = s.nextInt();
            System.out.println("Please enter second number: "); //input wizard
            int b = s.nextInt();
            System.out.println("Please enter one of the symbol +,-,*,/ : ");  //input wizard
            char symbol = s.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation then please enter 'Y' or 'N' : ");//input wizard
            answer = s.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        //Closing a scanner object

    }
}
