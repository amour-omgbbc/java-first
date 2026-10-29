import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Homework: ");
        double homework = input.nextDouble();
        
        System.out.print("Midterm: ");
        double midterm = input.nextDouble();
        
        System.out.print("Final exam: ");
        double finalExam = input.nextDouble();
        
        double total = homework * 0.2
             + midterm * 0.3
             + finalExam * 0.5;
        boolean passed = total >= 60;

        System.out.printf("Total: %.1f%n", total);
        System.out.println("Passed: " + passed);

        input.close();
    }
}
