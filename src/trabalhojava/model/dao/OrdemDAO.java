/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhojava.model.dao;

import java.time.LocalDateTime;
import trabalhojava.model.ContaCorrente;
import trabalhojava.model.MovimentacaoConta;
import trabalhojava.model.Ordem;

/**
 *
 * @author gilbe
 */
public class OrdemDAO {
     private int id = 3;
        

    private Ordem[] ordemDao = new Ordem[10];
    ContaCorrente burraxa = new ContaCorrente();
    public OrdemDAO() {

        ordemDao[0] = new Ordem();
        ordemDao[0].setId(1);
        ordemDao[0].setConta(burraxa);
        ordemDao[0].setEstado("Total");
        ordemDao[0].setQuantidade(2);
        ordemDao[0].setTicker("burraxa1219");
        ordemDao[0].setTipoOrdem("Compra");
        ordemDao[0].setValor(10);
        ordemDao[0].setVelorTotal(20);
        ordemDao[0].setDataCriacao(LocalDateTime.now());
        ordemDao[0].setDataModificacao(LocalDateTime.now());

    }

    public int inserirOrdem(Ordem ordem) {
        for (int i = 0; i < ordemDao.length; i++) {
            if (ordemDao[i] == null) {
                ordem.setId(id);
                id++;
                ordemDao[i] = ordem;
                return 1;
            }
        }
        return -1;
    }

    public void listar() {

        if (ordemDao == null) {
            System.out.println("Nenhuma ordem encontrada");

        } else {

            for (int i = 0; i < ordemDao.length; i++) {
                if (ordemDao[i] != null) {
                    System.out.println(ordemDao[i].toString());
                }
            }
        }
    }

    public void listarId() {

        if (ordemDao.length == 0) {
            System.out.println("Nenhuma ordem encontrada");

        } else {

            for (int i = 0; i < ordemDao.length; i++) {
                if (ordemDao[i] != null) {
                    System.out.println("id: " + ordemDao[i].getId() + "Conta" + ordemDao[i].getConta()+" valorTotal: " + ordemDao[i].getVelorTotal());
                }
            }
        }
    }

    //Achar o aeroporto
    public Ordem acharOrdem(long id) {

        for (int i = 0; i < ordemDao.length; i++) {
            
            if (ordemDao[i] != null && ordemDao[i].getId() == id) {
                return ordemDao[i];
            }
        }
        return null;
    }

    //Achar o aeroporto
    public int modificarOrdem(Ordem ordem) {

        for (int i = 0; i < ordemDao.length; i++) {
          
            if (ordemDao[i] != null && ordemDao[i].getId() == ordem.getId()) {
                ordemDao[i] = ordem;
                return 1;
            }
        }
        return -1;
    }

    //Excluir a conta
    public int excluirAtivo(int idOrdem) {

        for (int i = 0; i < ordemDao.length; i++) {
            if (ordemDao[i] != null && ordemDao[i].getId() == idOrdem) {
                ordemDao[i] = null;
                return 1;
            }
        }
        return -1;
    }
    
}
