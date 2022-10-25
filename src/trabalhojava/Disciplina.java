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
public class Disciplina {
    int id;
    String nomeDisciplina;
    String cargaHoraria;
    String periodicidade; //semestral,anual
    String curso;
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;

    @Override
    public String toString() {
        return "Disciplina" 
                + "\nId=" + id 
                + "\nNomeDisciplina=" + nomeDisciplina 
                + "\nCargaHoraria=" + cargaHoraria 
                + "\nPeriodicidade=" + periodicidade 
                + "\nCurso=" + curso 
                + "\nDataCriacao=" + dataCriacao 
                + "\nDataModificacao=" + dataModificacao;
    }
    
    
}
