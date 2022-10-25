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
public class AtaReunioes {
    int id;
    String comissao;
    String dataReuniao;
    String conteudoAta;
    String servidorSecretario;
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;

    @Override
    public String toString() {
        return "Reunioes" 
                + "\nId=" + id 
                + "\nComissao=" + comissao 
                + "\nDataReuniao=" + dataReuniao 
                + "\nConteudoAta=" + conteudoAta 
                + "\nServidorSecretario=" + servidorSecretario 
                + "\nDataCriacao=" + dataCriacao 
                + "\nDataModificacao=" + dataModificacao;
    }
    
    
}
