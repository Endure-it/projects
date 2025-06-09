
import java.util.ArrayList;
import java.util.List;

public class Batalha {
    private record Entidade(
            String nome,
            int vida,
            int ataque,
            int defesa) {
    };

    static List<Entidade> entidades = new ArrayList<>();
    static List<Entidade> copia = new ArrayList<>();

    static private void criarEntidade(String nome, int vida, int ataque, int defesa) {
        Entidade entidadeNova = new Entidade(nome, vida, ataque, defesa);

        entidades.add(entidadeNova);
        copia.add(entidadeNova);
    }

    static private void imprimirDadosUnidade(List<Entidade> entidades) {
        if (entidades.isEmpty()) {
            System.out.println("ainda não foi adicionado uma entidade");
            return;
        }
        System.out.println("---Entidades---");
        for (int i = 0; i < entidades.size(); i += 1) {
            Entidade entidade = entidades.get(i);
            System.out.printf("\nnome: %s\nvida: %d\nataque: %d\ndefesa %d\n\n",
                    entidade.nome(), entidade.vida(), entidade.ataque(), entidade.defesa());
        }
    }

    static void atacar(Entidade atacante, Entidade defensor) {
        /* vidaAtual -= (quant de ataque da unidade atacante - defesa) */
        int index2 = encontrarIndicePorNome(defensor.nome());
        int vidaAtual = defensor.vida();
        int dano = atacante.ataque() - defensor.defesa();
        if (dano <= 0) {
            dano = 1;
        }
        vidaAtual -= dano;
        System.out.printf("%s atacou %s, causando %d de dano!\n", atacante.nome(), defensor.nome(), dano);
        if (vidaAtual <= 0) {
            vidaAtual = 0;
            System.out.printf("%s foi eliminado\n\n", defensor.nome());
            System.out.printf("%s ganhou com %d de vida restante!\n\n", atacante.nome(), atacante.vida());
        } else {
            System.out.printf("%s agora tem %d de vida!\n\n", defensor.nome(), vidaAtual);
        }
        Entidade entidadeDepoisDano = new Entidade(defensor.nome(), vidaAtual, defensor.ataque(), defensor.defesa());
        entidades.set(index2, entidadeDepoisDano);

    }

    static private int encontrarIndicePorNome(String nomeBuscado) {
        for (int i = 0; i < entidades.size(); i++) {
            if (entidades.get(i).nome().equalsIgnoreCase(nomeBuscado)) {
                return i;
            }
        }
        return -1;
    }

    static private void batalhar(String nome, String nome2) {
        int index1 = encontrarIndicePorNome(nome);
        int index2 = encontrarIndicePorNome(nome2);

        if (index1 < 0 || index2 < 0) {
            System.out.println("alguma das entidades não existe ou esta com o nome incorreto.");
            return;
        }
        while (true) {
            Entidade entidade1 = entidades.get(index1);
            Entidade entidade2 = entidades.get(index2);
            if (entidade1.vida() == 0 || entidade2.vida() == 0) {
                break;
            }
            atacar(entidade1, entidade2);
            entidade1 = entidades.get(index1);
            entidade2 = entidades.get(index2);
            if (entidade1.vida() == 0 || entidade2.vida() == 0) {
                break;
            }
            atacar(entidade2, entidade1);
        }
        Entidade copia1 = copia.get(index1);
        entidades.set(index1, copia1);
        Entidade copia2 = copia.get(index2);
        entidades.set(index2, copia2);
    }

    static public void main(String[] args) {
        criarEntidade("ogro", 10, 2, 5);
        criarEntidade("joao neto", 5, 2, 3);
        criarEntidade("Deus", 9999, 9999, 9999);
        criarEntidade("dragão",100,100,100);
        imprimirDadosUnidade(entidades);
        batalhar("joao neto", "Deus");
        batalhar("ogro", "Deus");
        batalhar("joao neto", "ogro");
        batalhar("ogro","dragão");
    }
}
