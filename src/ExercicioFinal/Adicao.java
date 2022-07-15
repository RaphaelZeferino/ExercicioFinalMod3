package ExercicioFinal;

public class Adicao implements OperacaoMatematica {

    private final double numero1;
    private final double numero2;

    public Adicao(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public double calcula() {
        return numero1 + numero2;
    }

    @Override
    public String toString(){
        return "Soma de: " + numero1 + " + " + numero2 + " = " + calcula();
    }

}
