import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o capital inicial?");
        double C = input.nextDouble();
        System.out.println("Qual a taxa de juros?");
        double i = input.nextDouble();
        System.out.println("Qual o tempo em meses?");
        double t = input.nextDouble();
        double H = Math.pow((i + 1), t);
        double M = C * H;
        System.out.printf("Montante após %.0f meses: R$ %.2f", t, M);
        input.close();
    }
}


//Math.pow(base, expoente)
//N se converte de double para float só de double para double
//javac App.java
//App.java
//input.nextDouble
// %d = inteiro %f = double e float