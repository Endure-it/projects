import java.util.Scanner;

public class Exe01 {
	static public void main(String[] args){
		final String usuarioLogin = "admin";
		final String senhaLogin = "123456";
		
		Scanner input = new Scanner(System.in);
		for(int numeroTentativa=3;numeroTentativa>0;numeroTentativa-=1){
			System.out.println("Sistem de Login");
			System.out.printf("Usuário: ");
			String usuario = input.nextLine();
			System.out.printf("Senha: ");
			String senha = input.nextLine();
			if(usuario.equals(usuarioLogin) 
				&& senha.equals(senhaLogin)) {
					System.out.println("Login realizado com Sucesso!");
					break;
				}
			else {
				System.out.printf("Credenciais inválidas. Tentativas restantes %d%n", numeroTentativa-1);
				
			}
		}	
	}
}
