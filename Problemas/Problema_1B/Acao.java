package Problemas.Problema_1B;

import java.util.ArrayList;

public class Acao {
    private String nome;
    private double valor;
    private ArrayList<Ordem> listaOrdem;

    public ArrayList<Ordem> getListaOrdem() {
        return listaOrdem;
    }

    public Acao(String nome, double valor) {
        setNome(nome);
        setValor(valor);
        listaOrdem = new ArrayList<>();
    }

    public void verificarMatchs(Ordem ordemNova) {
        for (Ordem ordem : listaOrdem) {
            if (ordem.getValor() == ordemNova.getValor() && ordem.getTipo().equals(ordemNova.getTipo())) {
                listaOrdem.remove(ordem);
                listaOrdem.remove(ordemNova);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void adicionarOrdem(Ordem ordem) {
        listaOrdem.add(ordem);
    }
}
