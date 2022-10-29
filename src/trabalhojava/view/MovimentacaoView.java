package trabalhojava.view;
import java.time.LocalDateTime;
import java.util.Scanner;
import trabalhojava.model.MovimentacaoConta;
import trabalhojava.model.ContaCorrente;
/**
 *
 * @author gabri
 */
public class MovimentacaoView {
    Scanner scan = new Scanner(System.in);
    public MovimentacaoConta insereDados() {
        MovimentacaoConta movimentacao = new MovimentacaoConta();
        ContaCorrente conta = new ContaCorrente();
        movimentacao.setConta(conta);
        movimentacao.setDescricao(scan.nextLine());
        movimentacao.setTipoMovimentacao(scan.nextLine());
        movimentacao.setValor(scan.nextFloat());
        movimentacao.setDataCriacao(LocalDateTime.now());
        movimentacao.setDataModificacao(LocalDateTime.now());
        return movimentacao;
    }

    public MovimentacaoConta modificarMovimentacao(MovimentacaoConta movimentacao) {
        ContaCorrente conta = new ContaCorrente();
        movimentacao.setConta(conta);
        movimentacao.setDescricao(scan.nextLine());
        movimentacao.setTipoMovimentacao(scan.nextLine());
        movimentacao.setValor(scan.nextFloat());
        movimentacao.setDataModificacao(LocalDateTime.now());
        
        return movimentacao;
    }
}
