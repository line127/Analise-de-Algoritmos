public class Item {
    
    private int idLivro;
    private String nomeLivro;
    private double pesoLivro;
    private double valorLivro;
    
    public Item(int idLivro, String nomeLivro, double pesoLivro, double valorLivro) {
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
    public double getPesoLivro() {
        return pesoLivro;
    }
    public void setPesoLivro(double pesoLivro) {
        this.pesoLivro = pesoLivro;
    }
    public double getValorLivro() {
        return valorLivro;
    }
    public void setValorLivro(double valorLivro) {
        this.valorLivro = valorLivro;
    }

    @Override
    public String toString() {
        return "ID=" + idLivro + ", Titulo=" + nomeLivro + ", Peso=" + pesoLivro + ", Preço="
                + valorLivro + "";
    }

    
}
