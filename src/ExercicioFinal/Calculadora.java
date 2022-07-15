package ExercicioFinal;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    private List<OperacaoMatematica> operacoes = new ArrayList<>();

    public List<OperacaoMatematica> getOperacoes() {
        return operacoes;
    }


    public double executa(OperacaoMatematica operacaoMatematica) {
        operacoes.add(operacaoMatematica);
        return operacaoMatematica.calcula();
    }

}
