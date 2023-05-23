#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include "lista.h"  

//-----------------------
int funcaoHash(int k){
	// k chave vai sera o primeiro caracterer do nome
	return k%65; // 
}
//-----------------------
int insereHash(tlista tabHash[],tdado x){
    int map = funcaoHash(x.nome[0]);
	insereOrdenado(&tabHash[map],x);	
	return map;	
}
//-------------------------
void printHash(tlista vet[], int n){
	int i;
	for(i=0;i<n;i++){
	   if(vet[i].head!=NULL){ // nao ta vazia	
			printf("[%d]->",i);
			printList(vet[i]);
			printf("\n");
		}
	}
	
}
//-------------------------
float buscaHash(tlista tabHash[],tdado x){
	int map = funcaoHash(x.nome[0]);
	return buscaList(tabHash[map], x);
}
//--------------------------

int menu(){
	int op;
	printf("*** IFSULDEMINAS - Campus Machado ***\n");
	printf("*** Linked Hash *** \n");
	printf("1-Inserir\n");
	printf("2-Buscar\n");
	printf("3-Remover\n");
	printf("4-Carregar\n");
	printf("0-Sair\n");
	scanf("%d",&op);
	return op;
}
//-----------------------------------------
int main() 
{ 
   int op, r;
   tdado x;
   tlista tabHash[26]; // Cada posicao da tabela hash contem uma lista que armazena nomes iniciados com a mesma letra.
   inicializa(tabHash,26);
   do{
   	printHash(tabHash,26);
	printf("\n");
   	op = menu();
   	switch(op){
   		case 1: 
			printf("Dados: Nome:");
   			fflush(stdin); gets(x.nome);
   			x.nome[0] = toupper(x.nome[0]);
   			printf("Idade:");
   			scanf("%d",&x.idade);
   			printf("Media:");
   			scanf("%f",&x.media);
   			r=insereHash(tabHash, x);
   			printf("Inserido na posicao:%d\n",r);
   			break;
		case 2:
			printf("Digite o nome que voce busca: ");
			fflush(stdin);
			gets(x.nome);
			x.nome[0] = toupper(x.nome[0]);
			float media = buscaHash(tabHash, x);
			if(media != -1.0) {
				printf("A Media: %.2f\n", media);
			}else {
				printf("O Nome nao foi encontrado!!!");
			}
			break;
   		case 0:
		break;   	
	}// fim switch
   	getch();
   	system("CLS");
   }while(op!=0);
} 
