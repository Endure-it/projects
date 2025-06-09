

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class estoqueLista {
    record Produto(
            String nome,
            int quantidade) {
    };

    static List<Produto> armazem = new ArrayList<>();
    // armazem = []
    // produtos [{nome: teste1, quant: 10}, null, null, null, null] => array

    // [prod1, prod2, prod3]
    // [prod1, prod3]
    static Scanner input = new Scanner(System.in);

    static int menuPrincipal() {
        System.out.println("--- Estoque ---");
        System.out.println("1 - armazenar produto novo");
        System.out.println("2 - olhar estoque");
        System.out.println("3 - vender produto");
        System.out.println("4 - pesquisar");
        System.out.println("5 - sair do programa");
        System.out.println("Opçao:");
        int opcao = input.nextInt();
        input.nextLine();
        return opcao;
    }

    static void adicionarProduto(String nome, int quantidade) {
        Produto produtoNovo = new Produto(nome, quantidade);
        armazem.add(produtoNovo);
    }

    static void menuAdProduto() {
        System.out.println("--- gerenciamento de estoque ---");
        System.out.println("Produto:");
        String produto = input.nextLine();
        System.out.println("Quantidade em estoque:");
        int quantidade = input.nextInt();
        input.nextLine();
        adicionarProduto(produto, quantidade);
    }

    static void olharEstoque() {
        System.out.println("--- Estoque ---");
        if (armazem.isEmpty()) {
            System.out.println("ainda não foi adicionado um produto");
            return;
        } 

        imprimirProdutos(armazem);
    

        //armazem[{produto: "teste", quantidade: 40}, {produto: "teste2", quantidade: 60}]
    }
    static void menuVenda(){
        System.out.println("--- venda de produtos ---");
        olharEstoque();
        System.out.println("qual produto vc deseja vender(digite o numero dele):");
        int qualVaiSerVendido = input.nextInt();input.nextLine();
        qualVaiSerVendido -=1;

        if (qualVaiSerVendido > armazem.size() || qualVaiSerVendido < 0){
            System.out.println("esse produto não existe");
            return;
        }

        Produto produtoASerVendido = armazem.get(qualVaiSerVendido);

        
        System.out.println("quantos foram vendidos?:");

        int quantosFoiVendido = input.nextInt();input.nextLine();
        int quantosTinha = produtoASerVendido.quantidade();
        String produto = produtoASerVendido.nome();
        int novaQuantia = quantosTinha-quantosFoiVendido;
        if (novaQuantia < 0) {
            System.out.println("Vendendo todos os produtos!");
            novaQuantia = 0;
        }
        produtoASerVendido = new Produto(produto, novaQuantia);
        
        armazem.set(qualVaiSerVendido, produtoASerVendido);
    }

    static List<Produto> pesquisarNome() {
        System.out.println("Por favor digite a sua pesquisa: ");
        String pesquisa = input.nextLine();
        
        List<Produto> produtosPesquisa = new ArrayList<>();
        
        

        for (int i = 0; i < armazem.size(); i++) {
            if(armazem.get(i).nome.contains(pesquisa)){
                produtosPesquisa.add(armazem.get(i));
            }
        }

        return produtosPesquisa;
    }

    static void imprimirProdutos(List<Produto> produtos) {
        if (produtos.isEmpty()){ //produtos = []
            System.out.println("Não tem produtos nessa lista!");
        }
        for (int i = 0; i < produtos.size(); i += 1) {
            Produto produto = produtos.get(i);
            System.out.printf("Produto[%d]:%s\n", i + 1, produto.nome());
            System.out.printf("Quantidade[%d]:%s\n", i + 1, produto.quantidade());
        }
    }
    static public void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<Integer>();

        /*
         * menu
         * opçao de armazenar nome e quantidade
         * opçao de olhar o estoque
         * opçao de venda --> olhar o estoque e mudar a quantidade
         */
        boolean continuar = true;
        while (continuar) {
            int opcao = menuPrincipal();
            switch (opcao) {
                case 1:

                    menuAdProduto();
                    break;
                case 2:
                    olharEstoque();
                    break;
                case 3:
                    menuVenda();
                    break;
                case 4:
                    List<Produto> pesquisaProdutos = pesquisarNome();
                    imprimirProdutos(pesquisaProdutos);
                    break;
                case 5:
                    System.out.println("saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("dado invalido");
                    break;
            }
        }
    }
}
