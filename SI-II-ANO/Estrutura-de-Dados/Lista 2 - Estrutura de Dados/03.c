#include<stdio.h>
#include<stlib.h>
void removePares(struct Node** head) {
    struct Node* atual = *head;
    struct Node* anterior = NULL;

    while (atual != NULL) {
        if (atual->dado % 2 == 0) {
            if (anterior == NULL) {
                *head = atual->prox;
            } else {
                anterior->prox = atual->prox;
            }
            free(atual);
            atual = anterior->prox;
        } else {
            anterior = atual;
            atual = atual->prox;
        }
    }
}
