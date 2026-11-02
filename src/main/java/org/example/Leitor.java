package org.example;

import org.example.templatemethod.LoanRecord;

public class Leitor {

    private String nome;
    private LoanRecord registroEmprestimo;

    public Leitor(String nome, LoanRecord registroEmprestimo) {
        this.nome = nome;
        this.registroEmprestimo = registroEmprestimo;
    }

    public String getNome() {
        return nome;
    }

    public LoanRecord getRegistroEmprestimo() {
        return registroEmprestimo;
    }
}
