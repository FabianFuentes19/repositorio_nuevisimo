import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String numero1 = JOptionPane.showInputDialog("ingresa el primer numero: ");
        System.out.println(Integer.parseInt(numero1));
    }
}
