package monitoria;

import java.util.Scanner;

public class Matriz {
    //Exercício 12
    //Crie um programa que trabalhe com uma matriz 3x3, preenchendo-a com valores
    //informados pelo usuário e depois calcule a soma de cada linha, cada coluna e as diagonais

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] numeros = new int[3][3];

        // 0 => [v0,v1,v2]
        for(int linha = 0; linha < numeros.length; linha++){
            for(int coluna = 0; coluna < numeros[linha].length; coluna++){
                System.out.print("Digite um número na linha " + (linha + 1) + " e coluna " + (coluna + 1) + ": ");
                int numero = input.nextInt();
                numeros[linha][coluna] = numero;
            }
            System.out.println();
        }

        mostraSomaLinhaMatriz(numeros);
        mostraSomaColunaMatriz(numeros);
        mostraSomaDiagonalPrimaria(numeros);
        mostraSomaDiagonalSecundaria(numeros);
    }
    
    static void mostraSomaLinhaMatriz(int[][] matriz){
        for(int l = 0; l < matriz.length; l++){
            int totalLinha = 0;
            for(int c = 0; c < matriz[l].length; c++){
                totalLinha += matriz[l][c];
            }
            System.out.println("Total da linha " + (l+1) + ": " + totalLinha);
        }
    }

    static void mostraSomaColunaMatriz(int[][] matriz){
        for(int l = 0; l < matriz.length; l++){
            int totalColuna = 0;
            for(int c = 0; c < matriz[l].length; c++){
                totalColuna += matriz[c][l];

                // totalLinha += [0][0] [0][1] [0][2]
                // totalColuna += [0][0] [1][0] [2][0]
            }
            System.out.println("Total da coluna " + (l+1) + ": " + totalColuna);
        }
    }

    static void mostraSomaDiagonalPrimaria(int[][] matriz){
        int totalDiagonal = 0;
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                if(l == c){
                    totalDiagonal += matriz[l][c];
                }
            }
        }

        System.out.println("Total da diagonal primaria: " + totalDiagonal);
    }

    static void mostraSomaDiagonalSecundaria(int[][] matriz){
        int totalDiagonal = 0;
        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c < matriz[l].length; c++){
                if((l == 0 && c == 2) || (l == 1 && c == 1) || (l == 2 && c == 0)){
                    totalDiagonal += matriz[l][c];
                }
            }
        }

        System.out.println("Total da diagonal secundaria: " + totalDiagonal);
    }


}
