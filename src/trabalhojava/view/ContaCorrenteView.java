package trabalhojava.view;
import java.time.LocalDateTime;
import trabalhojava.model.ContaCorrente;
/**
 *
 * @author gabri
 */
public class ContaCorrenteView {
    public ContaCorrente insereDados() {
        ContaCorrente conta = new ContaCorrente();
        conta.setClienteContaCorrente("a");
        conta.setSaldoContaCorrente(20000);
        conta.setDataCriacao(LocalDateTime.now());
        conta.setDataModificacao(LocalDateTime.now());
        return conta;
    }

    public ContaCorrente modificarContaCorrente(ContaCorrente conta) {
        conta.setClienteContaCorrente("a");
        conta.setSaldoContaCorrente(20000);
        conta.setDataModificacao(LocalDateTime.now());
        
        return conta;
    }
}
