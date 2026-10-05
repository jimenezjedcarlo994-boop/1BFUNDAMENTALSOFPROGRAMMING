import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Decision1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(reader.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(reader.readLine());

        System.out.print("Enter entrance examination score: ");
        double entrance = Double.parseDouble(reader.readLine());

        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("Result: Rejected");
        } else if (salary <= 3500 && average >= 91) {
            System.out.println("Result: Accepted");
        } else {
            System.out.println("Result: For further study");
        }
    }
}
