package trabalhojava.view;
import java.time.LocalDateTime;
import trabalhojava.model.MovimentacaoConta;
import trabalhojava.model.ContaCorrente;
/**
 *
 * @author gabri
 */
public class MovimentacaoView {
    public MovimentacaoConta insereDados() {
        MovimentacaoConta movimentacao = new MovimentacaoConta();
        ContaCorrente conta = new ContaCorrente();
        movimentacao.setConta(conta);
        movimentacao.setDescricao("");
        movimentacao.setTipoMovimentacao("");
        movimentacao.setValor(0);
        movimentacao.setDataCriacao(LocalDateTime.now());
        movimentacao.setDataModificacao(LocalDateTime.now());
        return movimentacao;
    }

    public MovimentacaoConta modificarMovimentacao(MovimentacaoConta movimentacao) {
        ContaCorrente conta = new ContaCorrente();
        movimentacao.setConta(conta);
        movimentacao.setDescricao("");
        movimentacao.setTipoMovimentacao("");
        movimentacao.setValor(0);
        movimentacao.setDataModificacao(LocalDateTime.now());
        
        return movimentacao;
    }
}
