package Problemas.Problema_1B;

public class Investidor {
    private String nome;

    public Investidor(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void registrarOrdem(Acao acao, Ordem ordem) {
        acao.adicionarOrdem(ordem);
        acao.verificarMatchs(ordem);
    }
}