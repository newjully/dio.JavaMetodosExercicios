package MAula03;

public class Main {

    public static void main(String[] args){

        //Retornos
        System.out.println("Exercicios Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área dos Quadrados: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do Retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do Trapezio: " + areaTrapezio);
    }
}
