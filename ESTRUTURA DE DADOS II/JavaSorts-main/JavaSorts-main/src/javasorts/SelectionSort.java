package javasorts;

import java.util.Scanner;

public class SelectionSort {
    public static long compara=0,trocas=0;

    private static int indexMinArray(int array[], int posAtual){
       int k = posAtual; // k é o indice do menor
       for(int i=posAtual+1;i<array.length;i++){
           compara++;
           if(array[i]<array[k])
               k = i;
       }// fim for    
       return k; // indice do menor valor
    }// fim indexMinArray
//----------------------------------     
    public static void sSort(int array[]){
         for(int i=0;i<array.length-1;i++){
             int k = indexMinArray(array, i);
             // trocar valores de i com k
             trocas++;
             int temp = array[i];
             array[i] = array[k];
             array[k] = temp;
         }
    }
//--------------------------------------------    
        public static void sSortComentado(int array[]){
         Scanner scanner = new Scanner(System.in);
         for(int i=0;i<array.length-1;i++){
             System.out.println("Fase "+ i);
             int k = indexMinArray(array, i);
             System.out.println
               ("Atual:"+array[i]
                +" Trocando com menor valor: "+array[k]);
             scanner.nextLine();//pausa
             // trocar valores de i com k
             int temp = array[i];
             array[i] = array[k];
             array[k] = temp;
             //------------------ mostrando o vetor
             JavaSorts.printArray(array);
             scanner.nextLine();//pausa
         }
    }
}
