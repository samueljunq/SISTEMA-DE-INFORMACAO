#include<stdio.h>
#include<stlib.h>
void decimalParaBinario(int decimal) {
    if (decimal > 0) {
        decimalParaBinario(decimal / 2); // Chama a fun��o recursivamente com a divis�o inteira por 2
        printf("%d", decimal % 2); // Imprime o resto da divis�o por 2 (bit menos significativo primeiro)
    }
}
