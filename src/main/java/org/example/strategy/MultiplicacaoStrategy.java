package org.example.strategy;

public class MultiplicacaoStrategy implements PriorityStrategy {

    public float calcular(float diasEspera, float reservasAtivas) {
        return diasEspera * reservasAtivas;
    }
}
