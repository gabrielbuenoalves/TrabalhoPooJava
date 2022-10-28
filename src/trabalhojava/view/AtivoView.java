package trabalhojava.view;
import java.time.LocalDateTime;
import trabalhojava.model.Ativo;
/**
 *
 * @author gabri
 */
public class AtivoView {
    public Ativo insereDados() {
        Ativo ativo = new Ativo();
        ativo.setNomeEmpresa("a");
        ativo.setTicker("123");
        ativo.setTotalAtivos(0);
        ativo.setValorInicial(0);
        ativo.setDataCriacao(LocalDateTime.now());
        ativo.setDataModificacao(LocalDateTime.now());
        return ativo;
    }

    public Ativo modificarAtivo(Ativo ativo) {
        ativo.setNomeEmpresa("a");
        ativo.setTicker("123");
        ativo.setTotalAtivos(0);
        ativo.setValorInicial(0);
        ativo.setDataModificacao(LocalDateTime.now());
        
        return ativo;
    }
}
