import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int N = input.nextInt();
        int soma = 0;
            for(int i = 1; i <= N; i++){
                soma= soma + i;
            }
            System.out.printf("%d", soma);
    }
}

// n * (n+1)/2

// (n/2) * (a1 + an)
