/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhojava.view;

import java.time.LocalDateTime;
import trabalhojava.model.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteView {

    public Cliente insereDados() {
        Cliente cliente = new Cliente();
        cliente.setNome("a");
        cliente.setCpf("a");
        cliente.setEndereco("a");
        cliente.setData_criacao(LocalDateTime.now());
        cliente.setData_modificacao(LocalDateTime.now());
        return cliente;
    }

    public Cliente modificarCliente(Cliente clienteUpdatado) {
        clienteUpdatado.setNome("a_updatado");
        clienteUpdatado.setCpf("a_updatado");
        clienteUpdatado.setEndereco("a_updatado");
        clienteUpdatado.setData_modificacao(LocalDateTime.now());
        return clienteUpdatado;
    }

}
