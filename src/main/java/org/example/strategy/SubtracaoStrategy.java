package org.example.strategy;

public class SubtracaoStrategy implements PriorityStrategy {

    public float calcular(float diasEspera, float reservasAtivas) {
        return diasEspera - reservasAtivas;
    }
}
