#include<stdio.h>
#include<stlib.h>
int h(int a, int b) {
    if (a == 0) {
        return b + 1;
    } else if (a > 0 && b == 0) {
        return h(a - 1, 1);
    } else if (a > 0 && b > 0) {
        return h(a - 1, h(a, b - 1));
    }
}

// Chamada: h(3, 3)
// Retorno: 61
// Número de chamadas realizadas: 289
