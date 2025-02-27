package Problemas.Problema_1B;

public class Ordem {
    private Investidor investidor;
    private double valor;
    private OrdemTipo tipo;

    public Ordem(Investidor investidor, double valor, OrdemTipo tipo) {
        setInvestidor(investidor);
        setTipo(tipo);
        setValor(valor);
    }

    public Investidor getInvestidor() {
        return investidor;
    }
    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public OrdemTipo getTipo() {
        return tipo;
    }
    public void setTipo(OrdemTipo tipo) {
        this.tipo = tipo;
    }

    
}
