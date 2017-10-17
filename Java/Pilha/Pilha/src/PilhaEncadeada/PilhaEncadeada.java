package PilhaEncadeada;
/*
 * Francisco Ivan de Sousa Alves - Matricula 20132045050108
 */
import javax.swing.JOptionPane;

public class PilhaEncadeada implements InterPilha {

	No cabeca;

	int qtde = 0;

	public void push(Object obj) {

		No novo = new No(obj);

		if (qtde == 0) {
			cabeca = novo;

		} else {
			novo.proximo = cabeca;
			cabeca = novo;
		}
		qtde++;
	}

	@Override
	public void pop() {
		if (qtde == 0) {
			JOptionPane.showMessageDialog(null, "Pilha Vazia!");
		} else {
			cabeca = cabeca.proximo;
			qtde--;
		}

	}

	@Override
	public void top() {
		if (qtde == 0) {
			JOptionPane.showMessageDialog(null, "Pilha Vazia!");
		} else {
			JOptionPane.showMessageDialog(null, "Top: " + cabeca.obj);

		}

	}

	@Override
	public Object size() {
		return qtde;
	}

}
