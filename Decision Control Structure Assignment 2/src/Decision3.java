import javax.swing.JOptionPane;

public class Decision3 {
    public static void main(String[] args) {

        String inputRate = JOptionPane.showInputDialog("Enter hourly pay rate:");
        double hourlyRate = Double.parseDouble(inputRate);

        String inputHours = JOptionPane.showInputDialog("Enter hours worked:");
        double hoursWorked = Double.parseDouble(inputHours);

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

        JOptionPane.showMessageDialog(null,
                "Gross Pay: ₱" + grossPay +
                        "\nWithholding Tax: ₱" + withholdingTax +
                        "\nNet Pay: ₱" + netPay);
    }
}
