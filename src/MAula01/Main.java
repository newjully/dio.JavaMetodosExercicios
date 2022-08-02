package MAula01;

public class Main {
    public static void main(String[] args) {

        //calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3,5);
        Calculadora.subtracao(10, 6);
        Calculadora.multiplicacao(3, 5);
        Calculadora.divisao(25, 5);

        //Saudacao
        System.out.println("Exercicio Saudação");
        Saudacao.obterSaudacao(8);
        Saudacao.obterSaudacao(15);
        Saudacao.obterSaudacao(23);

        //Emprestimos
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calculo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calculo(1000, Emprestimo.getTresParcelas());
        Emprestimo.calculo(1000, 5);

    }

}
