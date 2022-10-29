/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojava;

import trabalhojava.controller.ClienteController;
import java.util.Scanner;
import trabalhojava.model.dao.ClienteDAO;
import trabalhojava.controller.ContaCorrenteController;
import trabalhojava.model.dao.ContaCorrenteDAO;
import trabalhojava.model.dao.AtivoDAO;
import trabalhojava.controller.AtivoController;
/**
 *
 * @author Chrystian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner s = new Scanner(System.in);

    //Declara todos DAO
    ClienteDAO clienteDAO = new ClienteDAO();
    ContaCorrenteDAO contaCorrenteDAO  = new ContaCorrenteDAO();
    AtivoDAO ativoDAO = new AtivoDAO();
    //Declara controller
    ClienteController clienteController = new ClienteController();
    ContaCorrenteController contaCorrenteController = new ContaCorrenteController();
    AtivoController ativoController = new AtivoController();
    public static void main(String[] args) {
        new Main();
    }

    Main() {
        metodoPrincipal();
    }

    private void metodoPrincipal() {

        try {
            int opc = 0;
            while (opc != 6) {
                
                System.out.println("1 - Cliente");
                System.out.println("2 - Logar Cliente");
                System.out.println("3 - Criar Conta Cliente");
                System.out.println("4 - Comprar Ativo");
                System.out.println("5 - Vender Ativo Cliente");
                System.out.println("6 - Criar Conta Cliente");
                System.out.println("7 - Imprimir extrato");
                System.out.println("Insira a opção: ");
                opc = s.nextInt();
                switch (opc) {
                    case 1:
                        clienteController.open(clienteDAO);
                        break;
                        
                    case 2:
                        contaCorrenteController.open(contaCorrenteDAO);
                        break;
                    case 3:
                        ativoController.open(ativoDAO);
                        break;
                    case 4:
                        ativoController.open(ativoDAO);
                        break;
                    case 5:
                        ativoController.open(ativoDAO);
                        break;
                    case 6:
                        ativoController.open(ativoDAO);
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
