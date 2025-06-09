public class DistanciaEntrePontos {

    // 1. Definimos o record Ponto com duas coordenadas inteiras x e y
    //    O record cria automaticamente construtor e métodos para acessar esses valores (x() e y())
    public record Ponto(int x, int y) {}

    public static void main(String[] args) {

        // 2. Criamos o primeiro ponto com coordenadas (2, 3)
        Ponto p1 = new Ponto(2, 3);

        // 3. Criamos o segundo ponto com coordenadas (5, 7)
        Ponto p2 = new Ponto(5, 7);

        // 4. Calculamos a distância entre os dois pontos usando a função calcularDistancia
        double distancia = calcularDistancia(p1, p2);

        // 5. Imprimimos a distância formatada com 2 casas decimais
        System.out.printf("Distância entre os pontos: %.2f\n", distancia);
    }

    // Função que calcula a distância euclidiana entre dois pontos
    public static double calcularDistancia(Ponto p1, Ponto p2) {
        // 6. Calcula a diferença na coordenada x (x2 - x1)
        int dx = p2.x() - p1.x();

        // 7. Calcula a diferença na coordenada y (y2 - y1)
        int dy = p2.y() - p1.y();

        // 8. Aplica a fórmula da distância euclidiana:
        //    raiz quadrada da soma dos quadrados das diferenças
        return Math.sqrt(dx * dx + dy * dy);
    }
}
