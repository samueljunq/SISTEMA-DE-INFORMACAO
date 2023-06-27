#include<stdio.h>
#include<stlib.h>
int verificaOrdemCrescente(struct Node* head) {
    struct Node* atual = head;

    while (atual != NULL && atual->prox != NULL) {
        if (atual->dado > atual->prox->dado) {
            return 0; // Lista n�o est� em ordem crescente
        }
        atual = atual->prox;
    }

    return 1; // Lista est� em ordem crescente
}
