//import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        Object [] itens = {"Fisica", "Juridica"};
	    Object selectedValue = JOptionPane.showInputDialog(null, "Voce é uma pessoa fisica ou juridica?","Selecione:", 
        JOptionPane.INFORMATION_MESSAGE, null, itens, itens [1]);
        if (selectedValue == "Fisica") {
        Pessoa Pessoa1 = new Fisica ();
        Pessoa1.Doc();
        } if (selectedValue == "Juridica") {
        Pessoa Pessoa2 = new Juridica ();
        Pessoa2.Doc();
        }
    }
}