package PilhaVetor;

import javax.swing.JOptionPane;


public class Main {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Object obj = new Object();
		int escolha = 0;

		do {
			int opcao = Integer.parseInt(JOptionPane
					.showInputDialog( "Pilha Vetor  \n1 - Adicionar: \n" + "2 - Remover \n"
							+ "3 - Topo: \n" + "4 - Tamanho \n"));

			switch (opcao) {
			case 1:
				obj = JOptionPane.showInputDialog(" Objeto: ");
				pilha.push(obj);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Removido!");
				pilha.pop();
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Primeiro Elemento da Pilha: " + pilha.top());
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
