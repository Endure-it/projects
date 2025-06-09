import java.util.Scanner;

public class Media {

    static final float mediaAprovacao = 6.0F;

    public static void mostrarResultado(String nomeAluno, float media){
        if(foiAprovado(media)){
            System.out.printf("O aluno %s foi aprovado com a média %4.3f%n", nomeAluno, media);
        }
        else{
            System.out.printf("O aluno %s foi REPROVADO com a média %4.3f%n", nomeAluno, media);

        }
    }

    public static boolean foiAprovado(float media){
        return media >= mediaAprovacao;
    }

    public static float calculaMedia(float[] notas){
        float soma = 0F;
        // for(int i=0;i<notas.length;i++){
        //     soma += notas[i];
        // }
        for(float nota: notas){
            soma += nota;
        }
        return soma/notas.length;
    }
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        String aluno;
        float[] notas = new float[4];

        System.out.println("Qual o nome do aluno? ");
        aluno = input.nextLine();
        System.out.println("Informe as 4 notas do aluno:");
        notas[0] = input.nextFloat();
        notas[1] = input.nextFloat();
        notas[2] = input.nextFloat();
        notas[3] = input.nextFloat();
        mostrarResultado(aluno, calculaMedia(notas));
        input.close(); 
    }
}
