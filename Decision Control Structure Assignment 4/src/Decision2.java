import java.util.Scanner;

public class Decision2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter citizenship (C/N): ");
        String citizenship = scanner.next();

        System.out.print("Enter recommendation (R/N): ");
        String recommendation = scanner.next();

        if (recommendation.equals("R")) {
            System.out.println("Applicant is ACCEPTED.");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            System.out.println("Applicant is ACCEPTED.");
        } else {
            System.out.println("Applicant is REJECTED.");
        }

        scanner.close();
    }
}
