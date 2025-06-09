import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número");
        int N = input.nextInt();

            for(int i = 1; i <= N; i++ ){

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                        }           
                        else if (i % 3 == 0) {
                                    System.out.println("Fizz");
                        } 
                        else if (i % 5 == 0) {
                            System.out.println("Buzz");
                        } 
                        else {
                            System.out.println(i);
                        }
                    }
            }
    }

// for(inicializador; condição de parada; contador)