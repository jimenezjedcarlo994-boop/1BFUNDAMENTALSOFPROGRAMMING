import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Decision1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = Double.parseDouble(reader.readLine());

        System.out.print("Enter hours worked: ");
        double hoursWorked = Double.parseDouble(reader.readLine());

        double grossPay = hourlyRate * hoursWorked;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.println("Gross Pay: ₱" + grossPay);
        System.out.println("Withholding Tax: ₱" + withholdingTax);
        System.out.println("Net Pay: ₱" + netPay);
    }
}