import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String numero = JOptionPane.showInputDialog("Ingrese el primer número: ");
        float num1 = Float.parseFloat(numero);
        String numeroo = JOptionPane.showInputDialog("Ingrese el segundo número: ");
        float num2 = Float.parseFloat(numeroo);
        String numerooo = JOptionPane.showInputDialog("Ingrese el tercer número: ");
        float num3 = Float.parseFloat(numerooo);

        float promedio = (num1 + num2 + num3) / 3;

        System.out.println("El promedio es; " + promedio);
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
        
    }
}
