package models;

public abstract class SpecterIA {
    private int energia;
    private MemoriaDeCombate memoria;

    public SpecterIA(MemoriaDeCombate memoria) {
        this.energia = 100;
        this.memoria = memoria;
    }

    public abstract void executarTurno();

    public void receberDano(int valor) {
        if (valor < 0) return;
        energia = Math.max(0, energia - valor);
    }
}
