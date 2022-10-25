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
public class DisciplinaNoCurso {
    int id;
    String curso;
    String disciplina;
    String professor;
    String ano;
    String semestre;
    String aulasSemanais;
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;

    @Override
    public String toString() {
        return "DisciplinaNoCurso" 
                + "\nId=" + id 
                + "\nCurso=" + curso 
                + "\nDisciplina=" + disciplina 
                + "\nProfessor=" + professor 
                + "\nAno=" + ano 
                + "\nSemestre=" + semestre 
                + "\nAulasSemanais=" + aulasSemanais 
                + "\nDataCriacao=" + dataCriacao 
                + "\nDataModificacao=" + dataModificacao;
    }
    
    
}
