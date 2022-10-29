package trabalhojava.view;
import java.time.LocalDateTime;
import java.util.Scanner;
import trabalhojava.model.Ordem;
import trabalhojava.model.ContaCorrente;
/**
 *
 * @author gabri
 */
public class OrdemView {
    Scanner scan = new Scanner(System.in);
    public Ordem insereDados() {
        Ordem ordem = new Ordem();
        ContaCorrente conta = new ContaCorrente();
        ordem.setConta(conta);
        ordem.setTicker(scan.nextLine());
        ordem.setEstado(scan.nextLine());
        ordem.setQuantidade(scan.nextInt());
        ordem.setTipoOrdem(scan.nextLine());
        ordem.setValor(scan.nextFloat());
        ordem.setVelorTotal(scan.nextFloat());
        ordem.setDataCriacao(LocalDateTime.now());
        ordem.setDataModificacao(LocalDateTime.now());
        return ordem;
    }

    public Ordem modificarOrdem(Ordem ordem) {
        ContaCorrente conta = new ContaCorrente();
        ordem.setConta(conta);
        ordem.setTicker(scan.nextLine());
        ordem.setEstado(scan.nextLine());
        ordem.setQuantidade(scan.nextInt());
        ordem.setTipoOrdem(scan.nextLine());
        ordem.setValor(scan.nextFloat());
        ordem.setVelorTotal(scan.nextFloat());
        ordem.setDataModificacao(LocalDateTime.now());
        return ordem;
    }
}
