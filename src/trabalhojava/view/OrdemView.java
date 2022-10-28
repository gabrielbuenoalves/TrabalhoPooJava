package trabalhojava.view;
import java.time.LocalDateTime;
import trabalhojava.model.Ordem;
import trabalhojava.model.ContaCorrente;
/**
 *
 * @author gabri
 */
public class OrdemView {
    public Ordem insereDados() {
        Ordem ordem = new Ordem();
        ContaCorrente conta = new ContaCorrente();
        ordem.setConta(conta);
        ordem.setTicker("123");
        ordem.setEstado("");
        ordem.setQuantidade(0);
        ordem.setTipoOrdem("");
        ordem.setValor(0);
        ordem.setVelorTotal(0);
        ordem.setDataCriacao(LocalDateTime.now());
        ordem.setDataModificacao(LocalDateTime.now());
        return ordem;
    }

    public Ordem modificarOrdem(Ordem ordem) {
        ContaCorrente conta = new ContaCorrente();
        ordem.setConta(conta);
        ordem.setTicker("123");
        ordem.setEstado("");
        ordem.setQuantidade(0);
        ordem.setTipoOrdem("");
        ordem.setValor(0);
        ordem.setVelorTotal(0);
        ordem.setDataModificacao(LocalDateTime.now());
        return ordem;
    }
}
