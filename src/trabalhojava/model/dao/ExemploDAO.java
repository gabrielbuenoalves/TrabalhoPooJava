package trabalhojava.model.dao;

ç
package trabalhojava;


import java.time.LocalDate;

/**
 *
 * @author Carlos Eduardo Cabral
 */
public class ExemploDAO {
    
    ExemploDAO[] aeroportosCadastrados = new Aeroporto[10];
    
    
    ExemploDAO(){
        
        aeroportosCadastrados[0] = new Aeroporto();
        aeroportosCadastrados[0].setNome("UBERABA");
        aeroportosCadastrados[0].setAbreviacao("Uber");
        aeroportosCadastrados[0].setCidade("UBERABA");
        aeroportosCadastrados[0].setData_criacao(LocalDate.now());
        aeroportosCadastrados[0].setData_modificacao(LocalDate.now());
        
        
        aeroportosCadastrados[1] = new Aeroporto();
        aeroportosCadastrados[1].setNome("SAOPAULO");
        aeroportosCadastrados[1].setAbreviacao("Sao");
        aeroportosCadastrados[1].setCidade("SAOPAULO");
        aeroportosCadastrados[1].setData_criacao(LocalDate.now());
        aeroportosCadastrados[1].setData_modificacao(LocalDate.now());
    
        
        aeroportosCadastrados[3] = new Aeroporto();
        aeroportosCadastrados[3].setNome("NOVAIORQUE");
        aeroportosCadastrados[3].setAbreviacao("Ny");
        aeroportosCadastrados[3].setCidade("NOVAIORQUE");
        aeroportosCadastrados[3].setData_criacao(LocalDate.now());
        aeroportosCadastrados[3].setData_modificacao(LocalDate.now());
       
        aeroportosCadastrados[2] = new Aeroporto();
        aeroportosCadastrados[2].setNome("LONDRES");
        aeroportosCadastrados[2].setAbreviacao("Lond");
        aeroportosCadastrados[2].setCidade("LONDRES");
        aeroportosCadastrados[2].setData_criacao(LocalDate.now());
        aeroportosCadastrados[2].setData_modificacao(LocalDate.now());
        
        aeroportosCadastrados[4] = new Aeroporto();
        aeroportosCadastrados[4].setId(5);
        aeroportosCadastrados[4].setNome("PARIS");
        aeroportosCadastrados[4].setAbreviacao("Pa");
        aeroportosCadastrados[4].setCidade("PARIS");
        aeroportosCadastrados[4].setData_criacao(LocalDate.now());
        aeroportosCadastrados[4].setData_modificacao(LocalDate.now());

    }

    
    
    
    public int inserirAeroporto(Aeroporto aeroporto){
        int ultimo = proximaPosicaoLivre();
        if(ultimo != -1){
            aeroportosCadastrados[ultimo] = aeroporto;
            return 1;
        }else{
            return -1; 
        }
    }
    
    public int proximaPosicaoLivre(){
        
        if(aeroportosCadastrados != null){
            for(int i = 0; i< aeroportosCadastrados.length; i++){
                if(aeroportosCadastrados[i] == null){
                    return i;
                }
            }
        }
        return -1;
    }
    
    public void listar(){
        
        if(aeroportosCadastrados == null){
            System.out.println("Nenhum aeroporto");
                    
        } else {
            
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("                                    Tabela de Aeroportos");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println(String.format("%10s", "id") + String.format("%30s", "nome") + String.format("%20s", "abreviacao") + String.format("%20s", "Cidade") + String.format("%20s", "Data Criação") + String.format("%20s", "Data Modificação"));
            for(int i=0 ; i<aeroportosCadastrados.length; i++){

                if(aeroportosCadastrados[i] != null){
                    System.out.println("-------------------------------------------------------------------------------------------------------");
                    System.out.println(aeroportosCadastrados[i].toString());
                }


            }
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }
    }
    
    
    //Achar o aeroporto
    public Aeroporto acharAeroporto(long id){
        
        for(int i = 0 ; i < aeroportosCadastrados.length; i++){
            //Achar aeroporto
            if(aeroportosCadastrados[i] != null  && aeroportosCadastrados[i].getId() == id){
                return aeroportosCadastrados[i];
            }
        }
        return null;
    }
    
    
    //Excluir a conta
    public int excluirAeroporto(Aeroporto aeroporto){
        
        for (int i = 0; i < aeroportosCadastrados.length; i++) {
            
            if(aeroporto.equals(aeroportosCadastrados[i])){
                aeroportosCadastrados[i] = null;
                return 1;
            }
        }
        return -1; 
    }

    
    
    
}

