
package GradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;

        System.out.println("Welcome to Student Grade Calculator!");

        System.out.print("\nEnter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        if (subjects <= 0) {
            System.out.println("Please enter a valid number of subjects.");
            sc.close();
            return;
        }

        for (int i = 1; i <= subjects; i++) {

            int marks;

            while (true) {
                System.out.print("Enter marks for subject " + i + ": ");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                }
            }

            totalMarks += marks;
        }

        double average = (double) totalMarks / subjects;

        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n========== STUDENT RESULT ==========");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks + "/" + (subjects * 100));
        System.out.printf("Average Percentage: %.2f%%%n", average);
        System.out.println("Grade: " + grade);
        System.out.println("====================================");
        System.out.println("Thank you!");

        sc.close();
    }
}
