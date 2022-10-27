package trabalhojava.controller;

import java.time.LocalDateTime;
import java.util.Scanner;
import trabalhojava.model.Cliente;
import trabalhojava.model.dao.ClienteDAO;
import trabalhojava.view.ClienteView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author aluno
 */
public class ClienteController {

    static Scanner s = new Scanner(System.in);

    private ClienteView clienteView = new ClienteView();

    public void open(ClienteDAO clienteDAO) {
        int opcMenu = 0;
        int idCliente = 0;
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
                    
                    Cliente cliente = clienteView.insereDados();
                    if (clienteDAO.inserirCliente(cliente) == 1) {
                        System.out.println("Cliente inserido");
                    } else {
                        System.err.println("Cliente nao inserido");
                    }
                    ;
                    break;

                case 2:
                    clienteDAO.listar();
                    break;

                case 3:
                    clienteDAO.listarId();
                    System.out.println("Insira o id do cliente que deseja: ");
                    idCliente = s.nextInt();
                    Cliente clienteUpdatado = clienteDAO.acharCliente(idCliente);

                    if (clienteUpdatado == null) {
                        System.err.println("Cliente nao existe, bobao");
                    } else {

                        clienteUpdatado = clienteView.modificarCliente(clienteUpdatado);

                        if (clienteDAO.modificarCliente(clienteUpdatado) == 1) {
                            System.out.println("cliente modificado");
                        } else {
                            System.out.println("Cliente nao modificado");
                        }

                    }

                    break;

                case 4:
                    clienteDAO.listarId();
                    System.out.println("Insira o id do cliente que deseja: ");
                    idCliente = s.nextInt();
                    System.out.println(idCliente);
                    clienteDAO.excluirCliente(idCliente);
                    break;
                case 5:
                    clienteDAO.listarId();
                    idCliente = s.nextInt();
                    Cliente clienteAchado = clienteDAO.acharCliente(idCliente);
                    if (clienteAchado != null) {
                        System.out.println(clienteAchado.toString());
                    }
                    break;
            }

        }

    }
}
