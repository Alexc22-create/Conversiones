import javax.swing.JOptionPane;
public class Conversion{

    public static void main(String[] args){

       String numero1 = JOptionPane.showInputDialog("Ingresa el numero: ");
       String numero2 = JOptionPane.showInputDialog("Ingresa el numero: ");

        double n1 = Double.parseDouble(numero1);
        double n2 = Double.parseDouble(numero2);

        JOptionPane.showMessageDialog(null, "Suma "+(n1+n2));
    }
}