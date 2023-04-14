// package Source.Java.Lab01;
import javax.swing.JOptionPane;
import java.lang.Math;

// 2.2.6
public class EquationSolve {
    public static void main(String[] args) {
        String choices;

        choices = JOptionPane.showInputDialog("Enter choice: ");   
        
        int choice = Integer.parseInt(choices);

        if(choice == 0) {
            String strNum1, strNum2;
            strNum1 = JOptionPane.showInputDialog("Enter a: ");
            strNum2 = JOptionPane.showInputDialog("Enter b: ");

            int num1 = Integer.parseInt(strNum1);
            int num2 = Integer.parseInt(strNum2);

            first_degree_equation(num1, num2);
        }
        else if (choice == 1) {
            String[] strNum = new String[6];
            strNum[0] = JOptionPane.showInputDialog("Enter a11: ");
            strNum[1] = JOptionPane.showInputDialog("Enter a12: ");
            strNum[2] = JOptionPane.showInputDialog("Enter b1: ");
            strNum[3] = JOptionPane.showInputDialog("Enter a21: ");
            strNum[4] = JOptionPane.showInputDialog("Enter a22: ");
            strNum[5] = JOptionPane.showInputDialog("Enter b2: ");

            int[] num = new int[6];
            for(int i = 0; i < 6; i++) {
                num[i] = Integer.parseInt(strNum[i]);
            }

            system_first_degree_equation(num[0], num[1], num[2], num[3], num[4], num[5]);
        }
        else {
            String strNum1, strNum2, strNum3;
            strNum1 = JOptionPane.showInputDialog("Enter a: ");
            strNum2 = JOptionPane.showInputDialog("Enter b: ");
            strNum3 = JOptionPane.showInputDialog("Enter c: ");

            int num1 = Integer.parseInt(strNum1);
            int num2 = Integer.parseInt(strNum2);
            int num3 = Integer.parseInt(strNum3);

            second_degree_equation(num1, num2, num3);
        }

        
    }

    public static void first_degree_equation(int a, int b) {
        if (a == 0) {
            JOptionPane.showMessageDialog(null, 
                (b == 0)? "iIfinite": "No solution", "Result of first_degree_equation", 
                JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, 
                (double)b/a, "Result of first_degree_equation", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void system_first_degree_equation(int a11, int a12, int b1, int a21, int a22, int b2) {
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        String result = "x1: " + D1/D + "\nx2: " + D2/D;

        JOptionPane.showMessageDialog(null, 
                result, "Result of system_first_degree_equation", 
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void second_degree_equation(int a, int b, int c) {
        double result = 0;
        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, 
                (c == 0)? "infinite": "No solution", "Result of second_degree_equation", 
                JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            result = (double)c/b;
        }
        else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                JOptionPane.showMessageDialog(null, 
                "No solution", "Result of second_degree_equation", 
                JOptionPane.INFORMATION_MESSAGE);
            }
            else if (delta == 0) {
                JOptionPane.showMessageDialog(null, 
                "x: " + (double)b / 2 * a * (-1), "Result of second_degree_equation", 
                JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                delta = java.lang.Math.sqrt(delta);
                double x1 = (b * -1 + delta) / (2 * a);
                double x2 = (b * -1 - delta) / (2 * a);

                JOptionPane.showMessageDialog(null, 
                "x1: " + x1 + "\nx2: " + x2, "Result of second_degree_equation", 
                JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
