package javasorts;
import java.util.Random;
import java.util.Scanner;
public class JavaSorts {
    static int menuEntrada(){
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("1-Gerar dados");
        System.out.println("2-Entrar com dados");
        op = scanner.nextInt();
        return op;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tamanho,op;
        long tempoInicial,tempoFinal;
        
        System.out.println("Tamanho do vetor:");
        tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        op = menuEntrada();
        switch(op){
            case 1:for(int i=0;i<vetor.length;i++)
                        vetor[i] = rand.nextInt(100);
            break;   
            case 2: System.out.println("Dados vetor:");
                    for(int i=0;i<vetor.length;i++)
                        vetor[i] = scanner.nextInt();
            break;        
       }// fim switch
        System.out.println("Vetor original:");
        //printArray(vetor);
        //Bubble Sort
        tempoInicial = System.currentTimeMillis();
        BubbleSort.bSort(vetor);
        tempoFinal = System.currentTimeMillis();
        System.out.println
          ("Comparacoes:"+BubbleSort.compara);
        System.out.println("Trocas:"+BubbleSort.trocas);
        System.out.println("Tempo:"+(tempoFinal-tempoInicial));
        
       //SelectionSort.sSortComentado(vetor);
        //InsertionSort.iSortComentado(vetor);
        System.out.println("Vetor ordenado");
        //printArray(vetor);
    }
    
    public static void printArray(int array[]){
          for(int i=0;i<array.length;i++)
              System.out.print(array[i]+"| ");
          
          System.out.println("\n");
    }// fim printArray
    
}
