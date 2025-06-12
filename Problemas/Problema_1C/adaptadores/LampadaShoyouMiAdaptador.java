package adaptadores;

import br.furb.analise.algoritmos.LampadaShoyuMi;
import dispositivos.Lampada;

public class LampadaShoyouMiAdaptador implements Lampada{
    LampadaShoyuMi lampada;

    public LampadaShoyouMiAdaptador(LampadaShoyuMi lampada) {
        this.lampada = lampada;
    }

    public LampadaShoyouMiAdaptador(){
        
    }

    @Override
    public void ligar() {
        lampada.ligar();
    }

    @Override
    public void desligar() {
        lampada.desligar();
    }
}
