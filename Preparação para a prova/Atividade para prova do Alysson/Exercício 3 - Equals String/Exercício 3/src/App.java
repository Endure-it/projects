import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número");
        float n1 = input.nextFloat();
        System.out.println("Insira o segundo número");
        float n2 = input.nextFloat();
        System.out.println("Insira a operação: (adição = (+) , subtração = (-) , multiplicação = (*) e divisão = (/)) ");
        String Operacao = input.next();

        if(Operacao.equals("+")){
            System.out.printf(" %.2f + %.2f = %.2f ", n1 , n2 , n1+n2);
        }
        
        if(Operacao.equals("-")){
            System.out.printf(" %.2f + %.2f = %.2f ", n1 , n2 , n1-n2);
        }

        if(Operacao.equals("*")){
            System.out.printf(" %.2f + %.2f = %.2f ", n1 , n2 , n1*n2);
        }

        if(Operacao.equals("/")){
            System.out.printf(" %.2f + %.2f = %.2f ", n1 , n2 , n1/n2);
        }
    }
}

//Crie um programa que simule uma calculadora simples com as operações básicas (adição, subtração, multiplicação e divisão).
//"nome da String".equalsIgnoreCase = ignora maiúsculos e minúsculos
//"nome da String".equals
//inputs  = Double, float, int, e sem para string ou Line