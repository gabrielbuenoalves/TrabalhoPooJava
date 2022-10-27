/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhojava.model.dao;

import java.time.LocalDateTime;
import trabalhojava.model.ContaCorrente;

/**
 *
 * @author gilbe
 */
public class ContaCorrenteDAO {
     private int id = 3;

    private ContaCorrente[] contaCorrenteList = new ContaCorrente[10];

    public ContaCorrenteDAO() {
      
        contaCorrenteList[0] = new ContaCorrente();
        contaCorrenteList[0].setId(1);
        contaCorrenteList[0].setClienteContaCorrente("crebin do pneu");
        contaCorrenteList[0].setSaldoContaCorrente(20.000);
        contaCorrenteList[0].setDataCriacao(LocalDateTime.now());
        contaCorrenteList[0].setDataModificacao(LocalDateTime.now());

    }

    public int inserirContaCorrente(ContaCorrente contaCorrente) {
        for (int i = 0; i < contaCorrenteList.length; i++) {
            if (contaCorrenteList[i] == null) {
                contaCorrente.setId(id);
                id++;
                contaCorrenteList[i] = contaCorrente;
                return 1;
            }
        }
        return -1;
    }

    public void listar() {

        if (contaCorrenteList == null) {
            System.out.println("Não foi possivel encontrar nenhum registro de conta");

        } else {

            for (int i = 0; i < contaCorrenteList.length; i++) {
                if (contaCorrenteList[i] != null) {
                    System.out.println(contaCorrenteList[i].toString());
                }
            }
        }
    }

    public void listarId() {

        if (contaCorrenteList.length == 0) {
            System.out.println("Não foi possivel encontrar nenhum registro de conta");

        } else {

            for (int i = 0; i < contaCorrenteList.length; i++) {
                if (contaCorrenteList[i] != null) {
                    System.out.println("id: " + contaCorrenteList[i].getId() + '\n' + "Cliente: " + contaCorrenteList[i].getClienteContaCorrente());
                }
            }
        }
    }

    //Achar o aeroporto
    public ContaCorrente acharClienteContaCorrente(long id) {

        for (int i = 0; i < contaCorrenteList.length; i++) {
            
            if (contaCorrenteList[i] != null && contaCorrenteList[i].getId() == id) {
                return contaCorrenteList[i];
            }
        }
        return null;
    }

    //Achar o aeroporto
    public int modificarCliente(ContaCorrente contaCorrente) {

        for (int i = 0; i < contaCorrenteList.length; i++) {
            //Achar aeroporto
            if (contaCorrenteList[i] != null && contaCorrenteList[i].getId() == contaCorrente.getId()) {
                contaCorrenteList[i] = contaCorrente;
                return 1;
            }
        }
        return -1;
    }

    //Excluir a conta
    public int excluirConta(int idContaCorrente) {

        for (int i = 0; i < contaCorrenteList.length; i++) {
            if (contaCorrenteList[i] != null && contaCorrenteList[i].getId() == idContaCorrente) {
                contaCorrenteList[i] = null;
                return 1;
            }
        }
        return -1;
    }
}
