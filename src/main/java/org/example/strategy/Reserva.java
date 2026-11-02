package org.example.strategy;

public class Reserva {

    private float prioridade;

    public float getPrioridade() {
        return prioridade;
    }

    public void calcularPrioridade(float diasEspera, float reservasAtivas, PriorityStrategy estrategia) {
        WaitlistCalculator calculator = new WaitlistCalculator(diasEspera, reservasAtivas);
        this.prioridade = calculator.calcular(estrategia);
    }

    public void calcularPrioridadePorSoma(float diasEspera, float reservasAtivas) {
        calcularPrioridade(diasEspera, reservasAtivas, new SomaStrategy());
    }

    public void calcularPrioridadePorSubtracao(float diasEspera, float reservasAtivas) {
        calcularPrioridade(diasEspera, reservasAtivas, new SubtracaoStrategy());
    }

    public void calcularPrioridadePorDivisao(float diasEspera, float reservasAtivas) {
        calcularPrioridade(diasEspera, reservasAtivas, new DivisaoStrategy());
    }

    public void calcularPrioridadePorMultiplicacao(float diasEspera, float reservasAtivas) {
        calcularPrioridade(diasEspera, reservasAtivas, new MultiplicacaoStrategy());
    }

    public void calcularPrioridadeMedia(float diasEspera, float reservasAtivas) {
        calcularPrioridade(diasEspera, reservasAtivas, new MediaStrategy());
    }

}
