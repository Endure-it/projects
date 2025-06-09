import java.util.Scanner; // Importa a classe Scanner para ler entrada do usuário

public class App {

    // Função para remover espaços e pontuações simples da frase
    static public String removeEspaco(String s) {
        String semEspaco = s
                            .replace(" ", "")   // Remove espaços
                            .replace(";", "")   // Remove ponto e vírgula
                            .replace(".", "")   // Remove ponto final
                            .replace(":", "")   // Remove dois pontos
                            .replace("-", "");  // Remove hífen
        return semEspaco; // Retorna a string "limpa"
    }

    // Função que inverte a string manualmente, caractere por caractere
    static public String inverte(String s){
        String invertida = "";
        // Começa do último caractere até o primeiro
        for(int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i); // Concatena os caracteres na ordem inversa
        }
        return invertida; // Retorna a string invertida
    }

    // Função principal que verifica se uma frase é um palíndromo
    static public boolean ehPalindromo(String frase){
        String fraseLimpa = removeEspaco(frase);     // Remove espaços e pontuações
        String fraseInvertida = inverte(fraseLimpa); // Inverte a frase limpa
        return fraseLimpa.equalsIgnoreCase(fraseInvertida); // Compara ignorando maiúsculas/minúsculas
    }

    // Método principal que executa o programa
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Cria o objeto para ler a entrada do usuário
        System.out.println("Informe a frase: "); // Solicita a frase
        String frase = input.nextLine(); // Lê a linha inteira

        // Verifica se é palíndromo e imprime o resultado
        if(ehPalindromo(frase)){
            System.out.printf("A frase '%s' é palíndromo!", frase);
        } else {
            System.out.printf("A frase NÂO é palíndromo!");
        }

        input.close(); // Fecha o scanner para evitar vazamento de recurso
    }
}
