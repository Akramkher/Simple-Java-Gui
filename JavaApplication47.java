
package javaapplication47;
import javax.swing.JOptionPane;

public class JavaApplication47 {

    public static void main(String[] args) {

        String num1,num2;
         int a,b;
        num1 = JOptionPane.showInputDialog("Enter frist number");
        num2 = JOptionPane.showInputDialog("Enter second");
        a = Integer.parseInt(num1);
        b = Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null,"Total "+(a+b));
    }
    
}
