import javax.swing.JOptionPane;

public class Conversion {

    public static void main(String[] args) {
        int op = -1;

        while (op != 0) {

            String numero1 = JOptionPane.showInputDialog("Ingresa el primer número:");
            String numero2 = JOptionPane.showInputDialog("Ingresa el segundo número:");
            String opStr = JOptionPane.showInputDialog(
                "Operación:\n1.- Suma\n2.- Resta\n3.- Multiplicación\n4.- División\n0.- Salir"
            );

            // Convertimos las entradas
            double n1 = Double.parseDouble(numero1);
            double n2 = Double.parseDouble(numero2);
            op = Integer.parseInt(opStr); // cambiamos a tipo int

            double respuesta = 0;

            switch (op) {
                case 1:
                    respuesta = n1 + n2;
                    break;
                case 2:
                    respuesta = n1 - n2;
                    break;
                case 3:
                    respuesta = n1 * n2;
                    break;
                case 4:
                    if (n2 != 0) {
                        respuesta = n1 / n2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: División entre cero.");
                        continue; // saltamos a la siguiente iteración del bucle
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    continue;
            }

            if (op != 0 && op >= 1 && op <= 4) {
                JOptionPane.showMessageDialog(null, "La respuesta es: " + respuesta);
            }
        }
    }
}
