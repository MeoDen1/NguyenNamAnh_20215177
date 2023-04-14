//package Source.Java.Lab01;
import javax.swing.JOptionPane;

//2.2.5
public class TwoDouble {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog("Enter 1st number: ");
        strNum2 = JOptionPane.showInputDialog("Enter 2nd number: ");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);


        JOptionPane.showMessageDialog(null, 
                num1 + num2, "Sum", JOptionPane.INFORMATION_MESSAGE);


        JOptionPane.showMessageDialog(null, 
                (num1 > num2)? (num1 - num2) : (num2 - num1), "Difference", JOptionPane.INFORMATION_MESSAGE);


        JOptionPane.showMessageDialog(null, 
                num1 * num2, "Product", JOptionPane.INFORMATION_MESSAGE);


        JOptionPane.showMessageDialog(null, 
                num1 / num2, "Quotient of num1 / num2", JOptionPane.INFORMATION_MESSAGE);
    }
}
