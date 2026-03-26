package Lab01;

import javax.swing.JOptionPane;

public class FirstDegreeOneVariable {
    public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog("Enter a:");
        String strB = JOptionPane.showInputDialog("Enter b");
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        
        double x;

        if(a==0){
            x = -b;
            JOptionPane.showInputDialog(null, "Solution of the equation is x = " + x);
        }
        else{
            x = -b/a;
            JOptionPane.showInputDialog(null, "Solution of the equation is x = " + x);
        }

        System.exit(0);
    }
}
