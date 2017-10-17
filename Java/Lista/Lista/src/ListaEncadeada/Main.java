package ListaEncadeada;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Object obj;
		ListaEncadeada l = new ListaEncadeada();
		int escolha = 0;
		int pos ;

		do {
						
			int opcao = Integer.parseInt(JOptionPane
					.showInputDialog("\tLista Encadeada \n" + "\n"
							+ "1 - Adicionar: \n" 
							+ "2 - Adicionar por posicao: \n" 
							+ "3 - Pegar Elemento: \n"
							+ "4 - Remover: \n" 
							+ "5 - Tamanho: \n" 
							+ "6 - Pesquisar: \n"
							+ "7 - Imprimir \n "));
			 

			switch (opcao) {
			case 1:
				obj = JOptionPane.showInputDialog("Entre com elemento: ");
				l.insert(obj);
				break;
			case 2:
				obj = JOptionPane.showInputDialog("Entre com elemento: ");
				pos = Integer.parseInt(JOptionPane.showInputDialog("Entre com posicao: " ));
				l.insert(obj, pos);
				break;
			case 3: 
				pos = Integer.parseInt(JOptionPane.showInputDialog("Entre com posicao: " ));
				JOptionPane.showMessageDialog(null, l.getElement(pos));
					
				break;
			case 4:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Entre com posicao: " ));
				l.remove(pos);
				break;
			case 5:
				JOptionPane.showMessageDialog(null," Tamanho total = " + l.size());
				break;
			case 6: 
				obj = JOptionPane.showInputDialog("Entre com elemento: ");
				l.contains(obj);
				break;			
			case 7:
				l.imprimir();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcao Invalida! ");
				break;
			}

		} while (escolha == 0);
	}

	}


