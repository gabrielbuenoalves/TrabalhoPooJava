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
public class ReunioesPresentes {
    int id;
    String comissao;
    String ataReuniao;
    String servidor;
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;

    @Override
    public String toString() {
        return "ReunioesPresentes" 
                + "\nId=" + id 
                + "\nComissao=" + comissao 
                + "\nAtaReuniao=" + ataReuniao 
                + "\nServidor=" + servidor 
                + "\nDataCriacao=" + dataCriacao 
                + "\nDataModificacao=" + dataModificacao;
    }

    
    
}
