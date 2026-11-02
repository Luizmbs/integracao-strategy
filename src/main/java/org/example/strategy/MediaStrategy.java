package org.example.strategy;

public class MediaStrategy implements PriorityStrategy {

    public float calcular(float diasEspera, float reservasAtivas) {
        return (diasEspera + reservasAtivas) / 2;
    }
}
