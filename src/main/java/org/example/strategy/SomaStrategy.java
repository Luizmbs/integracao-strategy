package org.example.strategy;

public class SomaStrategy implements PriorityStrategy {

    public float calcular(float diasEspera, float reservasAtivas) {
        return diasEspera + reservasAtivas;
    }
}
