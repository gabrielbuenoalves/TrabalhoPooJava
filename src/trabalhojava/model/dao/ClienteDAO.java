package trabalhojava.model.dao;

import java.time.LocalDateTime;

import trabalhojava.model.Cliente;

/**
 *
 * @author Carlos Eduardo Cabral
 */
public class ClienteDAO {

    private int id = 3;

    private Cliente[] clienteList = new Cliente[10];

    public ClienteDAO() {

        clienteList[0] = new Cliente();
        clienteList[0].setId(1);
        clienteList[0].setNome("crebin");
        clienteList[0].setCpf("21312312");
        clienteList[0].setEndereco("a");
        clienteList[0].setData_criacao(LocalDateTime.now());
        clienteList[0].setData_modificacao(LocalDateTime.now());

        clienteList[1] = new Cliente();
        clienteList[1].setId(2);
        clienteList[1].setNome("joaozin");
        clienteList[1].setCpf("321321");
        clienteList[1].setEndereco("b");
        clienteList[1].setData_criacao(LocalDateTime.now());
        clienteList[1].setData_modificacao(LocalDateTime.now());

    }

    public int inserirCliente(Cliente cliente) {
        for (int i = 0; i < clienteList.length; i++) {
            if (clienteList[i] == null) {
                cliente.setId(id);
                id++;
                clienteList[i] = cliente;
                return 1;
            }
        }
        return -1;
    }

    public void listar() {

        if (clienteList == null) {
            System.out.println("Nenhum cliente");

        } else {

            for (int i = 0; i < clienteList.length; i++) {
                if (clienteList[i] != null) {
                    System.out.println(clienteList[i].toString());
                }
            }
        }
    }

    public void listarId() {

        if (clienteList.length == 0) {
            System.out.println("Nenhum cliente");

        } else {

            for (int i = 0; i < clienteList.length; i++) {
                if (clienteList[i] != null) {
                    System.out.println("id: " + clienteList[i].getId() + '\n' + "nome: " + clienteList[i].getNome());
                }
            }
        }
    }

    
    public Cliente acharCliente(long id) {

        for (int i = 0; i < clienteList.length; i++) {
            
            if (clienteList[i] != null && clienteList[i].getId() == id) {
                return clienteList[i];
            }
        }
        return null;
    }
    
    public int isLoged(long id){
        for (int i = 0; i < clienteList.length; i++) {
            
            if (clienteList[i] != null && clienteList[i].getId() == id) {
                int logado = clienteList[i].getLogado();
               if(logado == 1 ){
                   return 1;
               }
            }
        }
        return 0;
    }
    public Cliente login(String login, String senha) {
        for (int i = 0; i < clienteList.length; i++){
            if(clienteList[i] != null ){
                if(clienteList[i].getLogin().equals(login) && clienteList[i].getSenha().equals(senha));
                clienteList[i].setLogado(1);
                System.out.println(clienteList[i].getLogado());
                return login(login, senha);
            }
        }
            return null;
                    
    }
    public int modificarCliente(Cliente cliente) {

        for (int i = 0; i < clienteList.length; i++) {
            //Achar aeroporto
            if (clienteList[i] != null && clienteList[i].getId() == cliente.getId()) {
                clienteList[i] = cliente;
                return 1;
            }
        }
        return -1;
    }

    //Excluir a conta
    public int excluirCliente(int idCliente) {

        for (int i = 0; i < clienteList.length; i++) {
            if (clienteList[i] != null && clienteList[i].getId() == idCliente) {
                clienteList[i] = null;
                return 1;
            }
        }
        return -1;
    }

}
