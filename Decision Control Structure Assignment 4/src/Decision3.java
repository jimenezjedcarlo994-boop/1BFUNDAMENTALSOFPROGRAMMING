import javax.swing.JOptionPane;

public class Decision3 {
    public static void main(String[] args) {

        String inputHeight =
                JOptionPane.showInputDialog("Enter height in cm:");
        double height = Double.parseDouble(inputHeight);

        String inputAge =
                JOptionPane.showInputDialog("Enter age:");
        int age = Integer.parseInt(inputAge);

        String citizenship =
                JOptionPane.showInputDialog("Enter citizenship (C/N):");

        String recommendation =
                JOptionPane.showInputDialog("Enter recommendation (R/N):");

        String result;

        if (recommendation.equals("R")) {
            result = "Applicant is ACCEPTED.";
        } else if (height >= 200 && age >= 21 && age <= 25
                && citizenship.equals("C")) {
            result = "Applicant is ACCEPTED.";
        } else {
            result = "Applicant is REJECTED.";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
