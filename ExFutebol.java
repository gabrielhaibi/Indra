import javax.swing.JOptionPane;

public class ExFutebol {
	public static void main(String[] args) {

		float altura = 0.0;
		float peso = 0;
		float alturaMedia = 0;
		double porcentagemMais80kg = 0;

		int i = 0;
		int j = 0;
		int idade = 0;
		int idadeMedia = 0;
		int ate18 = 0;
		int mais80kg = 0;

		for (i = 0; i < 5; i++) {
			idadeMedia = 0;
			for (j = 0; j < 11; j++) {
				idade = Integer.parseInt(JOptionPane
						.showInputDialog("Insira a idade do " + (j + 1) + "º jogador do time " + (i + 1) + ":"));
				altura = Integer.parseInt(JOptionPane
						.showInputDialog("Insira a altura (m) do " + (j + 1) + "º jogador do time " + (i + 1) + ":"));
				peso = Integer.parseInt(JOptionPane
						.showInputDialog("Insira o peso (kg) do " + (j + 1) + "º jogador do time " + (i + 1) + ":"));
				idadeMedia = idadeMedia + idade;
				alturaMedia = alturaMedia + altura;
				if (idade < 18) {
					ate18++;
				}
				if (peso > 80) {
					mais80kg++;
				}
			}
			idadeMedia = (idadeMedia / 11);
			JOptionPane.showMessageDialog(null,
					"A idade media dos jogadores do time " + (i + 1) + " é de: " + idadeMedia + " anos.");
		}
		alturaMedia = (alturaMedia / 55);
		JOptionPane.showMessageDialog(null,
				"A altura media de todos os jogadores do campeonato é de: " + alturaMedia + "m.");

		JOptionPane.showMessageDialog(null, "O número de jogadores com menos de 18 anos é de: " + ate18 + ".");

		porcentagemMais80kg = ((100.0 * mais80kg) / 55);
		JOptionPane.showMessageDialog(null,
				"A porcentagem de todos jogadores do campeonato com mais de 80Kg é de: " + porcentagemMais80kg + "%.");
	}
}
