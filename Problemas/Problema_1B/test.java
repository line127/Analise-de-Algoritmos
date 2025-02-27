package Problemas.Problema_1B;

public class test {
    public static void main(String[] args) {
        Acao acao1 = new Acao("teste", 5);
        Investidor investidor1 = new Investidor("AAAAAA");
        Ordem ordem1 = new Ordem(investidor1, 10, OrdemTipo.COMPRA);
        Ordem ordem2 = new Ordem(investidor1, 10, OrdemTipo.VENDA);
        investidor1.registrarOrdem(acao1, ordem1);
        investidor1.registrarOrdem(acao1, ordem2);

        System.out.println(acao1.getListaOrdem());
    }
}
