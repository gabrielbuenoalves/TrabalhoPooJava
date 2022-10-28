package trabalhojava.controller;

import java.util.Scanner;
import trabalhojava.model.MovimentacaoConta;
import trabalhojava.model.dao.MovimentacaoDao;
import trabalhojava.view.MovimentacaoView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class MovimentacaoController{

    static Scanner s = new Scanner(System.in);

    private MovimentacaoView movimentacaoView = new MovimentacaoView();

    public void open(MovimentacaoDao movimentacaoDao) {
        int opcMenu = 0;
        int idMovimentacao = 0;
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
                    
                    MovimentacaoConta movimentacaoConta = movimentacaoView.insereDados();
                    if (movimentacaoDao.inserirMovimentacaoConta(movimentacaoConta) == 1) {
                        System.out.println("Movimentacao inserida");
                    } else {
                        System.err.println("Movimentacao nao inserida");
                    }
                    ;
                    break;

                case 2:
                    movimentacaoDao.listar();
                    break;

                case 3:
                    movimentacaoDao.listarId();
                    System.out.println("Insira o id da movimentacao que deseja: ");
                    idMovimentacao = s.nextInt();
                    MovimentacaoConta movimentacaoUpdatado = movimentacaoDao.acharMovimentacao(idMovimentacao);

                    if (movimentacaoUpdatado == null) {
                        System.err.println("Movimentacao nao existe, bobao");
                    } else {

                        movimentacaoUpdatado = movimentacaoView.modificarMovimentacao(movimentacaoUpdatado);

                        if (movimentacaoDao.modificarCliente(movimentacaoUpdatado) == 1) {
                            System.out.println("Ativo modificado");
                        } else {
                            System.out.println("Ativo nao modificado");
                        }

                    }

                    break;

                case 4:
                    movimentacaoDao.listarId();
                    System.out.println("Insira o id da movimentacao que deseja: ");
                    idMovimentacao = s.nextInt();
                    System.out.println(idMovimentacao);
                    movimentacaoDao.excluirAtivo(idMovimentacao);
                    break;
                case 5:
                    movimentacaoDao.listarId();
                    idMovimentacao = s.nextInt();
                    MovimentacaoConta movimentacaoAchada = movimentacaoDao.acharMovimentacao(idMovimentacao);
                    if (movimentacaoAchada != null) {
                        System.out.println(movimentacaoAchada.toString());
                    }
                    break;
            }

        }

    }
}
