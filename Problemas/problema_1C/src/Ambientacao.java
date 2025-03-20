import dispositivos.ArCondicionado;
import dispositivos.Lampada;
import dispositivos.Persiana;

public class Ambientacao {
    private Lampada lampada;
    private Persiana persiana;
    private ArCondicionado arCondicionado;

    public Ambientacao(Lampada lampada, Persiana persiana, ArCondicionado arCondicionado) {
        this.lampada = lampada;
        this.persiana = persiana;
        this.arCondicionado = arCondicionado;
    }

    public void modoSono() {
        lampada.desligar();
        arCondicionado.desligar();
        persiana.fechar();
    }

    public void modoTrabalho() {
        lampada.ligar();
        arCondicionado.ligar();
        arCondicionado.definirTemperatura(25);
        persiana.abrir();
    }

 
    
}
