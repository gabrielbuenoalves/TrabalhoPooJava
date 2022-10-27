package trabalhojava.model;

import java.time.LocalDateTime;

public class MovimentacaoConta {
    private int id;
    private ContaCorrente Conta;
    private String tipoMovimentacao;
    private String descricao;
    private double valor;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;
    
    @Override
    public String toString() {
        return "\nCampus" 
                + "\nId = " + id 
                + "\ntipoMovimentacao = " + tipoMovimentacao 
                + "\ndescricao = " + descricao 
                + "\nvalor = " + valor
                + "\nDataCriacao = " + dataCriacao 
                + "\nDataModificacao = " + dataModificacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ContaCorrente getConta() {
        return Conta;
    }

    public void setConta(ContaCorrente Conta) {
        this.Conta = Conta;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(LocalDateTime dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
}
