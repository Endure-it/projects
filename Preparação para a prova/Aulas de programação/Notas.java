import java.util.Scanner;

public class Notas {

    static public void main(String[] args){
        Scanner input = new Scanner(System.in);

        float[] notas /*= new float[3]*/;
        float[] difs /*= new float[3]*/;
        float media = 0L;
        int qtdeAlunos;

        System.out.printf("Quantidade de alunos: ");
        qtdeAlunos = input.nextInt();

        notas = new float[qtdeAlunos];
        difs = new float[qtdeAlunos];

        for(int i=0;i<qtdeAlunos;i++){
            System.out.printf("Nota do aluno %d: ", i+1);
            notas[i] = input.nextFloat();
        }

        //media = (notas[0]+notas[1]+notas[2])/3;
        for(int j=0; j<qtdeAlunos;j++){
            media += notas[j];
        }
        media = media / qtdeAlunos;
        System.out.printf("A média foi %4.2f%n", media);
        for(int k=0;k<qtdeAlunos;k++){
            difs[k] = media - notas[k];
        }

        for(int l=0;l<qtdeAlunos;l++){
            System.out.printf("A nota do Aluno %d foi %4.2f e é %4.2f da média.%n", l+1, notas[l], difs[l]);
        }
        input.close();
    }
    
}
