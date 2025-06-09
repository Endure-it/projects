import java.util.Scanner;

public class NotaAluno {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);

        float notaAluno1;
        float notaAluno2;
        float notaAluno3;

        float media;

        float diferencaAluno1;
        float diferencaAluno2;
        float diferencaAluno3;

        System.out.printf("Nota do Aluno 1: ");
        notaAluno1 = input.nextFloat();

        System.out.printf("Nota do Aluno 2: ");
        notaAluno2 = input.nextFloat();

        System.out.printf("Nota do Aluno 3: ");
        notaAluno3 = input.nextFloat();

        media = (notaAluno1+notaAluno2+notaAluno3)/3;

        diferencaAluno1 = media - notaAluno1;
        diferencaAluno2 = media - notaAluno2;
        diferencaAluno3 = media - notaAluno3;

        System.out.printf("A mẽdia foi de %4.2f%n", media);
        System.out.printf("A nota do Aluno 1 foi %4.2f e a diferença para a média foi de %4.2f%n", notaAluno1, diferencaAluno1);
        System.out.printf("A nota do Aluno 2 foi %4.2f e a diferença para a média foi de %4.2f%n", notaAluno2, diferencaAluno2);
        System.out.printf("A nota do Aluno 3 foi %4.2f e a diferença para a média foi de %4.2f%n", notaAluno3, diferencaAluno3);


        input.close();
    }
}