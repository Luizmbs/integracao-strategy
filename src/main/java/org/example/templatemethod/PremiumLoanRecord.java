package org.example.templatemethod;

import org.example.strategy.MultiplicacaoStrategy;
import org.example.strategy.PriorityStrategy;

public class PremiumLoanRecord extends LoanRecord {

    public float getLimiteMulta() {
        return 10.0f;
    }

    public PriorityStrategy getEstrategiaPrioridade() {
        return new MultiplicacaoStrategy();
    }

    @Override
    public String getTipo() {
        return "PremiumLoanRecord";
    }
}
