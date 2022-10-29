package trabalhojava.view;
import java.time.LocalDateTime;
import java.util.Scanner;
import trabalhojava.model.UltimaNegociacao;
import trabalhojava.model.ContaCorrente;
/**
 *
 * @author gabri
 */
public class UltimaNegociacaoView {
    Scanner scan = new Scanner(System.in);
    public UltimaNegociacao insereDados() {
        UltimaNegociacao ultimaNegociacao = new UltimaNegociacao();
        ContaCorrente conta = new ContaCorrente();
        ultimaNegociacao.setContaCompra(conta);
        ultimaNegociacao.setContaVenda(conta);
        ultimaNegociacao.setEstado(scan.nextLine());
        ultimaNegociacao.setQuantidade(scan.nextInt());
        ultimaNegociacao.setTicker(scan.nextLine());
        ultimaNegociacao.setValor(scan.nextFloat());
        ultimaNegociacao.setVelorTotal(scan.nextFloat());
        ultimaNegociacao.setDataCriacao(LocalDateTime.now());
        ultimaNegociacao.setDataModificacao(LocalDateTime.now());
        return ultimaNegociacao;
    }

    public UltimaNegociacao modificarOrdem(UltimaNegociacao ultimaNegociacao) {
        ContaCorrente conta = new ContaCorrente();
         ultimaNegociacao.setEstado(scan.nextLine());
        ultimaNegociacao.setQuantidade(scan.nextInt());
        ultimaNegociacao.setTicker(scan.nextLine());
        ultimaNegociacao.setValor(scan.nextFloat());
        ultimaNegociacao.setVelorTotal(scan.nextFloat());
        ultimaNegociacao.setDataCriacao(LocalDateTime.now());
        ultimaNegociacao.setDataModificacao(LocalDateTime.now());
        return ultimaNegociacao;
    }
}
