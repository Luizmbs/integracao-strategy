package org.example;

import org.example.factorymethod.Service;
import org.example.factorymethod.ServiceFactory;
import org.example.singleton.LibraryConfig;
import org.example.strategy.PriorityStrategy;
import org.example.strategy.Reserva;

public class Library {

    public String realizarEmprestimo(Leitor leitor) {
        Service servico = ServiceFactory.obterServico("Loan");
        String bibliotecario = LibraryConfig.getInstance().getUsuarioLogado();
        return servico.executar() + " para " + leitor.getNome() + " (" + bibliotecario + ")";
    }

    public String realizarDevolucao(Leitor leitor) {
        Service servico = ServiceFactory.obterServico("Return");
        String bibliotecario = LibraryConfig.getInstance().getUsuarioLogado();
        String status = leitor.getRegistroEmprestimo().verificarStatus();
        return servico.executar() + " para " + leitor.getNome() + " (" + bibliotecario + ") - " + status;
    }

    public String realizarCadastro(Leitor leitor) {
        Service servico = ServiceFactory.obterServico("Register");
        String bibliotecario = LibraryConfig.getInstance().getUsuarioLogado();
        return servico.executar() + " para " + leitor.getNome() + " (" + bibliotecario + ")";
    }

    public float calcularPrioridadeReserva(Leitor leitor, float diasEspera, float reservasAtivas) {
        PriorityStrategy estrategia = leitor.getRegistroEmprestimo().getEstrategiaPrioridade();
        Reserva reserva = new Reserva();
        reserva.calcularPrioridade(diasEspera, reservasAtivas, estrategia);
        return reserva.getPrioridade();
    }
}
