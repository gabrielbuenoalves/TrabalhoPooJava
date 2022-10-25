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
public class Orientacoes {
    int id;
    String tipoOrientacao; //(ensino, pesquisa, extensão, estagio, tcc, mestrado, doutorado)
    String nomeAluno;
    String horasSemanais;
    LocalDateTime dataInicio;
    LocalDateTime dataTermino;
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;

    @Override
    public String toString() {
        return "Orientacoes" 
                + "\nId=" + id 
                + "\nTipoOrientacao=" + tipoOrientacao 
                + "\nNomeAluno=" + nomeAluno 
                + "\nHorasSemanais=" + horasSemanais 
                + "\nDataInicio=" + dataInicio 
                + "\nDataTermino=" + dataTermino 
                + "\nDataCriacao=" + dataCriacao 
                + "\nDataModificacao=" + dataModificacao;
    }
    
    
}
