package ListaDuplamenteEncadeada;

/*
 * Francisco Ivan de Sousa Alves - Matricula 20132045050108
 */
import javax.swing.JOptionPane;


public class ListaDuplamenteEncadeada implements ListED {
	int qtde = 0;
	No cabeca, calda;

	public void insert(Object obj) {
		No novo = new No(obj);
		
		// caso a qtde seja igual a 0 entao será o primeiro elemnto
		
		if (qtde == 0) {
			calda = cabeca = novo;

			/*
			 * Caso algum elemento ja tenha sido adicionado entao adiciona uma
			 * nova calda calda atual ser a calda.anterior a proxima calda sera
			 * novo
			 */
		} else {
			calda.anterior = calda;
			calda.next = novo;
			calda = novo;

		}
		qtde++;

	}

	@Override
	public void insert(Object obj, int pos) {
		No novo = new No(obj);
		No atual = cabeca;

		// Se a posicao for 0 adicionara na cabeca

		if (pos == 0) {
			cabeca = novo;
			cabeca.next = atual;

			// entao adicionara no fim
		} else if (pos == qtde) {
			insert(novo.obj);
		} else {
			// Caso o elemento tenha q ser inserido em qualquer outra posicao
			// pesquisar o elemento de posicao anterior

			for (int i = 0; i < pos - 1; i++) {
				atual = atual.next;

			}
			System.out.println(atual.obj);

			novo.next = atual.next; // o elemento a frente do novo sera o da
									// frente do atual
			novo.anterior = atual; // o elemento anterior será o atual
			atual.next = novo; // o elemento a frente do atual sera o novo

		}
		qtde++;

	}

	@Override
	public Object getElement(int pos) {

		int cont = 1;
		No busca = cabeca;

		if (pos <= 1) {
			return cabeca.obj;

		} else if (pos == qtde) {

			return calda.obj;

		} else {
			while (cont < pos) {
				busca = busca.next;
				cont++;
			}
			return busca.obj;
		}
	}

	public void remove(int pos) {
		
		int cont = 1;
		No busca = cabeca;
		
		if (pos < 0 || pos > qtde) {
			JOptionPane.showMessageDialog(null, "Posicao invalida! ");
			
		} else if (pos == 0) {
			cabeca = cabeca.next;

		} else if (pos == qtde) {

			calda = calda.anterior;

		} else {

			/*
			 * Caso o Elemento esteja dentro da lista e ele sera buscado até a
			 * pos -1 e o proximo elemento será o que queremos encontrar, para
			 * remover o elemento passaremos a referencia para o proximo
			 */
			
			while (cont < pos - 1 && busca.next != null) {
				busca = busca.next;
				cont++;
			}
			
			busca.next = busca.next.next;
			busca.anterior = busca.anterior.anterior;

			JOptionPane.showMessageDialog(null, " Removido. ");
			qtde--;

		}

	}

	@Override
	public int size() {
		return qtde;
	}

	@Override
	public void contains(Object obj) {
		// no busca parte inicialmente da cabeca
		No busca = cabeca;

		boolean achou = false;
		int cont = 0;

		while (cont < qtde - 1) {
			// se o elemento for igual ao elemento atual, entao o elemento foi
			// achado.
			if (obj.equals(busca.obj)) {
				achou = true;
				break;

			} else { // Senao busca ira para outro no
				busca = busca.next;
			}
			cont++;
		}
		if (achou == false) {
			JOptionPane.showMessageDialog(null, "Não foi achado!");
		} else {
			JOptionPane.showMessageDialog(null, " Objeto Contido");
		}
	}

	public void imprimir() {
		No auxiliar = cabeca;
		int cont = 0;
		while (cont != qtde) {
			System.out.println(cont + " - " + auxiliar.obj);
			auxiliar = auxiliar.next;
			cont++;
		}
		System.out.println("\n");
	}
}
