package trabalhojava.model;
import java.time.LocalDateTime;

public class ContaCorrente {
    int id;
    String clienteContaCorrente;
    double saldoContaCorrente;
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;

    @Override
    public String toString() {
        return "Conta Corrente" 
                + "\nId=" + id 
                + "\nClienteContaCorrente=" + clienteContaCorrente 
                + "\nSaldoContaCorrente=" + saldoContaCorrente
                + "\nDataCriacao=" + dataCriacao 
                + "\nDataModificacao=" + dataModificacao;
    }

    
    public double saque(double valor ){
        if(this.saldoContaCorrente - valor >0){
        this.saldoContaCorrente -= valor;    
        }
        else{
            System.out.println("Não foi possivel realizar o saque(Saldo insuficiente!)");
        }
        return this.saldoContaCorrente;
    }
    
    public double transacao(ContaCorrente id, double valor ){
        if(this.saldoContaCorrente - valor >0 ){
        this.saldoContaCorrente -= valor;
        id.saldoContaCorrente += valor;
        
        return 1;
        }
        else
            return 0;
    }
    
    public double pagamento(ContaCorrente id, double valor ){
        if(this.saldoContaCorrente - valor >0 ){
        this.saldoContaCorrente -= valor;
        id.saldoContaCorrente += valor;
        
        return 1;
        }
        else
            return 0;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClienteContaCorrente() {
        return clienteContaCorrente;
    }

    public void setClienteContaCorrente(String clienteContaCorrente) {
        this.clienteContaCorrente = clienteContaCorrente;
    }

    public double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    public void setSaldoContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
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
