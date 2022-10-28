package trabalhojava.view;
import java.time.LocalDateTime;
import trabalhojava.model.OrdemExecucao;
import trabalhojava.model.ContaCorrente;
/**
 *
 * @author gabri
 */
public class OrdemExecucaoView {
    public OrdemExecucao insereDados() {
        OrdemExecucao ordem = new OrdemExecucao();
        ContaCorrente conta = new ContaCorrente();
        ordem.setContaCompra(conta);
        ordem.setContaVenda(conta);
        ordem.setEstado("");
        ordem.setQuantidade(0);
        ordem.setTipoOrdem("");
        ordem.setValor(0);
        ordem.setVelorTotal(0);
        ordem.setDataCriacao(LocalDateTime.now());
        ordem.setDataModificacao(LocalDateTime.now());
        return ordem;
    }

    public OrdemExecucao modificarOrdemExecucao(OrdemExecucao ordem) {
        ContaCorrente conta = new ContaCorrente();
        ordem.setContaCompra(conta);
        ordem.setContaVenda(conta);
        ordem.setEstado("");
        ordem.setQuantidade(0);
        ordem.setTipoOrdem("");
        ordem.setValor(0);
        ordem.setVelorTotal(0);
        ordem.setDataCriacao(LocalDateTime.now());
        ordem.setDataModificacao(LocalDateTime.now());
        return ordem;
    }
}
