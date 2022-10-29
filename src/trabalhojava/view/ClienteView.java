package trabalhojava.view;

import java.time.LocalDateTime;
import java.util.Scanner;
import trabalhojava.controller.ClienteController;
import trabalhojava.model.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteView {
    Scanner scan = new Scanner(System.in);
    
    public Cliente insereDados() {
        Cliente cliente = new Cliente();
        System.out.println("Insira seu nome caboco vei");
        cliente.setNome(scan.nextLine());
        System.out.println("Insira seucpf e caboco vei");
        cliente.setCpf(scan.nextLine());
        System.out.println("Insira seu endereço caboco vei");
        cliente.setEndereco(scan.nextLine());
        System.out.println("Insira seu login caboco vei");
        cliente.setLogin(scan.nextLine());
        System.out.println("Insira sua senha caboco vei");
        cliente.setSenha(scan.nextLine());
        cliente.setLogado(0);
        System.out.println("Obrigado pela preferência");
        cliente.setData_criacao(LocalDateTime.now());
        cliente.setData_modificacao(LocalDateTime.now());
        return cliente;
    }
   
    public Cliente modificarCliente(Cliente clienteUpdatado) {
        clienteUpdatado.setNome(scan.nextLine());
        clienteUpdatado.setCpf(scan.nextLine());
        clienteUpdatado.setEndereco(scan.nextLine());
        clienteUpdatado.setLogin(scan.nextLine());
        clienteUpdatado.setSenha(scan.nextLine());
        clienteUpdatado.setData_modificacao(LocalDateTime.now());
        return clienteUpdatado;
    }
    
}
