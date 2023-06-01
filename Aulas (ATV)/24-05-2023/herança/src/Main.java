import javax.swing.JOptionPane;
	public class Main {
    public static void main(String[] args) {
		Gerente gerente = new Gerente("Mario", "12345678910", 300.0);
		JOptionPane.showMessageDialog(null, "Gerente:\nNome do Gerente: " + gerente.nome + "\nSalário do Gerente: " + gerente.salario + 
		"\nBonificação: " + gerente.getBonificacao() + "\nSalário Bonificado: "+ (gerente.salario+gerente.getBonificacao()));
		//JOptionPane.showMessageDialog(null, "Salario bonificado: " + gerente.salario*0.15);
		//JOptionPane.showMessageDialog(null, "Gerente: " + gerente.getBonificacao());
		/*Veiculo veiculo = new Veiculo();
        veiculo.solicitarDados();
        Moto moto = new Moto ();
        moto.solicitarQntDeFarois();
        JOptionPane.showMessageDialog(null, "Moto cadastrada:\nPlaca: " + veiculo.getPlaca() + "\nAno: " + veiculo.getAno() + "\nQtd de Farois: " + moto.getQntDeFarois());
        }*/
    }
}