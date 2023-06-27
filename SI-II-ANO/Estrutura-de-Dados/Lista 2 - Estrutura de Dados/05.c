#include<stdio.h>
#include<stlib.h>
void decimalParaBinario(int decimal) {
    if (decimal > 0) {
        decimalParaBinario(decimal / 2); // Chama a função recursivamente com a divisão inteira por 2
        printf("%d", decimal % 2); // Imprime o resto da divisão por 2 (bit menos significativo primeiro)
    }
}
