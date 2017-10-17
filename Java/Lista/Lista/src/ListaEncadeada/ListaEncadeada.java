package ListaEncadeada;
/*
 * Francisco Ivan de Sousa Alves - Matricula 20132045050108
 */
import javax.swing.JOptionPane;

public class ListaEncadeada implements ListED {
	No cabeca, calda;
	int qtde = 0;

	public void insert(Object obj) {
		// Criar novo nó
		No novo = new No(obj);

		if (qtde == 0) { // Caso seja o primeiro elemento a ser inserido entao
							// será cabeca e calda

			cabeca = calda = novo;

		} else {

			calda.next = novo;
			calda = calda.next;
		}
		qtde++;
	}

	public void insert(Object obj, int pos) {
		No novo = new No(obj);
		No auxiliar = cabeca;

		if (pos == 0) {

			cabeca = novo;
			cabeca.next = auxiliar;

		} else if (pos > qtde) {

			insert(novo);

		} else {
			for (int i = 0; i < pos - 1; i++) {
				auxiliar = auxiliar.next;
			}
			
			
			
			novo.next = auxiliar.next;
			
			auxiliar.next = novo;
		}

		qtde++;
	}

	@Override
	public Object getElement(int pos) {
		int cont = 1;
		No busca = cabeca;

		if (pos == 0) {
			return cabeca.obj;
		} else if (pos == qtde - 1) {
			return calda.obj;
		} else if (pos < 0 || pos > qtde) {
			return false;

		} else {
			while (cont < pos) {
				busca = busca.next;
				cont++;
			}
			return busca.obj;
		}

	}

	@Override
	public void remove(int pos) {
		int cont = 0;
		No busca = cabeca;

		if (cabeca == null) {

			JOptionPane.showMessageDialog(null, "Lista Vazia!! ");

		} else {
			//Caso a posicao seja 0 , entao o elemento é a cabeca;
			if (pos == 0) {
				cabeca = cabeca.next;
				//Caso a posicao seja a ultima, entao o elemento é a calda;
			} else if (pos == qtde - 1) {

				calda = calda.next;

			} else {
				/*
				 Caso o Elemento esteja dentro da lista e ele sera buscado até a pos -1 e o proximo elemento será o que 
				 queremos encontrar, para remover o elemento passaremos a referencia para o proximo
				 */
				while (cont < pos-1 && busca.next != null) {
					busca = busca.next;
					cont++;
				}
					busca.next = busca.next.next;
			}
			
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
	
	public void imprimir(){
		No auxiliar = cabeca;
		int cont = 0;
		while(cont != qtde){
			System.out.println( cont + " - "+  auxiliar.obj);
			auxiliar = auxiliar.next;
			cont++;
		}
		System.out.println("\n");
	}
}
