package Specters;

import models.MemoriaDeCombate;
import models.SpecterIA;

public class WardenSpecter extends SpecterIA {
    public WardenSpecter(MemoriaDeCombate memoria) {
        super(memoria);
    }

    @Override
    public void executarTurno() {
        System.out.println("Warden entra em stealth e explode o combo!");
    }
}
