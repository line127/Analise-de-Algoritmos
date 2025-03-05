public class Investidor {

    private String nomeInvestidor;


    public Investidor(String nomeInvestidor) {
        this.nomeInvestidor = nomeInvestidor;
    }

    public String getNomeInvestidor() {
        return nomeInvestidor;
    }

    public void setNomeInvestidor(String nomeInvestidor) {
        this.nomeInvestidor = nomeInvestidor;
    }

    public void registrarOrdem(Acao acao, String tipo, double valor) {
        Ordem ordem = new Ordem(new Investidor(this.nomeInvestidor), tipo, valor);
        acao.inserirOrdem(ordem);
    }

    public void programarOrdem(Acao acao, String tipo, double valor) {
        Ordem ordem = new Ordem(new Investidor(this.nomeInvestidor), tipo, valor);
        acao.inserirOrdemProgramada(ordem);
    }

    public void registrarseEmUmaAcao(Acao acao){
        acao.inserirInvestidor(this);
        System.out.println(this.nomeInvestidor + " registrado com sucesso na acao = " + acao.getNomeAcao());
    }

    
    @Override
    public String toString() {
        return nomeInvestidor;
    }
}
