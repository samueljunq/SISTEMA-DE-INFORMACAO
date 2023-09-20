#include<stdio.h>
#include<stlib.h>
	void bubbleSort(int v[], int n) {
    int i, j;
    int aux;
    bool swapped;
    
    for (i = 0; i < n - 1; i++) {
        swapped = false;
        for (j = 0; j < n - i - 1; j++) {
            if (v[j] > v[j + 1]) {
                aux = v[j];
                v[j] = v[j + 1];
                v[j + 1] = aux;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
}

