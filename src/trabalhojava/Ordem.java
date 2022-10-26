package trabalhojava;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ordem {
    private int id;
    private ContaCorrente Conta;
    private String tipoOrdem;
    private String ticker;
    private int quantidade;
    private double valor;
    private double velorTotal;
    private String estado;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataModificacao;
    
    @Override
    public String toString() {
        return "\nOrdem" 
                + "\nId = " + id 
                + "\nConta = " + Conta 
                + "\ntipoOrdem = " + tipoOrdem 
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

    public ContaCorrente getConta() {
        return Conta;
    }

    public void setConta(ContaCorrente Conta) {
        this.Conta = Conta;
    }

    public String getTipoOrdem() {
        return tipoOrdem;
    }

    public void setTipoOrdem(String tipoOrdem) {
        this.tipoOrdem = tipoOrdem;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
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
