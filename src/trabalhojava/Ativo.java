package trabalhojava;

import java.time.LocalDateTime;


public class Ativo {
    private int id;
    private String nomeEmpresa;
    private String ticker;
    private double totalAtivos;
    private double valorInicial;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;
    
    @Override
    public String toString() {
        return "\nCampus" 
                + "\nId = " + id 
                + "\nnomeEmpresa = " + nomeEmpresa 
                + "\nticker = " + ticker 
                + "\ntotalAtivos = " + totalAtivos
                + "\nvalorInicial = " + valorInicial
                + "\nDataCriacao = " + dataCriacao 
                + "\nDataModificacao = " + dataModificacao;
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getTotalAtivos() {
        return totalAtivos;
    }

    public void setTotalAtivos(double totalAtivos) {
        this.totalAtivos = totalAtivos;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
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
