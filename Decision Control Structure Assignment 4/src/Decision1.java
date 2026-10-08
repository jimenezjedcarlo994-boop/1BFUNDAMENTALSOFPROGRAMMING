import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Decision1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height in cm: ");
        double height = Double.parseDouble(reader.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.print("Enter citizenship (C/N): ");
        String citizenship = reader.readLine();

        System.out.print("Enter recommendation (R/N): ");
        String recommendation = reader.readLine();

        if (recommendation.equals("R")) {
            System.out.println("Applicant is ACCEPTED.");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            System.out.println("Applicant is ACCEPTED.");
        } else {
            System.out.println("Applicant is REJECTED.");
        }
    }
}
