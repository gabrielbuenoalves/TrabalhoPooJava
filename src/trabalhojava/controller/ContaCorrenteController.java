package trabalhojava.controller;

import java.util.Scanner;
import trabalhojava.model.ContaCorrente;
import trabalhojava.model.dao.ContaCorrenteDAO;
import trabalhojava.view.ContaCorrenteView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class ContaCorrenteController {

    static Scanner s = new Scanner(System.in);

    private ContaCorrenteView contaCorrenteView = new ContaCorrenteView();

    public void open(ContaCorrenteDAO contaDAO) {
        int opcMenu = 0;
        int idConta = 0;
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
                    
                    ContaCorrente conta = contaCorrenteView.insereDados();
                    if (contaDAO.inserirContaCorrente(conta) == 1) {
                        System.out.println("Conta inserida");
                    } else {
                        System.err.println("Conta nao inserida");
                    }
                    ;
                    break;

                case 2:
                    contaDAO.listar();
                    break;

                case 3:
                    contaDAO.listarId();
                    System.out.println("Insira o id da cconta que deseja: ");
                    idConta = s.nextInt();
                    ContaCorrente contaUpdatada = contaDAO.acharContaCorrente(idConta);

                    if (contaUpdatada == null) {
                        System.err.println("Conta nao existe, bobao");
                    } else {

                        contaUpdatada = contaCorrenteView.modificarContaCorrente(contaUpdatada);

                        if (contaDAO.modificarContaCorrente(contaUpdatada) == 1) {
                            System.out.println("Conta modificada");
                        } else {
                            System.out.println("Conta nao modificada");
                        }

                    }

                    break;

                case 4:
                    contaDAO.listarId();
                    System.out.println("Insira o id da conta que deseja: ");
                    idConta = s.nextInt();
                    System.out.println(idConta);
                    contaDAO.excluirConta(idConta);
                    break;
                case 5:
                    contaDAO.listarId();
                    idConta = s.nextInt();
                    ContaCorrente contaCorrenteAchada = contaDAO.acharContaCorrente(idConta);
                    if (contaCorrenteAchada != null) {
                        System.out.println(contaCorrenteAchada.toString());
                    }
                    break;
            }

        }

    }
}
