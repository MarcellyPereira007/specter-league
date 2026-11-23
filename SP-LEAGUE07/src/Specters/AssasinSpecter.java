package Specters;

import models.MemoriaDeCombate;
import models.SpecterIA;

public class AssasinSpecter extends SpecterIA {
    public AssasinSpecter(MemoriaDeCombate memoria) {
        super(memoria);
    }

    @Override
    public void executarTurno() {
        System.out.println("Assassin entra em stealth e explode o combo!");
    }
}
