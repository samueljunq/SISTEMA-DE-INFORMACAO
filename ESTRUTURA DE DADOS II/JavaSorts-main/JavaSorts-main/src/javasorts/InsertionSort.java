
package javasorts;

import java.util.Scanner;

public class InsertionSort {
    public static long compara=0,deslocamento=0;
    private static void insert(int array[],int i){
        int eleito = array[i];
        int comp = i-1;
        while(comp>=0 && 
                eleito<array[comp]){
           compara++;   
        // deslocar
           array[comp+1] = array[comp];//deslocando
           deslocamento++;
           comp--;
        }// fim while
        compara++; // conta a comparacao de saida
       // inserindo o eleito na posicao correta 
       array[comp+1] = eleito;
    }// fim insert
    //-------------------------
     public static void iSort(int array[]){
        for(int i=1;i<array.length;i++)
            insert(array, i);
     }   
     //--------------------------------
    private static void insertComentado(int array[],int i){
        Scanner scanner = new Scanner(System.in);
        int eleito = array[i];
        int comp = i-1;
        System.out.println("Eleito:"+eleito);//
        scanner.nextLine();
        while(comp>=0 && 
                eleito<array[comp]){
        // deslocar
            System.out.println("Comparando ");
            System.out.println("v["+comp+"]="+array[comp]);
           array[comp+1] = array[comp];//deslocando
           comp--;
           JavaSorts.printArray(array);// mostra vetor
           scanner.nextLine();// pausa
        }// fim while
       // inserindo o eleito na posicao correta 
        System.out.println("Inserindo eleito indice:"+(comp+1));
       array[comp+1] = eleito;
       JavaSorts.printArray(array);// mostra vetor
       scanner.nextLine();// pausa
    }// fim insert
    //-------------------------
    public static void iSortComentado(int array[]){
        for(int i=1;i<array.length;i++){
            System.out.println("Fase "+i);
            insertComentado(array, i);
        }
     }   
}
