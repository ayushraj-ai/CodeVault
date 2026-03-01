import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Declare variables for marks of five subjects
        int physics, chemistry, biology, mathematics, computer;
        int totalMarks = 500;
        int obtainedMarks;
        double percentage;
        String grade;

        // Input marks for each subject
        System.out.print("Enter marks for Physics: ");
        physics = input.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        chemistry = input.nextInt();
        System.out.print("Enter marks for Biology: ");
        biology = input.nextInt();
        System.out.print("Enter marks for Mathematics: ");
        mathematics = input.nextInt();
        System.out.print("Enter marks for Computer: ");
        computer = input.nextInt();

        // Calculate total obtained marks and percentage
        obtainedMarks = physics + chemistry + biology + mathematics + computer;
        percentage = (obtainedMarks / (double) totalMarks) * 100;

        // Determine the grade based on the percentage
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 40) {
            grade = "E";
        } else {
            grade = "F";
        }

        // Display the percentage and grade
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        input.close();
    }
}
 