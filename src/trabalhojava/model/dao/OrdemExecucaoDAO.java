/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhojava.model.dao;

import java.time.LocalDateTime;
import trabalhojava.model.ContaCorrente;
import trabalhojava.model.OrdemExecucao;

/**
 *
 * @author gilbe
 */
public class OrdemExecucaoDAO {

     private int id = 3;
        

    private OrdemExecucao[] ordemExecucaoDao = new OrdemExecucao[10];
    ContaCorrente burraxa = new ContaCorrente();
    ContaCorrente amigoBurraxa = new ContaCorrente();
    public OrdemExecucaoDAO() {

        ordemExecucaoDao[0] = new OrdemExecucao();
        ordemExecucaoDao[0].setId(1);
        ordemExecucaoDao[0].setContaCompra(burraxa);
        ordemExecucaoDao[0].setContaVenda(amigoBurraxa);
        ordemExecucaoDao[0].setEstado("Parcial");
        ordemExecucaoDao[0].setQuantidade(4);
        ordemExecucaoDao[0].setTipoOrdem("Venda");
        ordemExecucaoDao[0].setValor(10);
        ordemExecucaoDao[0].setVelorTotal(20);
        ordemExecucaoDao[0].setDataCriacao(LocalDateTime.now());
        ordemExecucaoDao[0].setDataModificacao(LocalDateTime.now());

    }

    public int inserirOrdemExecucao(OrdemExecucao ordemExecucao) {
        for (int i = 0; i < ordemExecucaoDao.length; i++) {
            if (ordemExecucaoDao[i] == null) {
                ordemExecucao.setId(id);
                id++;
                ordemExecucaoDao[i] = ordemExecucao;
                return 1;
            }
        }
        return -1;
    }

    public void listar() {

        if (ordemExecucaoDao == null) {
            System.out.println("Nenhuma ordem de execucao encontrada");

        } else {

            for (int i = 0; i < ordemExecucaoDao.length; i++) {
                if (ordemExecucaoDao[i] != null) {
                    System.out.println(ordemExecucaoDao[i].toString());
                }
            }
        }
    }

    public void listarId() {

        if (ordemExecucaoDao.length == 0) {
            System.out.println("Nenhuma ordem de execucao encontrada");

        } else {

            for (int i = 0; i < ordemExecucaoDao.length; i++) {
                if (ordemExecucaoDao[i] != null) {
                    System.out.println("id: " + ordemExecucaoDao[i].getId() + "Conta" + ordemExecucaoDao[i].getContaCompra()+" valorTotal: " + ordemExecucaoDao[i].getVelorTotal());
                }
            }
        }
    }

    //Achar o aeroporto
    public OrdemExecucao acharOrdem(long id) {

        for (int i = 0; i < ordemExecucaoDao.length; i++) {
            
            if (ordemExecucaoDao[i] != null && ordemExecucaoDao[i].getId() == id) {
                return ordemExecucaoDao[i];
            }
        }
        return null;
    }

    //Achar o aeroporto
    public int modificarOrdem(OrdemExecucao ordemExecucao) {

        for (int i = 0; i < ordemExecucaoDao.length; i++) {
          
            if (ordemExecucaoDao[i] != null && ordemExecucaoDao[i].getId() == ordemExecucao.getId()) {
                ordemExecucaoDao[i] = ordemExecucao;
                return 1;
            }
        }
        return -1;
    }

    //Excluir a conta
    public int excluirAtivo(int idOrdemExecucao) {

        for (int i = 0; i < ordemExecucaoDao.length; i++) {
            if (ordemExecucaoDao[i] != null && ordemExecucaoDao[i].getId() == idOrdemExecucao) {
                ordemExecucaoDao[i] = null;
                return 1;
            }
        }
        return -1;
    }
    
}

