package Lista;
/*
 * Francisco Ivan de Sousa Alves - Matricula 20132045050108
 */
import javax.swing.JOptionPane;

public class Lista implements ListED {
	Object vetor[];
	int qtde = 0;

	@Override
	public void insert(Object obj) {
		vetor[qtde] = obj;
		qtde++;
	}

	@Override
	public void insert(Object obj, int pos) {
		if (vetor[pos] == null) {
			vetor[pos] = obj;
			qtde++;
		} else {
			JOptionPane.showMessageDialog(null, "Posicao " + pos
					+ " ja contem elemento!");
		}

	}

	@Override
	public Object getElement(int pos) {
		return vetor[pos];
	}

	@Override
	public void remove(int pos) {
		vetor[pos] = vetor[pos+1];
		qtde--;
	}

	@Override
	public int size() {
		return qtde;
	}

	@Override
	public boolean contains(Object obj) {
		int cont = 0;
		for (int i=0; i < qtde ;i++){
			if (vetor[i] == obj){
				cont++;	
			} 
				
		}
		if (cont>0){
			return true;
		}else{
			return false;
		}
		
	}

}
