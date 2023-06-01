import javax.swing.JOptionPane;
public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    public Funcionario() {
        this.nome = JOptionPane.showInputDialog(null, "Nome: ");
        this.cpf = JOptionPane.showInputDialog(null, "CPF: ");
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
	public double getBonificacao () {
	return this.salario * 0.10;
	}
}