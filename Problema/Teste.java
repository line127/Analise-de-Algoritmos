public class Teste {
    
    public static void main(String[] args) {
        
        Item item1 = new Item(1, "A", 20, 10);
        System.out.println(item1.toString());
        Item item2 = new Item(2, "B", 10, 6);

        Pedido lista = new Pedido();
        lista.adicionarItem(item1);
        lista.adicionarItem(item2);
        lista.removerItem(item1);
        System.out.println(lista.toString());
        
    }

}
