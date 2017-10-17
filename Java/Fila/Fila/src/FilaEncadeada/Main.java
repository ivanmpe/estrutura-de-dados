package FilaEncadeada;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		FilaEncadeada f = new FilaEncadeada();
		Object obj = new Object();
		int escolha = 0;

		do {
			int opcao = Integer.parseInt(JOptionPane
					.showInputDialog("Fila \n1 - Adicionar: \n" + "2 - Remover \n"
							+ "3 - Primeiro Elemento: \n" + "4 - Tamanho \n"));

			switch (opcao) {
			case 1:
				obj = JOptionPane.showInputDialog(" Objeto: ");
				f.insere(obj);
				break;
			case 2:
				f.remove();
				break;
			case 3:
				f.first();
				break;
			case 4:
				JOptionPane.showMessageDialog(null,
						" Tamanho total = " + f.size());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao Invalida! ");
				break;
			}

		} while (escolha == 0);
	}

}
