package MAula01;

public class Calculadora {
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("Soma de " + numero1 + " mais " + +numero2 + " é " + resultado);
    };
    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("Subtracao de " + numero1 + " menos " + +numero2 + " é " + resultado);
    };
    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("Multiplicacao de " + numero1 + " multiplicado " + +numero2 + " é " + resultado);
    };
    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("Divisao de " + numero1 + " dividido " + +numero2 + " é " + resultado);
    };

}
