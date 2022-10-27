package trabalhojava.model;

import java.time.LocalDateTime;

/**
 *
 * @author gabri
 */
public class UltimaNegociacao {
    private int id;
    private String ticker;
    private ContaCorrente contaCompra;
    private ContaCorrente contaVenda;
    private int quantidade;
    private double valor;
    private double velorTotal;
    private String estado;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;
    
    @Override
    public String toString() {
        return "\nUltimaNegociacao" 
                + "\nId = " + id 
                + "\nContaCompra = " + contaCompra
                + "\nContaCompra = " + contaVenda
                + "\nticker = " + ticker 
                + "\nquantidade=" + quantidade 
                + "\nvalor = " + valor 
                + "\nvelorTotal = " + velorTotal 
                + "\nestado = " + estado 
                + "\nDataCriacao = " + dataCriacao 
                + "\nDataModificacao = " + dataModificacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public ContaCorrente getContaCompra() {
        return contaCompra;
    }

    public void setContaCompra(ContaCorrente contaCompra) {
        this.contaCompra = contaCompra;
    }

    public ContaCorrente getContaVenda() {
        return contaVenda;
    }

    public void setContaVenda(ContaCorrente contaVenda) {
        this.contaVenda = contaVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getVelorTotal() {
        return velorTotal;
    }

    public void setVelorTotal(double velorTotal) {
        this.velorTotal = velorTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
