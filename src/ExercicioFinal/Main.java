package ExercicioFinal;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Adicao adicao = new Adicao(10,20);
        Subtracao subtracao = new Subtracao(10,5);
        Multiplicacao multiplicacao = new Multiplicacao(5,5);
        Divisao divisao = new Divisao(10, 2);

        calculadora.executa(adicao);
        calculadora.executa(subtracao);
        calculadora.executa(multiplicacao);
        calculadora.executa(divisao);

        System.out.println("Historico de operacoes: ");

        List<OperacaoMatematica> operacoes = calculadora.getOperacoes();

        for (OperacaoMatematica operacaoMatematica :operacoes) {
            System.out.println(operacaoMatematica);

        }

    }
}
