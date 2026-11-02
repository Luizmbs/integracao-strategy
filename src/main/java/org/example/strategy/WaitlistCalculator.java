package org.example.strategy;

public class WaitlistCalculator {

    private float diasEspera;
    private float reservasAtivas;

    public WaitlistCalculator(float diasEspera, float reservasAtivas) {
        this.diasEspera = diasEspera;
        this.reservasAtivas = reservasAtivas;
    }

    public float calcular(PriorityStrategy estrategia) {
        return estrategia.calcular(diasEspera, reservasAtivas);
    }
}
