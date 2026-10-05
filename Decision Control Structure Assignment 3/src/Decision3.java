import javax.swing.JOptionPane;

public class Decision3 {
    public static void main(String[] args) {

        String inputNSAT = JOptionPane.showInputDialog("Enter NSAT score:");
        double nsat = Double.parseDouble(inputNSAT);

        String inputSalary = JOptionPane.showInputDialog("Enter parents' monthly salary:");
        double salary = Double.parseDouble(inputSalary);

        String inputEntrance = JOptionPane.showInputDialog("Enter entrance examination score:");
        double entrance = Double.parseDouble(inputEntrance);

        double average = (nsat + entrance) / 2;

        String result;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "Rejected";
        } else if (salary <= 3500 && average >= 91) {
            result = "Accepted";
        } else {
            result = "For further study";
        }

        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
}