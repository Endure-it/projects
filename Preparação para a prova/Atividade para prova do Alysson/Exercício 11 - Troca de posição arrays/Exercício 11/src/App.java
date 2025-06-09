import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantidade de números que a sequência terá");
        int N = input.nextInt();
        int arraysNumbers[] = new int [N]; 

        for(int i = 0; i < N; i++){
            System.out.printf("Digite o número %d: ", (i+1));
            arraysNumbers[i] = input.nextInt();
        }
        

        //posição atual
        for(int b = 0; b < N - 1; b++){
        int indiceMenor = b;
            

        //procurar menor
        for(int c = b+1 ; c < N; c++){
            if(arraysNumbers[c] < arraysNumbers[indiceMenor]){
                indiceMenor = c;
            }
        }
            int temp = arraysNumbers[b];
            arraysNumbers[b] = arraysNumbers[indiceMenor];
            arraysNumbers[indiceMenor] = temp;
    }
        for(int d = 0; d < N; d++){
            System.out.println(arraysNumbers[d]);
        }



        
    }
}






/*
Crie um programa que ordene um array de inteiros em ordem crescente usando o algoritmo
de seleção.
Algoritmo de seleção:
1. Encontre o menor elemento no array não ordenado
2. Troque-o com o primeiro elemento não ordenado


Para trocar número dentro de um array
int temp = arraysNumbers[b];
arraysNumbers[b] = arraysNumbers[indiceMenor];
arraysNumbers[indiceMenor] = temp;

*/