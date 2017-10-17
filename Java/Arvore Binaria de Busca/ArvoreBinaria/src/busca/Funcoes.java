package busca;

public class Funcoes implements Interbusca {

	private No raiz;
	private int qtde = 0;

	public void inserir(int x) {

		No novo = new No(x); // atribui o valor do x ha um novo No
		No aux = this.raiz; // Aux começara do no raiz

		if (raiz == null) { // Caso a arvore esteja vazia, entao atribuiremos
							// novo ha ela
			raiz = novo;

		} else { // Senao colocaremos em um No a esquerda ou a Direita

			while (aux != null) {

				if (novo.chave <= aux.chave) {/*
											 * caso o valor da raiz seja menor q
											 * valor a // ser inserido entao
											 * sera adicionado na esquerda
											 */

					if (aux.esq == null) {

						aux.esq = novo; // Achaamos uma Esquerda vazia, logo o
										// novo será atribuida para ela
						novo.pai = aux; // O pai do novo, serah o aux
						aux = null; // Damos null para o aux, fazendo assim q o
									// laço se interrompa

					} else {

						aux = aux.esq; // Caso nao acharmos uma esquerda vazia,
										// entao continuaremos buscando-a

					}
				} else {// se nao ele sera maior, entao sera colocado na direita

					if (aux.dir == null) {

						aux.dir = novo; // Achamos uma direita vazia, entao novo
										// será colocado la.
						novo.pai = aux; // O pai desse novo será o aux.
						aux = null; // damos null para aux, fazendo assim q Laço
									// se encerre

					} else { // Caso nao acharmos uma direita vazia, entao
								// continuaremos buscando-a
						aux = aux.dir;
					}
				}

			}

		}
		qtde++; // Quantidade de nos sera acrescida

	}

	@Override
	public No busca(int num) {

		No aux = raiz;// no atual recebe a raiz da arvore para começarmos a
						// busca do numero

		while (aux != null) {
			// se a chave q procuramos for igual ao aux, entao achou!
			if (num == aux.chave) {
				return aux;
				// se a chave for menor entao vamos procurar na esquerda!
			} else if (num < aux.chave) {
				aux = aux.esq;
			} else { // caso ambos nao satisfacam, logo procuraremos na direita!
				aux = aux.dir;
			}
		}
		// caso o No seja invalido entao retornara null
		return null;
	}

	public void transplant(No substituido, No substituidor) {

		if (substituido.pai == null)
			raiz = substituidor;
		else if (substituido == substituido.pai.dir)
			substituido.pai.dir = substituidor;
		else
			substituido.pai.esq = substituidor;
		if (substituidor != null) {
			substituidor.pai = substituido.pai;
		}

	}

	public void delete(No t, No z) {
		
		//Caso 1  = Caso o no seja folha
		if (z.esq == null && z.dir == null) {
			if (z.equals(z.pai.esq)) {
				System.out.println("Deletar - Caso 1 ");
				z.pai.esq = null;
				z.pai = null;
			} else {
				System.out.println("Deletar - Caso 1 ");
				z.pai.dir = null;
				z.pai = null;
			}
		// Caso 2 == tenha filho ha esquerda ou direita
		} else if (z.esq == null && z.dir != null) {
			transplant(z, z.dir);
			System.out.println("Deletar - Caso 2: ");
		} else if (z.esq != null && z.dir == null) {
			transplant(z, z.esq);
			System.out.println("Caso 2");
		}
		//Caso 3 == Caso tenha dois fihos!
		else{
			No y = new No();
			y = min(z.dir);
			if (y.pai != z){
				System.out.println("Deletar -  Caso 3.1");
				transplant(y, y.dir);
				y.dir = z.dir;
				y.dir.pai = y;		
			} else{
				System.out.println("Deletar - Caso 3.2");
				transplant(z, y);
				y.esq = z.esq;
				y.esq.pai = y;
			}
			
		}
	}
		
	public No min(No no) {

		No aux = no; // com aux percorremos até o No mais na esquerda

		while (aux.esq != null) {
			aux = aux.esq;
		}
		return aux;

	}

	@Override
	public No max(No no) {

		No aux = no; // Com o aux percorremos agora até o No mais direita

		while (aux.dir != null) {
			aux = aux.dir;
		}
		return aux;

	}

	public int size() {
		return qtde;
	}

	@Override
	public No sucessor(No no) {
		No sucessor = no;

		sucessor = sucessor.dir;

		while (sucessor.esq != null)
			sucessor = sucessor.esq;

		return sucessor;
	}

	public No antecessor(No no) {

		No antecessor = no;

		antecessor = antecessor.esq;

		while (antecessor.dir != null) {
			antecessor = antecessor.dir;
		}

		return antecessor;
	}
	// Encaminhamentos
	public void emOrdem(No no) {

		if (no != null) {
			emOrdem(no.esq);
			System.out.print(no.chave + " ");
			emOrdem(no.dir);
		}

	}

	public void preOrdem(No no) {

		if (no != null) { // Como colocamos ah raiz entao iniciarah por ela
			System.out.print(no.chave + " "); // mostra o valor do inicialmente
												// da raiz
			preOrdem(no.esq); // Depois de mostrar a raiz ir mostrar os
								// elementos q estao ha esquerda,
								// Caso nao exista mais No's na esquerda entao o
								// metodo para.
			preOrdem(no.dir); // terminou de mostar os q estao ha esquerda, vai
								// para os q estao a direita

		}

	}

	public void posOrdem(No no) {
		if (no != null) {
			posOrdem(no.esq);
			posOrdem(no.dir);
			System.out.print(no.chave + " ");
		}
	}

	public No first() {
		return raiz;

	}

}
