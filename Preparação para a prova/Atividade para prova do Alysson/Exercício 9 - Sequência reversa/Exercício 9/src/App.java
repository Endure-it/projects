    import java.util.Scanner;
    public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantidade de números que deseja inserir");
        int N = input.nextInt();
        int arraysNumbers[] = new int[N];
    
        for(int i = 0; i <= N-1; i++){
        System.out.printf("Insira o número %d: ", (i+1));
        arraysNumbers[i] = input.nextInt();
        }

        for(int C = N; C > 0; C--){
            System.out.printf("%d%n", arraysNumbers[C-1]);
        }

    }
    }