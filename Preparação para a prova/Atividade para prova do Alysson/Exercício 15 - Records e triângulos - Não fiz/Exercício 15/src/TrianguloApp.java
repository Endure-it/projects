public class TrianguloApp {

    // 1. Definimos o record Triangulo com três lados inteiros: a, b e c
    //    O record cria automaticamente construtor e métodos para acessar os lados
    public record Triangulo(int a, int b, int c) {}

    public static void main(String[] args) {

        // 2. Criamos um triângulo com lados 4, 5 e 6
        Triangulo t = new Triangulo(4, 5, 6);

        // 3. Calculamos o perímetro do triângulo usando a função perimetroTriangulo
        int perimetro = perimetroTriangulo(t);

        // 4. Calculamos a área do triângulo usando a função calcularAreaTriangulo (fórmula de Heron)
        double area = calcularAreaTriangulo(t);

        // 5. Verificamos o tipo do triângulo (equilátero, isósceles ou escaleno)
        String tipo = verificarTipoTriangulo(t);

        // 6. Imprimimos os resultados no console
        System.out.println("Perímetro: " + perimetro);
        System.out.printf("Área: %.2f\n", area);
        System.out.println("Tipo: " + tipo);
    }

    // Função para calcular o perímetro do triângulo (soma dos lados)
    public static int perimetroTriangulo(Triangulo t) {
        return t.a() + t.b() + t.c();
    }

    // Função para calcular o semiperímetro (metade do perímetro)
    public static double semiperimetroTriangulo(Triangulo t) {
        return perimetroTriangulo(t) / 2.0;
    }

    // Função para calcular a área usando a fórmula de Heron
    public static double calcularAreaTriangulo(Triangulo t) {
        double s = semiperimetroTriangulo(t); // semiperímetro
        // Heron: sqrt[s(s-a)(s-b)(s-c)]
        return Math.sqrt(s * (s - t.a()) * (s - t.b()) * (s - t.c()));
    }

    // Função para verificar o tipo do triângulo
    public static String verificarTipoTriangulo(Triangulo t) {
        if (ehEquilatero(t)) {
            return "Equilátero"; // três lados iguais
        } else if (ehIsosceles(t)) {
            return "Isósceles";  // dois lados iguais
        } else {
            return "Escaleno";   // todos os lados diferentes
        }
    }

    // Função para verificar se o triângulo é equilátero
    public static boolean ehEquilatero(Triangulo t) {
        return (t.a() == t.b()) && (t.b() == t.c());
    }

    // Função para verificar se o triângulo é isósceles
    public static boolean ehIsosceles(Triangulo t) {
        return (t.a() == t.b()) || (t.a() == t.c()) || (t.b() == t.c());
    }
}
