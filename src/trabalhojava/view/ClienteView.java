package trabalhojava.view;

import java.time.LocalDateTime;
import java.util.Scanner;
import trabalhojava.model.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteView {
    Scanner scan = new Scanner(System.in);
    
    public Cliente insereDados() {
        Cliente cliente = new Cliente();
        cliente.setNome(scan.nextLine());
        cliente.setCpf(scan.nextLine());
        cliente.setEndereco(scan.nextLine());
        cliente.setData_criacao(LocalDateTime.now());
        cliente.setData_modificacao(LocalDateTime.now());
        return cliente;
    }

    public Cliente modificarCliente(Cliente clienteUpdatado) {
        clienteUpdatado.setNome(scan.nextLine());
        clienteUpdatado.setCpf(scan.nextLine());
        clienteUpdatado.setEndereco(scan.nextLine());
        clienteUpdatado.setData_modificacao(LocalDateTime.now());
        return clienteUpdatado;
    }
    
}
