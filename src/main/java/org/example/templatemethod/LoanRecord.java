package org.example.templatemethod;

import org.example.strategy.PriorityStrategy;

public abstract class LoanRecord {

    private int codigo;
    protected String titulo;
    private int diasAtraso;
    private float valorDiario;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public float getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(float valorDiario) {
        this.valorDiario = valorDiario;
    }

    public float calcularMulta() {
        return this.diasAtraso * this.valorDiario;
    }

    public abstract float getLimiteMulta();

    public String verificarStatus() {
        if (this.calcularMulta() <= this.getLimiteMulta()) {
            return "Liberado";
        }
        else {
            return "Bloqueado";
        }
    }

    public String getTipo() {
        return "LoanRecord";
    }

    public abstract PriorityStrategy getEstrategiaPrioridade();

    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", titulo='" + this.titulo + '\'' +
                ", status=" + this.verificarStatus() +
                '}';
    }
}
