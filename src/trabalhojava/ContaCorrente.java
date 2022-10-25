package trabalhojava;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ContaCorrente {
    int id;
    String clienteContaCorrente;
    Double saldoContaCorrente;
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
}
