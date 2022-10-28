/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhojava.model.dao;

import java.time.LocalDateTime;
import trabalhojava.model.ContaCorrente;
import trabalhojava.model.MovimentacaoConta;

/**
 *
 * @author gilbe
 */
public class MovimentacaoDao {
        private int id = 3;
        

    private MovimentacaoConta[] movimentacaoContaDao = new MovimentacaoConta[10];
    ContaCorrente burraxa = new ContaCorrente();
    public MovimentacaoDao() {

        movimentacaoContaDao[0] = new MovimentacaoConta();
        movimentacaoContaDao[0].setConta(burraxa);
        movimentacaoContaDao[0].setDescricao("comprar o ativo da oficina do burraxá");
        movimentacaoContaDao[0].setTipoMovimentacao("estorquismo");
        movimentacaoContaDao[0].setDataCriacao(LocalDateTime.now());
        movimentacaoContaDao[0].setDataModificacao(LocalDateTime.now());

    }

    public int inserirMovimentacaoConta(MovimentacaoConta movimentacaoConta) {
        for (int i = 0; i < movimentacaoContaDao.length; i++) {
            if (movimentacaoContaDao[i] == null) {
                movimentacaoConta.setId(id);
                id++;
                movimentacaoContaDao[i] = movimentacaoConta;
                return 1;
            }
        }
        return -1;
    }

    public void listar() {

        if (movimentacaoContaDao == null) {
            System.out.println("Nenhuma movimentação encontrado");

        } else {

            for (int i = 0; i < movimentacaoContaDao.length; i++) {
                if (movimentacaoContaDao[i] != null) {
                    System.out.println(movimentacaoContaDao[i].toString());
                }
            }
        }
    }

    public void listarId() {

        if (movimentacaoContaDao.length == 0) {
            System.out.println("Nenhuma movimentação encontrada");

        } else {

            for (int i = 0; i < movimentacaoContaDao.length; i++) {
                if (movimentacaoContaDao[i] != null) {
                    System.out.println("id: " + movimentacaoContaDao[i].getId() + "tipo" + movimentacaoContaDao[i].getTipoMovimentacao() +" descrição: " + movimentacaoContaDao[i].getDescricao());
                }
            }
        }
    }

    //Achar o aeroporto
    public MovimentacaoConta acharMovimentacao(long id) {

        for (int i = 0; i < movimentacaoContaDao.length; i++) {
            
            if (movimentacaoContaDao[i] != null && movimentacaoContaDao[i].getId() == id) {
                return movimentacaoContaDao[i];
            }
        }
        return null;
    }

    //Achar o aeroporto
    public int modificarCliente(MovimentacaoConta movimentacaoConta) {

        for (int i = 0; i < movimentacaoContaDao.length; i++) {
          
            if (movimentacaoContaDao[i] != null && movimentacaoContaDao[i].getId() == movimentacaoConta.getId()) {
                movimentacaoContaDao[i] = movimentacaoConta;
                return 1;
            }
        }
        return -1;
    }

    //Excluir a conta
    public int excluirAtivo(int idMovimentacao) {

        for (int i = 0; i < movimentacaoContaDao.length; i++) {
            if (movimentacaoContaDao[i] != null && movimentacaoContaDao[i].getId() == idMovimentacao) {
                movimentacaoContaDao[i] = null;
                return 1;
            }
        }
        return -1;
    }
}
