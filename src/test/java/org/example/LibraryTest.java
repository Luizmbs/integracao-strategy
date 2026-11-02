package org.example;

import org.example.singleton.LibraryConfig;
import org.example.templatemethod.PremiumLoanRecord;
import org.example.templatemethod.StandardLoanRecord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void deveRealizarEmprestimoParaLeitor() {
        LibraryConfig.getInstance().setUsuarioLogado("Bibliotecário 1");
        Library library = new Library();
        Leitor leitor = new Leitor("Marco", new StandardLoanRecord());
        assertEquals("Empréstimo concluído para Marco (Bibliotecário 1)", library.realizarEmprestimo(leitor));
    }

    @Test
    void deveRealizarCadastroParaLeitor() {
        LibraryConfig.getInstance().setUsuarioLogado("Bibliotecário 2");
        Library library = new Library();
        Leitor leitor = new Leitor("Marco", new StandardLoanRecord());
        assertEquals("Registro feito para Marco (Bibliotecário 2)", library.realizarCadastro(leitor));
    }

    @Test
    void deveRealizarDevolucaoLiberadaParaLeitorStandard() {
        LibraryConfig.getInstance().setUsuarioLogado("Bibliotecário 3");
        Library library = new Library();
        StandardLoanRecord registro = new StandardLoanRecord();
        registro.setDiasAtraso(2);
        registro.setValorDiario(2.0f);
        Leitor leitor = new Leitor("Marco", registro);
        assertEquals("Devolução concluída para Marco (Bibliotecário 3) - Liberado", library.realizarDevolucao(leitor));
    }

    @Test
    void deveRealizarDevolucaoBloqueadaParaLeitorStandard() {
        LibraryConfig.getInstance().setUsuarioLogado("Bibliotecário 4");
        Library library = new Library();
        StandardLoanRecord registro = new StandardLoanRecord();
        registro.setDiasAtraso(10);
        registro.setValorDiario(2.0f);
        Leitor leitor = new Leitor("Marco", registro);
        assertEquals("Devolução concluída para Marco (Bibliotecário 4) - Bloqueado", library.realizarDevolucao(leitor));
    }

    @Test
    void deveCalcularPrioridadeReservaParaLeitorStandardUsandoSoma() {
        Library library = new Library();
        Leitor leitor = new Leitor("Marco", new StandardLoanRecord());
        assertEquals(7, library.calcularPrioridadeReserva(leitor, 5, 2));
    }

    @Test
    void deveCalcularPrioridadeReservaParaLeitorPremiumUsandoMultiplicacao() {
        Library library = new Library();
        Leitor leitor = new Leitor("Ana", new PremiumLoanRecord());
        assertEquals(10, library.calcularPrioridadeReserva(leitor, 5, 2));
    }
}
