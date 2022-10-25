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
public class ServidoresComissoes {
    int id;
    String comissao;
    String servidor;
    String papel;//(presidente, vice, secretario, participante, suplemente)
    LocalDateTime dataEntrada;
    LocalDateTime dataSaida;
    LocalDateTime dataCriacao;
    LocalDateTime dataModificacao;

    @Override
    public String toString() {
        return "ServidoresComissoes" 
                + "\nId=" + id 
                + "\nComissao=" + comissao 
                + "\nServidor=" + servidor 
                + "\nPapel=" + papel 
                + "\nDataEntrada=" + dataEntrada 
                + "\nDataSaida=" + dataSaida 
                + "\nDataCriacao=" + dataCriacao 
                + "\nDataModificacao=" + dataModificacao;
    }
    
    
}
