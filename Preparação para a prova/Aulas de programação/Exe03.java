import java.util.Scanner;

public class Exe03 {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;
        int maxDivisor;
        boolean teveDivisor = false;

        System.out.println("Diga um número inteiro positivo: ");
        numero = input.nextInt();
        maxDivisor = (int) Math.round(Math.sqrt(numero))+1;
        if(numero%2==0){
            teveDivisor = true;
            System.out.printf("Divisores: 1, 2");
        }
        for(int i=3;i<maxDivisor;i+=2){
            if(numero%i==0){
                if(!teveDivisor){
                    System.out.printf("Divisores: 1, %d", i);
                }
                else{
                    System.out.printf(", %d", i);
                }
                teveDivisor = true;
            }
        }
        if(!teveDivisor){
            System.out.printf("O número %d é primo%n", numero);
        }
        input.close();
    }
}
