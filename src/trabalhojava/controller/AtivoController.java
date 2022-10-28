package trabalhojava.controller;

import java.util.Scanner;
import trabalhojava.model.Ativo;
import trabalhojava.model.dao.AtivoDAO;
import trabalhojava.view.AtivoView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class AtivoController {

    static Scanner s = new Scanner(System.in);

    private AtivoView ativoView = new AtivoView();

    public void open(AtivoDAO ativoDAO) {
        int opcMenu = 0;
        int idAtivo = 0;
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
                    
                    Ativo ativo = ativoView.insereDados();
                    if (ativoDAO.inserirAtivo(ativo) == 1) {
                        System.out.println("Ativo inserido");
                    } else {
                        System.err.println("Ativo nao inserido");
                    }
                    ;
                    break;

                case 2:
                    ativoDAO.listar();
                    break;

                case 3:
                    ativoDAO.listarId();
                    System.out.println("Insira o id do ativo que deseja: ");
                    idAtivo = s.nextInt();
                    Ativo ativoUpdatado = ativoDAO.acharAtivo(idAtivo);

                    if (ativoUpdatado == null) {
                        System.err.println("Ativo nao existe, bobao");
                    } else {

                        ativoUpdatado = ativoView.modificarAtivo(ativoUpdatado);

                        if (ativoDAO.modificarCliente(ativoUpdatado) == 1) {
                            System.out.println("Ativo modificado");
                        } else {
                            System.out.println("Ativo nao modificado");
                        }

                    }

                    break;

                case 4:
                    ativoDAO.listarId();
                    System.out.println("Insira o id do ativo que deseja: ");
                    idAtivo = s.nextInt();
                    System.out.println(idAtivo);
                    ativoDAO.excluirAtivo(idAtivo);
                    break;
                case 5:
                    ativoDAO.listarId();
                    idAtivo = s.nextInt();
                    Ativo contaCorrenteAchada = ativoDAO.acharAtivo(idAtivo);
                    if (contaCorrenteAchada != null) {
                        System.out.println(contaCorrenteAchada.toString());
                    }
                    break;
            }

        }

    }
}
