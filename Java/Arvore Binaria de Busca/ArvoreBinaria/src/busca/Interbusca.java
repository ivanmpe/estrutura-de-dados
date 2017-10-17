package busca;

public interface Interbusca {
	void inserir(int x); 
	No busca(int x);
	void delete(No t, No z); 
	No sucessor(No no);
	No antecessor(No no);
	No min(No raiz);
	No max(No raiz);
	
}
