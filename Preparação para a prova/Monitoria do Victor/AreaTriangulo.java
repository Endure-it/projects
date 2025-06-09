package monitoria; // Define o pacote onde esta classe pertence

public class AreaTriangulo {

    // ✅ Declaração do record "Triangulo" que representa um triângulo com 3 lados
    record Triangulo(int ladoA, int ladoB, int ladoC){}; 

    public static void main(String[] args) {
        // Cria um triângulo com os lados 4, 4 e 5
        Triangulo triangulo1 = new Triangulo(4, 4, 5);  

        // Calcula a área do triângulo
        double area = calcularAreaTriangulo(triangulo1);
        System.out.println(area); // Imprime a área no console

        // Verifica o tipo do triângulo (equilátero, isósceles, escaleno)
        String tipoTriangulo = verificarTipoTriangulo(triangulo1);
        System.out.println(tipoTriangulo); // Imprime o tipo do triângulo
    }

    // ✅ Função para calcular o perímetro do triângulo (soma dos três lados)
    static int perimetroTriangulo(Triangulo triangulo){
        int perimetro = 0;
        perimetro += triangulo.ladoA;
        perimetro += triangulo.ladoB;
        perimetro += triangulo.ladoC;

        return perimetro;
    }

    // ✅ Função para calcular o semiperímetro (usado na fórmula de Heron)
    static int semiperimetroTriangulo(Triangulo triangulo){
        int perimetro = perimetroTriangulo(triangulo);
        return perimetro / 2;
    }

    // ✅ Calcula a área usando a fórmula de Heron
    static double calcularAreaTriangulo(Triangulo triangulo){
        int s = semiperimetroTriangulo(triangulo); // semiperímetro
        int a = triangulo.ladoA;
        int b = triangulo.ladoB;
        int c = triangulo.ladoC;

        // Fórmula de Heron: √(s(s-a)(s-b)(s-c))
        double formula = s * (s - a) * (s - b) * (s - c); 
        double area = Math.sqrt(formula); // raiz quadrada do resultado

        return area;
    }

    // ✅ Verifica o tipo do triângulo com base nos lados
    static String verificarTipoTriangulo(Triangulo triangulo){
        if (ehTrianguloEquilatero(triangulo)){
            return "equilátero"; // todos os lados iguais
        } else if (ehTrianguloIsosceles(triangulo)){
            return "isósceles"; // dois lados iguais
        } else {
            return "escaleno"; // todos os lados diferentes
        }
    }

    // ✅ Retorna verdadeiro se todos os lados forem iguais
    static boolean ehTrianguloEquilatero(Triangulo triangulo){
        if (triangulo.ladoA == triangulo.ladoB && triangulo.ladoA == triangulo.ladoC){
            return true;
        }
        return false;
    }

    // ✅ Retorna verdadeiro se dois lados forem iguais
    static boolean ehTrianguloIsosceles(Triangulo triangulo){
        if (triangulo.ladoA == triangulo.ladoB || 
            triangulo.ladoA == triangulo.ladoC || 
            triangulo.ladoB == triangulo.ladoC){
            return true;
        }
        return false;
    }

    // ✅ Retorna verdadeiro se todos os lados forem diferentes
    static boolean ehTrianguloEscaleno(Triangulo triangulo){
        if (triangulo.ladoA != triangulo.ladoB && 
            triangulo.ladoA != triangulo.ladoC && 
            triangulo.ladoB != triangulo.ladoC){
            return true;
        }
        return false;
    }

    /* 
    Comentário: essa versão alternativa da função `ehTrianguloEscaleno` também funcionaria.
    Ela usa a lógica de negação: se não é equilátero nem isósceles, então é escaleno.
    static boolean ehTrianguloEscaleno(Triangulo triangulo){
        if (!ehTrianguloEquilatero(triangulo) && !ehTrianguloIsosceles(triangulo)){
            return true;
        }
        return false;
    }
    */
}
