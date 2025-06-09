import java.util.Scanner;

public class Loja {
    
    record Produto(
        String nome,
        int quantidade
    ){};

    static private Produto[] produtos = new Produto[100];
    static private int indiceNovoProduto = 0;

    static private Scanner input = new Scanner(System.in);

    static private int menuPrincipal(){
        System.out.println(" - - Menu Principal - - ");
        System.out.println(" (1) Adicionar novo produto ");
        System.out.println(" (2) Vender produto ");
        System.out.println(" (3) Catálogo de produtos ");
        System.out.println(" (9) Sair ");
        System.out.printf("Opção: ");
        String op = input.nextLine();
        return Integer.parseInt(op);
    }

    static private void menuCadastraProduto(){
        System.out.println(" - - Novo Produto - - ");
        System.out.printf("Nome: ");
        String nome = input.nextLine();
        System.out.printf("Quantidade: ");
        int quantidade = Integer.parseInt(input.nextLine());

        adicionarProduto(nome, quantidade);
    }

    static private void menuCatalogoProdutos(){
        for(Produto p: produtos){
            if(p==null){ // verifica se não há um produto criado no array
                break; // se não houver abandona o for
            }
            System.out.printf("Nome: %s%nEstoque: %d%n", p.nome(), p.quantidade());
            System.out.println("-----------------------");
        }
    }

    static private void menuVendaProduto(){
        System.out.println(" - - Venda Produto - - ");
        System.out.printf("Nome: ");
        String nome = input.nextLine();
        System.out.printf("Quantidade: ");
        int quantidade = Integer.parseInt(input.nextLine());

        venderProduto(nome, quantidade);
    }

    static private void adicionarProduto(String n, int q){
        produtos[indiceNovoProduto] = new Produto(n, q);
        indiceNovoProduto += 1;
    }

    static private void venderProduto(String nomeProduto, int quantidadeVendida){
        int indiceProduto = procurarProduto(nomeProduto);
        if(indiceProduto >= 0){
            if(quantidadeVendida <= produtos[indiceProduto].quantidade()){
                produtos[indiceProduto] = new Produto(
                    produtos[indiceProduto].nome(), 
                    produtos[indiceProduto].quantidade() - quantidadeVendida
                );
            }
            else {
                System.out.println("Não há estoque suficiente para a venda!");
            }
        }
        else {
            System.out.println("Produto não encontrado!");
        }
    }

    static private int procurarProduto(String produto){
        for(int i=0;i<indiceNovoProduto;i++){
            if(produtos[i].nome().equalsIgnoreCase(produto)){
                return i;
            }
        }
        return -1;
    }

    static public void main(String[] args){
        while(true){
            int opcao = menuPrincipal();
            if(opcao==1){
                menuCadastraProduto();
            }
            else if (opcao==2){
                menuVendaProduto();
            }
            else if (opcao==3){
                menuCatalogoProdutos();
            }
            else if (opcao ==9){
                break;
            }
            else {
                System.out.println("Opção Inválida!");
            }
        }
        input.close();
    }
}
