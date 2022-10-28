package trabalhojava.controller;

import java.util.Scanner;
import trabalhojava.model.OrdemExecucao;
import trabalhojava.model.dao.OrdemExecucaoDAO;
import trabalhojava.view.OrdemExecucaoView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class OrdemExecucaoController {

    static Scanner s = new Scanner(System.in);

    private OrdemExecucaoView OrdemExecucaoView = new OrdemExecucaoView();

    public void open(OrdemExecucaoDAO ordemDAO) {
        int opcMenu = 0;
        int idOrdem = 0;
        while (opcMenu != 6) {
            System.out.println("1 - create");
            System.out.println("2 - read");
            System.out.println("3 - update");
            System.out.println("4 - delete");
            System.out.println("5 - read by id");
            System.out.println("6 - finish");
            System.out.println("Insere um numero ai bobao: ");
            opcMenu = s.nextInt();
            
            switch (opcMenu) {
                case 1:
                    
                    OrdemExecucao ordem = OrdemExecucaoView.insereDados();
                    if (ordemDAO.inserirOrdemExecucao(ordem) == 1) {
                        System.out.println("Ordem inserida");
                    } else {
                        System.err.println("Ordem nao inserida");
                    }
                    ;
                    break;

                case 2:
                    ordemDAO.listar();
                    break;

                case 3:
                    ordemDAO.listarId();
                    System.out.println("Insira o id da ordem que deseja: ");
                    idOrdem = s.nextInt();
                    OrdemExecucao OrdemUpdatado = ordemDAO.acharOrdem(idOrdem);

                    if (OrdemUpdatado == null) {
                        System.err.println("Ordem nao existe, bobao");
                    } else {

                        OrdemUpdatado = OrdemExecucaoView.modificarOrdemExecucao(OrdemUpdatado);

                        if (ordemDAO.modificarOrdem(OrdemUpdatado) == 1) {
                            System.out.println("Ordem modificada");
                        } else {
                            System.out.println("Ordem nao modificada");
                        }

                    }

                    break;

                case 4:
                    ordemDAO.listarId();
                    System.out.println("Insira o id da ordem que deseja: ");
                    idOrdem = s.nextInt();
                    System.out.println(idOrdem);
                    ordemDAO.excluirAtivo(idOrdem);
                    break;
                case 5:
                    ordemDAO.listarId();
                    idOrdem = s.nextInt();
                    OrdemExecucao ordemAchada = ordemDAO.acharOrdem(idOrdem);
                    if (ordemAchada != null) {
                        System.out.println(ordemAchada.toString());
                    }
                    break;
            }

        }

    }
}
