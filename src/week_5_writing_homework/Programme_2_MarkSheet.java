package week_5_writing_homework;

/*
Rewrite the student mark sheet programme using if else and while loop. (Week-7 Homework)
 */

import java.util.Scanner;

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter student name \t\t:\t"); //input wizard
        String name = s.next();
        System.out.println("Enter student Roll Number \t\t:\t"); //input wizard
        int rollNum = s.nextInt();
        System.out.println("Enter Marks of Subject Maths \t:\t");//input wizard
        int mathMarks = s.nextInt();
        while (mathMarks < 0 || mathMarks > 100) {
            System.out.println("\nInvalid Input, Mark should between 0 to 100");
            System.out.println("\nPlease enter correct marks of Maths \t \t:\t");
            mathMarks = s.nextInt();
        }
        System.out.println("Enter Marks of Subject Science \t:\t");
        int scienceMarks = s.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid Input, Mark should between 0 to 100");
            System.out.println("\nPlease enter correct marks of Science \t \t:\t");
            scienceMarks = s.nextInt();
        }
        System.out.println("Enter Marks of Subject English \t:\t");
        int englishMarks = s.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid Input, Mark should between 0 to 100");
            System.out.println("\nPlease enter correct marks of Science \t \t:\t");
            englishMarks = s.nextInt();
        }
        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result,grade);
        //Closing the Scanner
        s.close();

    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //Calculating the results on subjects marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {
        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "FAIL";
        } else {
            return "PASS";
        }
    }

    //Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "_";
        }
        return grade;
    }

    // Printing the mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks, double
            total, double percentage, String result, String grade) {
        System.out.println("|----------------------------------------|");
        System.out.println("|             MARK SHEET                 |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Name          : " + name + "           |");
        System.out.println("| Roll No       : " + rollNum + "        |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Subjects      :   Marks                |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Math          : " + mathsMarks + "     |");
        System.out.println("| Science       : " + scienceMarks + "   |");
        System.out.println("| English       : " + englishMarks + "   |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Total         : " + total + "          |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Percentage    : " + percentage + "     |");
        System.out.println("| Result    : " + result + "             |");
        System.out.println("| Grade    : " + grade + "               |");
        System.out.println("|----------------------------------------|");
    }

}