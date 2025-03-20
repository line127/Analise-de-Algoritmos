package adaptadores;

import br.furb.analise.algoritmos.LampadaPhellipes;
import dispositivos.Lampada;

public class LampadaPhelippesAdaptador implements Lampada{
    LampadaPhellipes lampada;

    public LampadaPhelippesAdaptador(LampadaPhellipes lampada) {
        this.lampada = lampada;
    }

    public LampadaPhelippesAdaptador(){
        
    }

    @Override
    public void ligar() {
        lampada.setIntensidade(100);
    }

    @Override
    public void desligar() {
        lampada.setIntensidade(0);
    }
}
