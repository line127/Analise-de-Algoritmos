public class App {
    public static void main(String[] args) throws Exception {
            Produto produto1 = new Produto("onePiece", 5, 2);
            Produto produto2 = new Produto("DeathNote", 2, 1);
    
            Pedido novoPedido = new Pedido();
            novoPedido.adicionarProduto(produto1);
            novoPedido.adicionarProduto(produto2);
    
            TipoFrete fretePAC = new PAC();
            TipoFrete freteSEDEX = new Sedex();
            TipoFrete freteRetirar = new RetirarLoja();
            System.out.println(novoPedido.calcularFrete(freteSEDEX));
            System.out.println(novoPedido.calcularFrete(freteRetirar));


            System.out.println(novoPedido.calcularFrete(fretePAC));
            novoPedido.removerProduto(produto1);
            System.out.println(novoPedido.calcularFrete(fretePAC));
    }
}
