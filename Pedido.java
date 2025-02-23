import java.util.ArrayList;

public class Pedido {

    private ArrayList<Item> item;

    public Pedido() {
        item = new ArrayList<>();
    }

    public void adicionarItem(Item livro) {
        item.add(livro);
    }

    public void removerItem(Item livro) {
        item.remove(livro);
    }

    public float calcularPesoTotal() {
        float pesoTotal = 0;
        for (Item livro : item) {
            pesoTotal += livro.getPesoLivro();
        }
        return pesoTotal;
    }

    @Override
    public String toString() {
        return "Pedido [" + item + "";
    }

}
