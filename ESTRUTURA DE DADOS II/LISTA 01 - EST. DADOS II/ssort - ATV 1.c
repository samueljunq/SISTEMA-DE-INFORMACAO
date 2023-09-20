#include <stdio.h>
#include <string.h>

void ssort(char arr[], int n) {
    int i, j;
    char temp;
    
    for (i = 0; i < n - 1; i++) {
        for (j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                // Trocar os caracteres se estiverem fora de ordem
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

int main() {
    char arr[] = "bacdefa";
    int n = strlen(arr);

    printf("Array original: %s\n", arr);
    ssort(arr, n);
    printf("Array ordenado: %s\n", arr);

    return 0;
}
