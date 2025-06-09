package monitoria;

public class ArrayMaiorMenorNumero {
    // Escreva um programa que encontre o maior e o menor valor em um array, bem como suas posições

    public static void main(String[] args) {
        int[] numeros = {3, 10, 6, -1};

        int indiceMaiorNumero = 0;
        int indiceMenorNumero = 0;
        for (int i = 0; i < numeros.length; i++){
            if (ehMaiorNumero(numeros[i], numeros[indiceMaiorNumero])){
                indiceMaiorNumero = i;
            }
            if (ehMenorNumero(numeros[i], numeros[indiceMenorNumero])){
                indiceMenorNumero = i;
            }
        }

        System.out.println("O maior número é: " + numeros[indiceMaiorNumero] + " na posição " + (indiceMaiorNumero + 1));
        System.out.println("O menor número é: " + numeros[indiceMenorNumero] + " na posição " + (indiceMenorNumero + 1));

    }

    static boolean ehMaiorNumero(int numero, int maiorNumero) {
        if (numero > maiorNumero){
            return true;
        } else {
            return false;
        }
    }

    static boolean ehMenorNumero(int numero, int menorNumero){
        if (numero < menorNumero){
            return true;
        } else {
            return false;
        }
    }

}
