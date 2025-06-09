import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numbers = 3;
        int Array[] = new int [numbers];

            for (int i = 0; i < numbers; i++) {
                System.out.printf("Digite o número %d: ", (i + 1));
                Array[i] = input.nextInt();
        }
        
            if((Array[0] + Array[1] > Array[2]) || (Array[0] + Array[2] > Array[1]) || (Array[1] + Array[2] > Array[0]) ){
                System.out.println("Os valores podem formar um triângulo.");
                        if (Array[0] == Array[1] && Array[1] == Array[2]) {
                            System.out.println("Seu triângulo é equilátero (todos os lados iguais)");

                        } 
                        
                        else if (
                            (Array[0] == Array[1] && Array[0] != Array[2]) || (Array[0] == Array[2] && Array[0] != Array[1]) ||(Array[1] == Array[2] && Array[1] != Array[0])
                        ) {
                            System.out.println("Seu triângulo é isósceles (dois lados iguais)");
                        } 
                        
                        else {
                            System.out.println("Seu triângulo é escaleno (todos os lados diferentes)");
                        }

                    } 
                    
                    else {
                        System.out.println("Condições não atendidas para a formação de um triângulo");
                    }

                    input.close();
            }
    }



//precisa de um laço for para preencher o array em loop


/*   CONDIÇÃO DE AND(&&)
int a = 10;
if (a > 5 && a < 20) {
    System.out.println("O número está entre 5 e 20");
}
*/


/*   CONDIÇÃO DE OR(||)
int b = 30;
if (b < 0 || b > 25) {
    System.out.println("O número é menor que 0 ou maior que 25");
}
*/

/*  OS DOIS JUNTOS
int x = 5, y = 10;
if ((x == 5 || x == 7) && y == 10) {
    System.out.println("x é 5 ou 7, e y é 10");
}
*/

/*  CONDIÇÃO DE NOT(!)
if (!(x > 10 && y < 5)) {
    System.out.println("A condição NÃO foi satisfeita.");
}
*/

/*  IF PARA STRINGS
String nome = "joão";
if (nome.equalsIgnoreCase("joão")) {
    System.out.println("Nome é João (ignorado maiúsculas/minúsculas)");
}
*/

/*  IF PARA DIFERENÇA(!=)
int a = 2;
int b = 1;
if (a != b) {
    System.out.println("Os valores são diferentes.");
}
*/

