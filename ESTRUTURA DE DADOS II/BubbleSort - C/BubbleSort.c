#include <stdio.h>
#include <stdlib.h>

void mostraVetor(int v[], int tam) {
    for(int i = 0; i < tam; i++) {
        printf("%d |", v[i]);
    }
}

void bSort(int v[], int tam) {
    int temp;

    for(int fase = 1; fase < tam; fase++) {
        int trocaFase = 0;
        printf("Fase: %d\n", fase);
        mostraVetor(v, tam);
        getchar();

        for(int comp = 0; comp < tam - fase; comp++){
            printf("Comparando: %d e %d\n", v[comp], v[comp + 1]);
            if(v[comp] > v[comp + 1]) {
                temp = v[comp];
                v[comp] = v[comp + 1];
                v[comp + 1] = temp;
                trocaFase = 1;
            }
        }

        if(trocaFase == 0) {
            return;
        }
    }
}

int main() {
    int tam;

    printf("Digite o tamanho do vetor: ");
    scanf("%d", &tam);

    int vet[tam];

    for(int i = 0; i < tam; i++) {
        vet[i] = rand()%50;
    }

    printf("Array original:\n");
    mostraVetor(vet, tam);
    printf("\n");

    bSort(vet, tam);

    printf("Array ordenado:\n");
    mostraVetor(vet, tam);
    getchar();

    return 0;
}