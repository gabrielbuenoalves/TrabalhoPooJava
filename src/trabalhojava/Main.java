/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojava;

import trabalhojava.controller.ClienteController;
import java.util.Scanner;
import trabalhojava.model.dao.ClienteDAO;

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

    //Declara controller
    ClienteController clienteController = new ClienteController();

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
                System.out.println("Insira a opção: ");
                opc = s.nextInt();
                switch (opc) {
                    case 1:
                        clienteController.open(clienteDAO);
                        break;
                        
                    case 2:
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
