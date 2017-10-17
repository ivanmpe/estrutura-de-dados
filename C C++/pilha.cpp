#include <stdio.h>
#include <stdlib.h>
struct TipoCelula{
	int item;
	TipoCelula *prox;
};


int contador;
TipoCelula *topo;
bool pilha_construtor()
{
	topo = NULL;
	contador=0;	
}


bool pilha_vazia(){
	if(topo == NULL){
		return true;
	} else {
		return false;
	}
}
int size(){
	return contador;
}

bool push(int valor ){
	
	TipoCelula *novaCelula = (TipoCelula*)malloc(sizeof(TipoCelula));	

	if(novaCelula == NULL){
		return false;		
	} else {
		novaCelula->item=valor;
		novaCelula->prox=topo;
		topo = novaCelula;
		contador++;
		return true;
	}
	
}

bool pop(){
	if(pilha_vazia()){
		return false;
	} else {
		TipoCelula *temp;
		//valor = topo->item;
		topo = topo->prox;
		temp->prox=NULL;
		free(temp);
		contador--;
		return true;
	}
}


int getTopo(){
	int numero;
	return numero = topo->item;
}

int main(){

	push(10);
	push(20);
	push(30);
	//pop();
	int tamanho = size();
	int topoPilha = getTopo();
	
	printf("Tamanho da pilha eh %i, topo da pilha eh %i", tamanho, topoPilha);


	return 0;
}
