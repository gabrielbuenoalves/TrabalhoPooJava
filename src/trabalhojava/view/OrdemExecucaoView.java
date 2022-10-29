package trabalhojava.view;
import java.time.LocalDateTime;
import java.util.Scanner;
import trabalhojava.model.OrdemExecucao;
import trabalhojava.model.ContaCorrente;
/**
 *
 * @author gabri
 */
public class OrdemExecucaoView {
    Scanner scan = new Scanner(System.in);
    public OrdemExecucao insereDados() {
        OrdemExecucao ordem = new OrdemExecucao();
        ContaCorrente conta = new ContaCorrente();
        ordem.setContaCompra(conta);
        ordem.setContaVenda(conta);
        ordem.setEstado(scan.nextLine());
        ordem.setQuantidade(scan.nextInt());
        ordem.setTipoOrdem(scan.nextLine());
        ordem.setValor(scan.nextFloat());
        ordem.setVelorTotal(scan.nextFloat());
        ordem.setDataCriacao(LocalDateTime.now());
        ordem.setDataModificacao(LocalDateTime.now());
        return ordem;
    }

    public OrdemExecucao modificarOrdemExecucao(OrdemExecucao ordem) {
        ContaCorrente conta = new ContaCorrente();
        ordem.setContaCompra(conta);
        ordem.setContaVenda(conta);
        ordem.setEstado(scan.nextLine());
        ordem.setQuantidade(scan.nextInt());
        ordem.setTipoOrdem(scan.nextLine());
        ordem.setValor(scan.nextFloat());
        ordem.setVelorTotal(scan.nextFloat());
        ordem.setDataCriacao(LocalDateTime.now());
        ordem.setDataModificacao(LocalDateTime.now());
        return ordem;
    }
}
