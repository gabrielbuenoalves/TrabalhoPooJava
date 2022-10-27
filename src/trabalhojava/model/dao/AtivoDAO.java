/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhojava.model.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import trabalhojava.model.Ativo;;

/**
 *
 * @author gilbe
 */
public class AtivoDAO {
    private int id = 3;

    private Ativo[] ativoList = new Ativo[10];

    public AtivoDAO() {

        ativoList[0] = new Ativo();
        ativoList[0].setId(1);
        ativoList[0].setNomeEmpresa("Borracharia do burraxá");
        ativoList[0].setTotalAtivos(Math.random());
        ativoList[0].setValorInicial(22);
        ativoList[0].setTicker("burraxa123");
        ativoList[0].setDataCriacao(LocalDateTime.now());
        ativoList[0].setDataModificacao(LocalDateTime.now());

    }

    public int inserirAtivo(Ativo ativo) {
        for (int i = 0; i < ativoList.length; i++) {
            if (ativoList[i] == null) {
                ativo.setId(id);
                id++;
                ativoList[i] = ativo;
                return 1;
            }
        }
        return -1;
    }

    public void listar() {

        if (ativoList == null) {
            System.out.println("Nenhum ativo encontrado");

        } else {

            for (int i = 0; i < ativoList.length; i++) {
                if (ativoList[i] != null) {
                    System.out.println(ativoList[i].toString());
                }
            }
        }
    }

    public void listarId() {

        if (ativoList.length == 0) {
            System.out.println("Nenhum ativo encontrado");

        } else {

            for (int i = 0; i < ativoList.length; i++) {
                if (ativoList[i] != null) {
                    System.out.println("id: " + ativoList[i].getId() + '\n' + "Ativo da empresa: " + ativoList[i].getNomeEmpresa() + "Ticker" + ativoList[i].getTicker());
                }
            }
        }
    }

    //Achar o aeroporto
    public Ativo acharAtivo(long id) {

        for (int i = 0; i < ativoList.length; i++) {
            
            if (ativoList[i] != null && ativoList[i].getId() == id) {
                return ativoList[i];
            }
        }
        return null;
    }

    //Achar o aeroporto
    public int modificarCliente(Ativo ativo) {

        for (int i = 0; i < ativoList.length; i++) {
          
            if (ativoList[i] != null && ativoList[i].getId() == ativo.getId()) {
                ativoList[i] = ativo;
                return 1;
            }
        }
        return -1;
    }

    //Excluir a conta
    public int excluirAtivo(int idAtivo) {

        for (int i = 0; i < ativoList.length; i++) {
            if (ativoList[i] != null && ativoList[i].getId() == idAtivo) {
                ativoList[i] = null;
                return 1;
            }
        }
        return -1;
    }
}
