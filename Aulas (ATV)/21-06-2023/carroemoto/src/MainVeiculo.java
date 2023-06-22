import javax.swing.JOptionPane;
public class MainVeiculo {
    public static void main(String[] args) {
        Object [] itens = {"Carro", "Moto"};
	    Object selectedValue = JOptionPane.showInputDialog(null, "Qual o seu veículo?","Escolha:", 
        JOptionPane.INFORMATION_MESSAGE, null, itens, itens [1]);
        if (selectedValue == "Carro") {
        Veiculo Carro = new Veiculo ();
        JOptionPane.showMessageDialog(null, "Velocidade inicial do carro: " + Carro.velocidadeI + "\nVelocidade da aceleração do carro: " + 
        Carro.aceleracao + "\nVelocidade da redução da carro: " + Carro.reducao + "\nVelocidade Reduzida: " + Carro.velocidadeR+ 
        "\nVelocidade atual: " + Carro.velocidadeA + "\nBuzina: BUU BUU");
        } if (selectedValue == "Moto"){
        Veiculo Moto = new Veiculo ();
        JOptionPane.showMessageDialog(null, "Velocidade inicial da moto: " + Moto.velocidadeI + "\nVelocidade da aceleração da moto: " + 
        Moto.aceleracao + "\nVelocidade da redução da moto: " + Moto.reducao + "\nVelocidade Reduzida: " + Moto.velocidadeR + 
        "\nVelocidade atual: " + Moto.velocidadeA + "\nBuzina: BI BI");
        }
    }
}