package PilhaEncadeada;

import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args) {
		PilhaEncadeada pilha = new PilhaEncadeada();
		Object obj = new Object();
		int escolha = 0;

		do {
			int opcao = Integer.parseInt(JOptionPane
					.showInputDialog( "Pilha Encadeada \n1 - Adicionar: \n" + "2 - Remover \n"
							+ "3 - Topo: \n" + "4 - Tamanho \n"));

			switch (opcao) {
			case 1:
				obj = JOptionPane.showInputDialog(" Objeto: ");
				pilha.push(obj);
				break;
			case 2:
				pilha.pop();
				JOptionPane.showMessageDialog(null, "Removido!");
				break;
			case 3:
				pilha.top();
				break;
			case 4:
				JOptionPane.showMessageDialog(null,
						" Tamanho total = " + pilha.size());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao Invalida! ");
				break;
			}

		} while (escolha == 0);
	}

}
