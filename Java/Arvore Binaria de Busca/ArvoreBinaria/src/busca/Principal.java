package busca;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Funcoes f = new Funcoes();
		int num;
		int escolha = 0;

		do {
			escolha = Integer.parseInt(JOptionPane
					.showInputDialog("Arvore Binaria de Busca \n"
							+ " Escolha: \n" + "\n" + "1 - Inserir \n"
							+ "2 - Buscar \n" + "3 - Sucessor \n"
							+ "4 - Antecessor \n" + "5 - Deletar \n"
							+ "6 - Minimo \n" + "7 - Maximo \n"
							+ "8 - Tamanho total \n" + "9 - inOrder \n"
							+ "10- preOrder\n" + "11 - posOrder" + " \n "));

			switch (escolha) {
			case 1:
				num = Integer.parseInt(JOptionPane.showInputDialog("Dado : "));
				f.inserir(num);
				break;
			case 2:
				num = Integer.parseInt(JOptionPane.showInputDialog("Dado : "));
				if (f.busca(num) == null) {
					JOptionPane.showMessageDialog(null,
							"Numero nao encontrado!");
				} else {
					JOptionPane.showMessageDialog(null,
							"Numero " + f.busca(num).chave + " encontrado");
				}
				break;
			case 3:
				if (f.sucessor(f.first()) != null) {
					JOptionPane.showMessageDialog(null,
							" Sucessor: " + f.sucessor(f.first()).chave);
				} else {
					JOptionPane
							.showMessageDialog(null, "Nao possui sucessor. ");
				}
				break;
			case 4:
				if (f.antecessor(f.first()) != null) {
					JOptionPane.showMessageDialog(null,
							" Antecessor: " + f.antecessor(f.first()).chave);
				} else {
					JOptionPane.showMessageDialog(null,
							" Nao possui antecessor. ");
				}

				break;
			case 5:
				
				num = Integer.parseInt(JOptionPane.showInputDialog("Dado : "));
				if(f.busca(num)!= null){
					
					f.delete(f.first(),f.busca(num));
				} else{
					JOptionPane.showMessageDialog(null, "Numero não consta na arvore!" );
				}
				
				break;
			case 6:
				JOptionPane.showMessageDialog(null,
						"Numero " + f.min(f.first()).chave);
				break;
			case 7:
				JOptionPane.showMessageDialog(null,
						"Numero " + f.max(f.first()).chave);
				break;
			case 8:
				JOptionPane.showMessageDialog(null,
						"Quantidade de nos " + f.size());
				break;
			case 9:
				System.out.println("Em Ordem: ");
				f.emOrdem(f.first());
				System.out.println("\n");
				break;
			case 10:
				System.out.println("Pre Ordem:");
				f.preOrdem(f.first());
				System.out.println("\n");
				break;
			case 11:
				System.out.println("Pos Ordem: ");
				f.posOrdem(f.first());
				System.out.println("\n");
				break;
			default:
				JOptionPane.showMessageDialog(null, " Opcao Invalida! ");

			}
		} while (escolha != 0);

	}

}
