package org.example.templatemethod;

import org.example.strategy.PriorityStrategy;
import org.example.strategy.SomaStrategy;

public class StandardLoanRecord extends LoanRecord {

    public float getLimiteMulta() {
        return 5.0f;
    }

    public PriorityStrategy getEstrategiaPrioridade() {
        return new SomaStrategy();
    }

}
