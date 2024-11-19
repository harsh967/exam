import java.util.Scanner;

public class MarksExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks from the user
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        // Categorize the marks
        if (marks >= 90) {
            System.out.println("Category: Excellent");
        } else if (marks >62 ) {
            System.out.println("Category: Good");
        } else {
            System.out.println("Category: Average");
        }

        scanner.close();
    }
}
