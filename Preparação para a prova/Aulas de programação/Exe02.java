import java.util.Scanner;

public class Exe02 {
	static public void main(String[] args){
		int totalAlunos = 0;
		int totalAprovados = 0;
		float percentual = 0F;
		float totalNotas = 0F;
		float mediaTurma = 0F;

		Scanner input = new Scanner(System.in);
		System.out.println("Quantos alunos na turma?");
		totalAlunos = input.nextInt();
		for(int i=1;i<=totalAlunos;i+=1){
			System.out.printf("Qual a nota do aluno %d?%n",i);
			float notaAluno = input.nextFloat();
			totalNotas += notaAluno;
			if(notaAluno>=7.0F){
				totalAprovados += 1; // totalAprovados = totalAprovados + 1;
	
			}
		}
		mediaTurma = totalNotas/totalAlunos;
		System.out.printf("Resultados");
		System.out.printf("Total de Alunos: %d%n", totalAlunos);
		System.out.printf("Média turma: %4.2f%n",mediaTurma);
		percentual = (100*totalAprovados)/totalAlunos;
		System.out.printf("Qtde Alunos aprovados %d (%4.2f%%)%n", totalAprovados, percentual);
		input.close();
	}
}
