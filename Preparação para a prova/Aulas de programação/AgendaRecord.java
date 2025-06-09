import java.util.Scanner;

public class AgendaRecord {

	private record Contato(
		String nome, 
		String telefone, 
		int idade
	){};

	static private Contato[] contatos = new Contato[100];
	static private int posicaoContato = 0;
	static private Scanner in = new Scanner(System.in);
		
	static private int menuPrincipal(){
		System.out.println(" - - Agenda de Telefone - -");
		System.out.println(" (1) Adicionar telefone");
		System.out.println(" (2) Procurar telefone");
		System.out.println(" (9) Sair");
		System.out.printf("Opção: ");
		int opcao = in.nextInt();in.nextLine();
		return opcao;
	}

	static private void menuAdicionarContato(){
		System.out.println(" - - Adicionando Contato - -");
		System.out.printf("Nome: ");
		String nome = in.nextLine();
		System.out.printf("Telefone: ");
		String telefone = in.nextLine();
		System.out.printf("Idade: ");
		int idade = in.nextInt();in.nextLine();
		adicionarContato(nome, telefone, idade);
	}

	static private void menuProcurarContato(){
		System.out.println(" - - Procurar um Contato - -");
		System.out.printf("Nome: ");
		String nome = in.nextLine();
		int pos = procurarContato(nome);
		if( (pos>=0) && (pos < posicaoContato)){
			System.out.println(" - - Contato Encontrado - -");
			System.out.printf("Nome: %s%n", contatos[pos].nome());
			System.out.printf("Telefone: %s%n", contatos[pos].telefone());
			System.out.printf("Idade: %d%n", contatos[pos].idade());
		}
		else {
			System.out.println("Contato não encontrado!");	
		}
		
	}

	static private void adicionarContato(String nome, String telefone, int idade){
		contatos[posicaoContato] = new Contato(nome,telefone,idade);
		posicaoContato += 1;
	}

	static private int procurarContato(String nome){
		for(int i=0;i<posicaoContato;i++){
			if(contatos[i].nome().equalsIgnoreCase(nome)){
				return i;
			}
		}
		return -1;
	}
	
	static public void main(String[] args){
		int opcao;
		while (true){
			opcao = menuPrincipal();
			if(opcao==9){
				break;
			}
			else if(opcao==1){
				menuAdicionarContato();
			}
			else if(opcao==2){
				menuProcurarContato();
			}
			else{
				System.out.println("Opção inválida!");
			}
		}
		in.close();
	}
}
