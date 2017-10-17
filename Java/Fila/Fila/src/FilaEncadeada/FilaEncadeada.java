package FilaEncadeada;
/*
 * Francisco Ivan de Sousa Alves - Matricula 20132045050108
 */
import javax.swing.JOptionPane;

public class FilaEncadeada implements InterFila {

	int qtde = 0;
	No cabeca, calda;

	public void insere(Object obj) {

		No novo = new No(obj);

		if (qtde == 0) {
			calda = cabeca = novo;
			
		} else {
			calda.aux = novo;
			calda = calda.aux;
			
		}
		qtde++;

	}

	public void remove() {

		if (qtde == 0) {
			JOptionPane.showMessageDialog(null, "Fila vazia!");
		} else {
			cabeca = cabeca.aux;
			JOptionPane.showMessageDialog(null, "Objeto removido!");
			qtde--;
		}

	}

	public void first() {

		if (qtde == 0) {
			JOptionPane.showMessageDialog(null, "Lista Esta Vazia!");
		} else {
			JOptionPane.showMessageDialog(null, "O primeiro elemento eh : "	+ cabeca.obj);
		}
	}

	@Override
	public int size() {
		return qtde;
	}

}
