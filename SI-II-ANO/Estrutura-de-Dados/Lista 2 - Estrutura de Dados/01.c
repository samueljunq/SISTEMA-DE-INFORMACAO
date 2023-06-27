#include<stdio.h>
#include<stlib.h>
int pesquisa(struct Node* head, int valor) {
    struct Node* atual = head;

    while (atual != NULL) {
        if (atual->dado == valor) {
            return 1; // Dado encontrado
        }
        atual = atual->prox;
    }

    return 0; // Dado não encontrado
}
