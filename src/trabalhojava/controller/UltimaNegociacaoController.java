package trabalhojava.controller;

import java.util.Scanner;
import trabalhojava.model.UltimaNegociacao;
import trabalhojava.model.dao.UltimaNegociacaoDAO;
import trabalhojava.view.UltimaNegociacaoView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class UltimaNegociacaoController {

    static Scanner s = new Scanner(System.in);

    private UltimaNegociacaoView ultimaNegociacaoView = new UltimaNegociacaoView();

    public void open(UltimaNegociacaoDAO ultimaNegociacaoDAO) {
        int opcMenu = 0;
        int idUltimaNegociacao = 0;
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
                    
                    UltimaNegociacao ultimaNegociacao = ultimaNegociacaoView.insereDados();
                    if (ultimaNegociacaoDAO.inserirUltimaNegociacao(ultimaNegociacao) == 1) {
                        System.out.println("ultima Negociacao inserida");
                    } else {
                        System.err.println("ultima Negociacao nao inserida");
                    }
                    ;
                    break;

                case 2:
                    ultimaNegociacaoDAO.listar();
                    break;

                case 3:
                    ultimaNegociacaoDAO.listarId();
                    System.out.println("Insira o id da ordem que deseja: ");
                    idUltimaNegociacao = s.nextInt();
                    UltimaNegociacao ultimaNegociacaoUpdatado = ultimaNegociacaoDAO.acharOrdem(idUltimaNegociacao);

                    if (ultimaNegociacaoUpdatado == null) {
                        System.err.println("ultima Negociacao nao existe, bobao");
                    } else {

                        ultimaNegociacaoUpdatado = ultimaNegociacaoView.modificarOrdem(ultimaNegociacaoUpdatado);

                        if (ultimaNegociacaoDAO.modificarUltimaNegociacao(ultimaNegociacaoUpdatado) == 1) {
                            System.out.println("ultima Negociacao modificada");
                        } else {
                            System.out.println("ultima Negociacao nao modificada");
                        }

                    }

                    break;

                case 4:
                    ultimaNegociacaoDAO.listarId();
                    System.out.println("Insira o id da ultima Negociacao que deseja: ");
                    idUltimaNegociacao = s.nextInt();
                    System.out.println(idUltimaNegociacao);
                    ultimaNegociacaoDAO.excluirUltimaNegociacao(idUltimaNegociacao);
                    break;
                case 5:
                    ultimaNegociacaoDAO.listarId();
                    idUltimaNegociacao = s.nextInt();
                    UltimaNegociacao ordemAchada = ultimaNegociacaoDAO.acharOrdem(idUltimaNegociacao);
                    if (ordemAchada != null) {
                        System.out.println(ordemAchada.toString());
                    }
                    break;
            }

        }

    }
}
