import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of subjects
        System.out.print("Enter the number of subjects: ");
        int num_Subjects = scanner.nextInt();

        // Array to hold marks for each subject
        int[] marks = new int[num_Subjects];
        int total_Marks = 0;

        // Input marks for each subject
        for (int i = 0; i < num_Subjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            total_Marks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = (double) total_Marks / num_Subjects;

        // Determine grade based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total_Marks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
