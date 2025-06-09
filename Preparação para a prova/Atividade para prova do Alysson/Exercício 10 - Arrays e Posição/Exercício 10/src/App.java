import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de números á ser inserida");
        int N = input.nextInt();
        int arraysNumbers[] = new int [N];

            for (int i = 0; i < N; i++) {
                System.out.printf("Digite o número %d: ", (i + 1));
                arraysNumbers[i] = input.nextInt();
        }
            int maiorNum = arraysNumbers[0];
            int menorNum = arraysNumbers[0];
            int posMaior = 0;
            int posMenor = 0;

            //for para maior número
            for(int c = 1; c < N; c++){
                if(arraysNumbers[c]>maiorNum){
                            maiorNum = arraysNumbers[c];
                            posMaior = c;
                }
                if(arraysNumbers[c]< menorNum){
                            menorNum = arraysNumbers[c];
                            posMenor = c;
                }
            }
            System.out.printf("Maior número é %d (posição %d)%n", maiorNum, posMaior);
            System.out.printf("Menor número é %d (posição %d)", menorNum, posMenor);

    }

}


// Escreva um programa que encontre o maior e o menor valor em um array, bem como suas posições.
// Maior valor: 15 (posição 2)
// Menor valor: 2 (posição 1)

