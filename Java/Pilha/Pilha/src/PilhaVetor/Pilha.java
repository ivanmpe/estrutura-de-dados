package PilhaVetor;

/*
 * Francisco Ivan de Sousa Alves - Matricula 20132045050108
 */
import javax.swing.JOptionPane;

public class Pilha implements InterPilha {
	
	private Object vetor[] ;
	int qtde = 0;
		
	@Override
	public void push(Object obj) {
		vetor[qtde] = obj;
		qtde++;
	}

	@Override
	public void pop() {
		
		if(qtde > 0){
			vetor[qtde] = null;
			 qtde --;
		} else{
			JOptionPane.showInputDialog("Lista Vazia!");
		}
				
	}

	@Override
	public Object top() {
		return vetor[qtde];
	}

	@Override
	public int size() {
		return qtde;
			
	}

}
