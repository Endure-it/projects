import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int N = input.nextInt();
        int contador = 1;
        int mult = 1;
            while(contador<=N){
                mult*=contador;
                contador++;
            }
            System.out.println(mult);
    }
}

// Fórmula: n! = n × (n-1) × (n-2) × ... × 2 × 1
