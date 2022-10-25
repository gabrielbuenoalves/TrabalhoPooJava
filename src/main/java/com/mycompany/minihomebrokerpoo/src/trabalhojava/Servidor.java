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
public class Servidor {
    int id;
    String nomeServidor;
    String emailServidor;
    String campusServidor;
    String cargoServidor;
    String loginServidor;
    String senhaServidor;
    LocalDate dataCriacaoServidor;
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;

    @Override
    public String toString() {
        return "Servidor"
                + "\nId=" + id 
                + "\nNomeServidor=" + nomeServidor 
                + "\nEmailServidor=" + emailServidor 
                + "\nNomeCampus=" + campusServidor 
                + "\nCargoServidor=" + cargoServidor 
                + "\nLoginServidor=" + loginServidor 
                + "\nSenhaServidor=" + senhaServidor 
                + "\nDataCriacaoServidor=" + dataCriacaoServidor 
                + "\nDataCriacao=" + dataCriacao 
                + "\nDataModificacao=" + dataModificacao;
    }
    
    
}
