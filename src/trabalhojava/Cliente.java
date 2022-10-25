/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhojava;

import java.time.LocalDateTime;

/**
 *=>CRUD de cliente
id
nome
endereço
CPF
telefone
login
senha
tipoUsuario
dataCriacao
dataModificacao
 * @author gilbe
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String login;
    private String senha;
    private LocalDateTime data_criacao; 
    private LocalDateTime data_modificacao;

    public Cliente(String nome, String cpf, String telefone, String login, String senha, LocalDateTime data_criacao, LocalDateTime data_modificacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.data_criacao = data_criacao;
        this.data_modificacao = data_modificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }

    public LocalDateTime getData_modificacao() {
        return data_modificacao;
    }

    public void setData_modificacao(LocalDateTime data_modificacao) {
        this.data_modificacao = data_modificacao;
    }
    
}
