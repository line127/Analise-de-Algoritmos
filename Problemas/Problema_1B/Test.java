
public class Test {

    public static void main(String[] args) {

        Acao acao_banco = new Acao("Banco do Brasil", 24);
        Acao acao_carro = new Acao("Carro do Brasil", 20);
        Acao acao_lojas = new Acao("Lojas do Brasil", 20);
        Investidor inves_um = new Investidor("Aline");
        Investidor inves_dois = new Investidor("Haechan");
        inves_um.registrarseEmUmaAcao(acao_carro);
        inves_dois.registrarseEmUmaAcao(acao_banco);
        inves_um.registrarOrdem(acao_banco, "COMPRA", 24);
        inves_dois.registrarOrdem(acao_banco, "COMPRA", 20);
        inves_dois.registrarOrdem(acao_banco, "VENDA", 24);
        inves_um.registrarOrdem(acao_carro, "COMPRA", 20);

        inves_dois.programarOrdem(acao_banco, "VENDA", 34);

        inves_um.registrarOrdem(acao_carro, "VENDA", 20);
        inves_dois.registrarOrdem(acao_lojas, "VENDA", 20);
        inves_dois.registrarOrdem(acao_banco, "COMPRA", 29);
        inves_dois.registrarOrdem(acao_banco, "VENDA", 29);
        System.out.println(acao_banco.toString());
        inves_um.registrarOrdem(acao_lojas, "VENDA", 20);
        System.out.println(acao_lojas.toString());
        System.out.println("--------------------");
        System.out.println(acao_banco.toString());
        inves_dois.registrarOrdem(acao_banco, "COMPRA", 20);
        inves_dois.registrarOrdem(acao_banco, "VENDA", 34);
        System.out.println(acao_banco.getValor());
    }

}
