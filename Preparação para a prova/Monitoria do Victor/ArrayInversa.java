package monitoria;

import java.util.Scanner;

public class ArrayInversa {
    public static void main(String[] args) {
        //Crie um programa que leia 5 números inteiros e armazene-os em um array. Em seguida,
        //imprima os números na ordem inversa

        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite um número para colocar na posição " + (i+1));
            int numero = input.nextInt();
            numeros[i] = numero;
        }

        for (int i = numeros.length-1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
    }
}
