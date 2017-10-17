package FilaVetor;

import javax.swing.JOptionPane;

public class FilaVetor implements InterFila{
	private Object vetor[];
	int qtde = 0;
	
	
	
	public void insere(Object obj) {
		vetor[qtde] = obj;
		qtde++;
	}

	
	public void remove() {
		if( qtde == 0 ){
			JOptionPane.showMessageDialog(null,"Fila Vazia!");
					
		} else{
			for (int i = 0; i < (qtde - 1); i++) {
				vetor[i] = vetor[i + 1];
			}
			JOptionPane.showMessageDialog(null, "Removido!");}
		qtde--;
	}

	
	public void first() {
		if (qtde == 0){
			JOptionPane.showMessageDialog(null, "Fila Vazia! ");
			
		} else{
			JOptionPane.showMessageDialog(null,"Primeiro Elemento: " + vetor[0]);
		}
	}

	@Override
	public int size() {
		return qtde;
	}
	
}
