#include<stdio.h>
#include<stlib.h>
int somaVetor(int vetor[], int n) {
    if (n == 0) {
        return 0; // Caso base: vetor vazio, soma � zero
    } else {
        return vetor[n-1] + somaVetor(vetor, n-1); // Chama a fun��o recursivamente com um elemento a menos
    }
}
