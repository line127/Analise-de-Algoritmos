public class Item {
    
    private int idLivro;
    private String nomeLivro;
    private float pesoLivro;
    private float valorLivro;
    
    public Item(int idLivro, String nomeLivro, float pesoLivro, float valorLivro) {
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.pesoLivro = pesoLivro;
        this.valorLivro = valorLivro;
    }

    public int getIdLivro() {
        return idLivro;
    }
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    public String getNomeLivro() {
        return nomeLivro;
    }
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    public float getPesoLivro() {
        return pesoLivro;
    }
    public void setPesoLivro(float pesoLivro) {
        this.pesoLivro = pesoLivro;
    }
    public float getValorLivro() {
        return valorLivro;
    }
    public void setValorLivro(float valorLivro) {
        this.valorLivro = valorLivro;
    }

    @Override
    public String toString() {
        return "Item [idLivro=" + idLivro + ", nomeLivro=" + nomeLivro + ", pesoLivro=" + pesoLivro + ", valorLivro="
                + valorLivro + "]";
    }

    
}
