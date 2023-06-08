import javax.swing.JOptionPane;
public class Pessoa {
        protected String Nome;
        protected void Doc () {
                JOptionPane.showMessageDialog(null, "12345678910");
        };
        protected Pessoa (){
                this.Nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        }
        /*protected Pessoa (){
                Nome = "Nome pessoa: Gleice Marques";
        }
        protected Pessoa (String nome){
                Nome = nome;
        }
        public String getNome(){
                return Nome;
        }*/
}