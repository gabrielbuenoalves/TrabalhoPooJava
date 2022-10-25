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
public class Curso {
    int id;
    String nomeCurso;
    String estadoCurso;
    String anoInicio;
    String anoTermino;
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;

    @Override
    public String toString() {
        return "Curso" 
                + "\nId=" + id 
                + "\nNomeCurso=" + nomeCurso 
                + "\nEstadoCurso=" + estadoCurso 
                + "\nAnoInicio=" + anoInicio 
                + "\nAnoTermino=" + anoTermino 
                + "\nDataCriacao=" + dataCriacao 
                + "\nDataModificacao=" + dataModificacao;
    }
    
    
}
