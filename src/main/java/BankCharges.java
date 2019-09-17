import javax.swing.JOptionPane;

public class BankCharges {
    public static void main(String[] args) {
        String userInput;
        int numberOfChecks;
        final double bankBaseFee = 10;
        double bankServiceFee;
        
        userInput = JOptionPane.showInputDialog("Enter the number of checks written");
        numberOfChecks = Integer.parseInt(userInput);
        
        if (numberOfChecks < 20) {
            bankServiceFee = bankBaseFee + (numberOfChecks * .10);     
        }
        else if (numberOfChecks < 40) {
            bankServiceFee = bankBaseFee + (numberOfChecks * 0.08);
        }
        else if (numberOfChecks < 60) {
            bankServiceFee = bankBaseFee + (numberOfChecks * 0.06);
        }
        else {
            bankServiceFee = bankBaseFee + (numberOfChecks * 0.04);
        }
        System.out.println("The total fees are $" + bankServiceFee);
    }
}
