package trabalhojava.view;
import java.time.LocalDateTime;
import trabalhojava.model.UltimaNegociacao;
import trabalhojava.model.ContaCorrente;
/**
 *
 * @author gabri
 */
public class UltimaNegociacaoView {
    public UltimaNegociacao insereDados() {
        UltimaNegociacao ultimaNegociacao = new UltimaNegociacao();
        ContaCorrente conta = new ContaCorrente();
        ultimaNegociacao.setContaCompra(conta);
        ultimaNegociacao.setContaVenda(conta);
        ultimaNegociacao.setEstado("");
        ultimaNegociacao.setQuantidade(0);
        ultimaNegociacao.setTicker("");
        ultimaNegociacao.setValor(0);
        ultimaNegociacao.setVelorTotal(0);
        ultimaNegociacao.setDataCriacao(LocalDateTime.now());
        ultimaNegociacao.setDataModificacao(LocalDateTime.now());
        return ultimaNegociacao;
    }

    public UltimaNegociacao modificarOrdem(UltimaNegociacao ultimaNegociacao) {
        ContaCorrente conta = new ContaCorrente();
        ultimaNegociacao.setContaCompra(conta);
        ultimaNegociacao.setContaVenda(conta);
        ultimaNegociacao.setEstado("");
        ultimaNegociacao.setQuantidade(0);
        ultimaNegociacao.setTicker("");
        ultimaNegociacao.setValor(0);
        ultimaNegociacao.setVelorTotal(0);
        ultimaNegociacao.setDataCriacao(LocalDateTime.now());
        ultimaNegociacao.setDataModificacao(LocalDateTime.now());
        return ultimaNegociacao;
    }
}
