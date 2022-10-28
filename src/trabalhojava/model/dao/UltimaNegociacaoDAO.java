/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhojava.model.dao;

import java.time.LocalDateTime;
import trabalhojava.model.ContaCorrente;
import trabalhojava.model.UltimaNegociacao;

/**
 *
 * @author gilbe
 */
public class UltimaNegociacaoDAO {
       private int id = 3;
        

    private UltimaNegociacao[] ultimaNegociacaoDao = new UltimaNegociacao[10];
    ContaCorrente burraxa = new ContaCorrente();
    ContaCorrente amigoBurraxa = new ContaCorrente();
    public UltimaNegociacaoDAO() {

        ultimaNegociacaoDao[0] = new UltimaNegociacao();
        ultimaNegociacaoDao[0].setId(1);
        ultimaNegociacaoDao[0].setContaCompra(burraxa);
        ultimaNegociacaoDao[0].setContaVenda(amigoBurraxa);
        ultimaNegociacaoDao[0].setEstado("Parcial");
        ultimaNegociacaoDao[0].setQuantidade(4);
        ultimaNegociacaoDao[0].setTicker("burraxa1219");
        ultimaNegociacaoDao[0].setValor(10);
        ultimaNegociacaoDao[0].setVelorTotal(20);
        ultimaNegociacaoDao[0].setDataCriacao(LocalDateTime.now());
        ultimaNegociacaoDao[0].setDataModificacao(LocalDateTime.now());
        
    }

    public int inserirUltimaNegociacao(UltimaNegociacao ultimaNegociacao) {
        for (int i = 0; i < ultimaNegociacaoDao.length; i++) {
            if (ultimaNegociacaoDao[i] == null) {
                ultimaNegociacao.setId(id);
                id++;
                ultimaNegociacaoDao[i] = ultimaNegociacao;
                return 1;
            }
        }
        return -1;
    }

    public void listar() {

        if (ultimaNegociacaoDao == null) {
            System.out.println("Nenhuma Ultima negociação encontrada");

        } else {

            for (int i = 0; i < ultimaNegociacaoDao.length; i++) {
                if (ultimaNegociacaoDao[i] != null) {
                    System.out.println(ultimaNegociacaoDao[i].toString());
                }
            }
        }
    }

    public void listarId() {

        if (ultimaNegociacaoDao.length == 0) {
            System.out.println("Nenhuma ordem de execucao encontrada");

        } else {

            for (int i = 0; i < ultimaNegociacaoDao.length; i++) {
                if (ultimaNegociacaoDao[i] != null) {
                    System.out.println("id: " + ultimaNegociacaoDao[i].getId() + "Conta" + ultimaNegociacaoDao[i].getContaCompra()+" valorTotal: " + ultimaNegociacaoDao[i].getVelorTotal());
                }
            }
        }
    }

    //Achar o aeroporto
    public UltimaNegociacao acharOrdem(long id) {

        for (int i = 0; i < ultimaNegociacaoDao.length; i++) {
            
            if (ultimaNegociacaoDao[i] != null && ultimaNegociacaoDao[i].getId() == id) {
                return ultimaNegociacaoDao[i];
            }
        }
        return null;
    }

    //Achar o aeroporto
    public int modificarUltimaNegociacao(UltimaNegociacao ultimaNegociacao) {

        for (int i = 0; i < ultimaNegociacaoDao.length; i++) {
          
            if (ultimaNegociacaoDao[i] != null && ultimaNegociacaoDao[i].getId() == ultimaNegociacao.getId()) {
                ultimaNegociacaoDao[i] = ultimaNegociacao;
                return 1;
            }
        }
        return -1;
    }

    //Excluir a conta
    public int excluirUltimaNegociacao(int idUltimaNegociacao) {

        for (int i = 0; i < ultimaNegociacaoDao.length; i++) {
            if (ultimaNegociacaoDao[i] != null && ultimaNegociacaoDao[i].getId() == idUltimaNegociacao) {
                ultimaNegociacaoDao[i] = null;
                return 1;
            }
        }
        return -1;
    }
      
}
