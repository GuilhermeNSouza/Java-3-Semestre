import javax.swing.JOptionPane;
public class Veiculo {
        protected int velocidadeI;
        protected int aceleracao;
        protected int reducao;
        protected int velocidadeR;
        protected int velocidadeA;
        public Veiculo () {
            this.velocidadeI = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade inicial: "));
            this.aceleracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade de aceleração: "));
            this.reducao = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade de redução: "));
            this.velocidadeR = (velocidadeI + aceleracao);
            this.velocidadeA = (velocidadeR - reducao);
                        
    }
}