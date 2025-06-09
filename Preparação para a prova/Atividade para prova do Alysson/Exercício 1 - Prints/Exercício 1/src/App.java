import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira um valor");
        int Celsius = in.nextInt();
        int Fahrenheit = (Celsius * 9/5) + 32;
        System.out.printf("%d °C equivale a %d °F", Celsius, Fahrenheit);
    }
}

//javac App.java
//java App