package entidad;

public class Nota {
    // atributos
    private double valor;
    private double ponderacion;

    public Nota(double valor, double ponderacion) {
        if(valor <=0) {
            throw new IllegalArgumentException("Valor mayor que 0");
        }

        if(ponderacion <=0) {
            throw new IllegalArgumentException("Ponderacion mayor que 0");
        }

        this.valor = valor;
        this.ponderacion = ponderacion;
    }

    public double getValor() {
        return valor;
    }

    public double getPonderacion() {
        return ponderacion;
    }
}
