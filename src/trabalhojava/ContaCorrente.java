package trabalhojava;
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

    public double saldo() {
        return this.saldoContaCorrente;
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
    
   
    
    
}
