import java.util.*;

public class Task_02 {

    public static void main(String[] args) {
        calculateGrades();
    }

    public static void calculateGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        // Input marks for each subject
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            // Validate that marks are within the valid range (0 to 100)
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                return;
            }

            totalMarks += marks[i];
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        // Assign grades based on the average percentage
        char grade = calculateGrade(averagePercentage);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
