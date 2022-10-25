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
public class Comissoes {
    int id;
    String comissao;
    String horasSemanais;
    LocalDateTime dataInicio;
    LocalDateTime dataTermino;
    String estado; //ativa/inativa
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;

    @Override
    public String toString() {
        return "Comissoes" 
                + "\nId=" + id 
                + "\nComissao=" + comissao 
                + "\nHorasSemanais=" + horasSemanais 
                + "\nDataInicio=" + dataInicio 
                + "\nDataTermino=" + dataTermino 
                + "\nEstado=" + estado 
                + "\nDataCriacao=" + dataCriacao 
                + "\nDataModificacao=" + dataModificacao;
    }
    
    
    
}
