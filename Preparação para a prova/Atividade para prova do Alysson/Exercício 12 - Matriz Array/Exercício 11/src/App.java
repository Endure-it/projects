import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao calculador de matriz, após inserir 3 números a primeira linha é criada");
        int N = 9;
        int M[] = new int [N];
        for(int i = 0; i < N; i++ ){
            System.out.printf("Insira o número %d:", (i+1));
            M[i] = input.nextInt();
        }

        //assim que se imprime uma matriz
        System.out.println(M[0] + " " + M[1] + " " + M[2] + "\n" +
                           M[3] + " " + M[4] + " " + M[5] + "\n" +
                           M[6] + " " + M[7] + " " + M[8]);

        //somas de posição de 1 em 1
        //linhas
        int lin1=0;
        int lin2=0;
        int lin3=0;

                //linha 1
                        for(int b = 0; b < N; b+=3){
                                lin1 = M[b] + M[b+1] + M[b+2];
                                break;
                        }
                
                //linha 2
                        for(int c = 3; c < N; c+=0){
                                lin2 = M[c] + M[c+1] + M[c+2];   
                                break;
                        }

                //linha 3
                            for(int d = 6; d < N; d+=0){
                                lin3 = M[d] + M[d+1] + M[d+2];
                                break;
                        }

        //colunas
        int con1=0;
        int con2=0;
        int con3=0;

                //Coluna 1
                        for(int e = 0; e < N; e+=3){
                                con1 = M[e] + M[e+3] + M[e+6];
                                break;
                        }
                
                //Coluna 2
                        for(int f = 1; f < N; f+=0){
                                con2 = M[f] + M[f+3] + M[f+6];   
                                break;
                        }

                //Coluna 3
                            for(int g = 2; g < N; g+=0){
                                con3 = M[g] + M[g+3] + M[g+6];
                                break;
                        }

        //diagonais
        int dig1=0;
        int dig2=0;

                //Diagonal 1
                        for(int h = 0; h < N; h+=3){
                                dig1 = M[h] + M[h+4] + M[h+8];
                                break;
                        }
                
                //Diagonal2
                        for(int j = 2; j < N; j+=0){
                                dig2 = M[j] + M[j+2] + M[j+4];   
                                break;
                        }

        

        //printando linhas
            System.out.printf("Soma de cada linha%nLinha 1: %d%nLinha 2: %d%nLinha 3: %d%n%n", lin1, lin2, lin3);

            System.out.printf("Soma de cada coluna%nColuna 1: %d%nColuna 2: %d%nColuna 3: %d%n%n", con1, con2, con3);

            System.out.printf("Soma de cada diagonal%nDiagonal principal: %d%nDiagonal secundária: %d%n", dig1, dig2);


        input.close();
    }
}


/*
Crie um programa que trabalhe com uma matriz 3x3, preenchendo-a com valores
Informados pelo usuário e depois calcule a soma de cada linha, cada coluna e as diagonais.
 */

/*
 * "                Soma de cada linha:\r\n" + //
                                "                Linha 0: 6\r\n" + //
                                "                Linha 1: 15\r\n" + //
                                "                Linha 2: 24
 */



 /*
  * 
  Forma correta de se resolver esse problema de maneira mais simplificada
  import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Bem-vindo ao calculador de matriz 3x3");

        // Leitura dos elementos da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Insira o número para posição [%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        // Impressão da matriz
        System.out.println("\nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Cálculo das somas
        int[] somaLinhas = new int[3];
        int[] somaColunas = new int[3];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
                if (i == j) somaDiagonalPrincipal += matriz[i][j];
                if (i + j == 2) somaDiagonalSecundaria += matriz[i][j];
            }
        }

        // Exibição dos resultados
        System.out.println("\nSoma das linhas:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Linha %d: %d%n", i + 1, somaLinhas[i]);
        }

        System.out.println("\nSoma das colunas:");
        for (int j = 0; j < 3; j++) {
            System.out.printf("Coluna %d: %d%n", j + 1, somaColunas[j]);
        }

        System.out.println("\nSoma das diagonais:");
        System.out.printf("Diagonal principal: %d%n", somaDiagonalPrincipal);
        System.out.printf("Diagonal secundária: %d%n", somaDiagonalSecundaria);

        input.close();
    }
}
  */