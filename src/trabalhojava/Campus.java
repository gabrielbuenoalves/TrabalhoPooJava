/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author Chrystian
 */
public class Campus {
    int id;
    String nomeCampus;
    String abrevCampus;
    String cidade;
    String bairro;
    String logradouro;
    String cep;
    LocalTime duracaoAulas;
    LocalDate dataCriacaoCampus;
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;
    
    @Override
    public String toString() {
        return "\nCampus" 
                + "\nId = " + id 
                + "\nNomeCampus = " + nomeCampus 
                + "\nAbrevCampus = " + abrevCampus 
                + "\nCidade = " + cidade 
                + "\nBairro=" + bairro 
                + "\nLogradouro = " + logradouro 
                + "\nCep = " + cep 
                + "\nDuracaoAulas = " + duracaoAulas 
                + "\nDataCriacaoCampus = " + dataCriacaoCampus 
                + "\nDataCriacao = " + dataCriacao 
                + "\nDataModificacao = " + dataModificacao;
    }
}
