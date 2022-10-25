/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Chrystian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner s = new Scanner(System.in);
    
    Campus[] allCampus = new Campus[3];
    
    Servidor[] allServidor = new Servidor[3];
    
    Curso[] allCurso = new Curso[3];
    
    Disciplina[] allDisciplina = new Disciplina[3];
    
    DisciplinaNoCurso[] allDisciplinaNoCurso = new DisciplinaNoCurso[3];
    
    Orientacoes[] allOrientacoes = new Orientacoes[3];
    
    Atividades[] allAtividades = new Atividades[3];
    
    Comissoes[] allComissoes = new Comissoes[3];
    
    ServidoresComissoes[] allServidoresComissoes = new ServidoresComissoes[3];
    
    AtaReunioes[] allAtaReunioes = new AtaReunioes[3];
    
    ReunioesPresentes[] allReunioesPresentes = new ReunioesPresentes[3];
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Main main = new Main();

        int opc = 0;

        do {
            opc = main.menu();

            switch (opc) {
                case 1:
                    if (main != null) {
                        System.out.println("\n1 1. Criar campus");

                        Campus c = new Campus();

                        System.out.print("\n Digite o id do campus: ");
                        c.id = Integer.parseInt(s.nextLine());

                        System.out.print("\n Digite o nome do campus: ");
                        c.nomeCampus = s.nextLine();

                        System.out.print("\n Digite a abreviacao do campus: ");
                        c.abrevCampus = s.nextLine();

                        System.out.print("\n Digite a cidade do campus: ");
                        c.cidade = s.nextLine();

                        System.out.print("\n Digite o bairro do campus: ");
                        c.bairro = s.nextLine();

                        System.out.print("\n Digite a rua do campus: ");
                        c.logradouro = s.nextLine();

                        System.out.print("\n Digite o cep do campus: ");
                        c.cep = s.nextLine();

                        if (main.create(c)) {
                            System.out.println("Campus criado com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar o campus!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro antes de adicionar um campus!");
                    }

                    break;
                    
                case 2:
                    if (main != null) {
                        System.out.println("\n1 2. Criar servidor");

                        Servidor se = new Servidor();

                        System.out.print("\n Digite o id do servidor: ");
                        se.id = Integer.parseInt(s.nextLine());

                        System.out.print("\n Digite o nome do servidor: ");
                        se.nomeServidor = s.nextLine();

                        System.out.print("\n Digite o email do servidor: ");
                        se.emailServidor = s.nextLine();

                        System.out.print("\n Digite o campus do servidor: ");
                        se.campusServidor = s.nextLine();

                        System.out.print("\n Digite o cargo do servidor: ");
                        se.cargoServidor = s.nextLine();

                        System.out.print("\n Digite o login do servidor: ");
                        se.loginServidor = s.nextLine();

                        System.out.print("\n Digite a senha do servidor: ");
                        se.senhaServidor = s.nextLine();

                        if (main.create(se)) {
                            System.out.println("Servidor criado com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar o servidor!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro.");
                    }

                    break;
                    
                case 3:
                    if (main != null) {
                        System.out.println("\n1 3. Criar curso");

                        Curso cur = new Curso();

                        System.out.print("\n Digite o id do curso: ");
                        cur.id = Integer.parseInt(s.nextLine());

                        System.out.print("\n Digite o nome do curso: ");
                        cur.nomeCurso = s.nextLine();

                        System.out.print("\n Digite o estado(Ativo/Inativo): ");
                        cur.estadoCurso = s.nextLine();

                        System.out.print("\n Digite o ano de inicio: ");
                        cur.anoInicio = s.nextLine();

                        System.out.print("\n Digite o ano de termino: ");
                        cur.anoTermino = s.nextLine();


                        if (main.create(cur)) {
                            System.out.println("Curso criado com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar o curso!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro.");
                    }
                    
                    break;
                    
                case 4:
                    if (main != null) {
                        System.out.println("\n1 4. Criar disciplina");

                        Disciplina dis = new Disciplina();

                        System.out.print("\n Digite o id da disciplina: ");
                        dis.id = Integer.parseInt(s.nextLine());

                        System.out.print("\n Digite o nome da disciplina: ");
                        dis.nomeDisciplina = s.nextLine();

                        System.out.print("\n Digite a carga horaria: ");
                        dis.cargaHoraria = s.nextLine();
                        
                        System.out.print("\n Digite a periodicidade(semestral ou anual): ");
                        dis.periodicidade = s.nextLine();
                        
                        System.out.println("\n Digite o curso: ");
                        dis.curso = s.nextLine();


                        if (main.create(dis)) {
                            System.out.println("Disciplina criada com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar a disciplina!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro.");
                    }
                    
                    break;
                    
                case 5:
                    if (main != null) {
                        System.out.println("\n1 5. Criar oferta da disciplina no curso");

                        DisciplinaNoCurso discur = new DisciplinaNoCurso();

                        System.out.print("\n Digite o id da oferta: ");
                        discur.id = Integer.parseInt(s.nextLine());
                        
                        System.out.println("\n Digite o curso: ");
                        discur.curso = s.nextLine();
                        
                        System.out.println("\n Digite a disciplina: ");
                        discur.disciplina = s.nextLine();
                        
                        System.out.println("\n Digite o professor:");
                        discur.professor = s.nextLine();
                        
                        System.out.println("\n Digite o ano: ");
                        discur.ano = s.nextLine();
                        
                        System.out.println("\n Digite o semestre: ");
                        discur.semestre = s.nextLine();
                        
                        System.out.println("\n Digite as aulas semanais: ");
                        discur.aulasSemanais = s.nextLine();
                        
                        if (main.create(discur)) {
                            System.out.println("Oferta criada com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar a oferta!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro.");
                    }
                    
                    break;
                    
                case 6:
                    if (main != null) {
                        System.out.println("\n1 6. Criar orientacoes");

                        Orientacoes ori = new Orientacoes();

                        System.out.print("\n Digite o id da orientacao: ");
                        ori.id = Integer.parseInt(s.nextLine());
                        
                        System.out.println("\n Digite o tipo de orientacao(ensino, pesquisa, extensão, estagio, tcc, mestrado, doutorado): ");
                        ori.tipoOrientacao = s.nextLine();
                        
                        System.out.println("\n Digite o nome do aluno: ");
                        ori.nomeAluno = s.nextLine();
                        
                        System.out.println("\n Digite as horas semanais: ");
                        ori.horasSemanais = s.nextLine();
                        
                        if (main.create(ori)) {
                            System.out.println("Orientacoes criada com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar a orientacao!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro.");
                    }
                    
                    break;
                    
                case 7:
                    if (main != null) {
                        System.out.println("\n1 7. Criar atividade");

                        Atividades ativ = new Atividades();

                        System.out.print("\n Digite o id da atividade: ");
                        ativ.id = Integer.parseInt(s.nextLine());
                        
                        System.out.println("\n Digite a descricao: ");
                        ativ.descricao = s.nextLine();
                        
                        System.out.println("\n Digite as horas semanais: ");
                        ativ.horasSemanais = s.nextLine();
                        
                        
                        if (main.create(ativ)) {
                            System.out.println("Atividade criada com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar a atividade!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro.");
                    }
                    
                    break;
                    
                case 8:
                    if (main != null) {
                        System.out.println("\n1 8. Criar comissao");

                        Comissoes com = new Comissoes();

                        System.out.print("\n Digite o id da atividade: ");
                        com.id = Integer.parseInt(s.nextLine());
                        
                        System.out.println("\n Digite a comissao: ");
                        com.comissao = s.nextLine();
                        
                        System.out.println("\n Digite as horas semanais");
                        com.horasSemanais = s.nextLine();
                        
                        System.out.println("\n Digite o estado(ativa/inativa): ");
                        com.estado = s.nextLine();
                        
                        
                        if (main.create(com)) {
                            System.out.println("Comissao criada com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar a comissao!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro.");
                    }
                    
                    break;
                    
                case 9:
                    if (main != null) {
                        System.out.println("\n1 9. Criar vinculo de servidores a comissoes");

                        ServidoresComissoes servcom = new ServidoresComissoes();

                        System.out.print("\n Digite o id: ");
                        servcom.id = Integer.parseInt(s.nextLine());
                        
                        System.out.println("\n Digite a comissao: ");
                        servcom.comissao = s.nextLine();
                        
                        System.out.println("\n Digite o servidor: ");
                        servcom.servidor = s.nextLine();
                        
                        System.out.println("\n Digite o papel(presidente, vice, secretario, participante, suplemente): ");
                        servcom.papel = s.nextLine();
                        
                        
                        if (main.create(servcom)) {
                            System.out.println("Vinculo criado com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar o vinculo!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro.");
                    }
                    
                    break;
                    
                case 10:
                    if (main != null) {
                        System.out.println("\n1 10. Criar ata de reunioes");

                        AtaReunioes atareun = new AtaReunioes();

                        System.out.print("\n Digite o id: ");
                        atareun.id = Integer.parseInt(s.nextLine());
                        
                        System.out.println("\n Digite a comissao: ");
                        atareun.comissao = s.nextLine();
                        
                        System.out.println("\n Digite a data da reuniao: ");
                        atareun.dataReuniao = s.nextLine();
                        
                        System.out.println("\n Digite o conteudo da ata: ");
                        atareun.conteudoAta = s.nextLine();
                        
                        System.out.println("\n Digite o servidor secretario: ");
                        atareun.servidorSecretario = s.nextLine();
                        
                        if (main.create(atareun)) {
                            System.out.println("ata de reunioes criada com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar a ata de reunioes!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro.");
                    }
                    
                    break;
                    
                case 11:
                    if (main != null) {
                        System.out.println("\n1 11. Criar ata de reunioes e presentes");

                        ReunioesPresentes reunpre = new ReunioesPresentes();

                        System.out.print("\n Digite o id: ");
                        reunpre.id = Integer.parseInt(s.nextLine());
                        
                        System.out.println("\n Digite a comissao: ");
                        reunpre.comissao = s.nextLine();
                        
                        System.out.println("\n Digite a ata de reuniao: ");
                        reunpre.ataReuniao = s.nextLine();
                        
                        System.out.println("\n Digite o servidor: ");
                        reunpre.servidor = s.nextLine();
                        
                        if (main.create(reunpre)) {
                            System.out.println("ata de reunioes criada com sucesso!");
                        } else {
                            System.out.println("Não foi possível criar a ata de reunioes!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro.");
                    }
                    
                    break;
                    
                    

                case 12:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;

            }

        } while (opc != 20);

    }

    int menu() {
        String menu = "\n\t\t\t MENU DE OPCOES";
        menu += "\n\t\t\t ===============";
        menu += "\n\n 1. Criar Campus.";
        menu += "\n 2. Criar Servidor.";
        menu += "\n 3. Criar Curso.";
        menu += "\n 4. Criar Disciplina.";
        menu += "\n 5. Criar Oferta da disciplina no curso.";
        menu += "\n 6. Criar Orientações.";
        menu += "\n 7. Criar Atividade.";
        menu += "\n 8. Criar Comissões.";
        menu += "\n 9. Criar Vinculo de servidores a comissões.";
        menu += "\n 10. Criar Ata de Reuniões.";
        menu += "\n 11. Criar Ata de Reuniões e Presentes.";
        menu += "\n 12. Sair";
        menu += "\n Escolha uma das opcoes acima: ";

        System.out.print(menu);
        int opc = Integer.parseInt(s.nextLine());

        return opc;
    }

    boolean create(Campus c) {
        for (int i = 0; i < this.allCampus.length; i++) {
            if (this.allCampus[i] == null) {
                this.allCampus[i] = c;
                return true;
            }
        }

        return false;
    }
    
    boolean create(Servidor se) {
        for (int i = 0; i < this.allServidor.length; i++) {
            if (this.allServidor[i] == null) {
                this.allServidor[i] = se;
                return true;
            }
        }

        return false;
    }
    
    boolean create(Curso cur) {
        for (int i = 0; i < this.allCurso.length; i++) {
            if (this.allCurso[i] == null) {
                this.allCurso[i] = cur;
                return true;
            }
        }

        return false;
    }
    
    boolean create(Disciplina dis) {
        for (int i = 0; i < this.allDisciplina.length; i++) {
            if (this.allDisciplina[i] == null) {
                this.allDisciplina[i] = dis;
                return true;
            }
        }

        return false;
    }
    
    boolean create(DisciplinaNoCurso discur) {
        for (int i = 0; i < this.allDisciplinaNoCurso.length; i++) {
            if (this.allDisciplinaNoCurso[i] == null) {
                this.allDisciplinaNoCurso[i] = discur;
                return true;
            }
        }

        return false;
    }
    
    boolean create(Orientacoes ori) {
        for (int i = 0; i < this.allOrientacoes.length; i++) {
            if (this.allOrientacoes[i] == null) {
                this.allOrientacoes[i] = ori;
                return true;
            }
        }

        return false;
    }
    
    boolean create(Atividades ativ) {
        for (int i = 0; i < this.allAtividades.length; i++) {
            if (this.allAtividades[i] == null) {
                this.allAtividades[i] = ativ;
                return true;
            }
        }

        return false;
    }
    
    boolean create(Comissoes com) {
        for (int i = 0; i < this.allComissoes.length; i++) {
            if (this.allComissoes[i] == null) {
                this.allComissoes[i] = com;
                return true;
            }
        }

        return false;
    }
    
    boolean create(ServidoresComissoes servcom) {
        for (int i = 0; i < this.allServidoresComissoes.length; i++) {
            if (this.allServidoresComissoes[i] == null) {
                this.allServidoresComissoes[i] = servcom;
                return true;
            }
        }

        return false;
    }
    
    boolean create(AtaReunioes atareun) {
        for (int i = 0; i < this.allAtaReunioes.length; i++) {
            if (this.allAtaReunioes[i] == null) {
                this.allAtaReunioes[i] = atareun;
                return true;
            }
        }

        return false;
    }
    
    boolean create(ReunioesPresentes reunpre) {
        for (int i = 0; i < this.allReunioesPresentes.length; i++) {
            if (this.allReunioesPresentes[i] == null) {
                this.allReunioesPresentes[i] = reunpre;
                return true;
            }
        }

        return false;
    }
    

    boolean ehVazio() {
        for (int i = 0; i < this.allCampus.length; i++) {
            if (this.allCampus[i] != null) {
                return false;
            }
        }

        return true;
    }

    String mostrarCampus() {
        String showCampus = "\n Campus cadastrados: ";
        if (!this.ehVazio()) {
            for (Campus c : allCampus) {
                if (c != null) {
                    showCampus += "\n " + c.toString();
                }
            }
        } else {
            showCampus += "\n Não há nenhum campus cadastrado!";
        }

        return showCampus;
    }

    Campus buscarCampus(String nome) {

        for (int i = 0; i < this.allCampus.length; i++) {
            if (this.allCampus[i] != null && this.allCampus[i].nomeCampus.equals(nome)) {
                return this.allCampus[i];
            }
        }

        return null;
    }

    boolean alterarCampus(Campus c, String nome) {
        for (int i = 0; i < this.allCampus.length; i++) {
            if (this.allCampus[i] != null && this.allCampus[i].nomeCampus.equals(nome)) {
                this.allCampus[i] = c;
                return true;
            }
        }

        return false;
    }

    boolean desativarCampus(String nomeCampus) {
        for (int i = 0; i < this.allCampus.length; i++) {
            if (this.allCampus[i] != null && this.allCampus[i].nomeCampus.equals(nomeCampus)) {
                this.allCampus[i] = null;
                return true;
            }
        }

        return false;
    }
}

/*
menu += "\n 2. Ver todos os campus cadastrados";
        menu += "\n 3. Alterar dados do campus";
        menu += "\n 4. Desativar campus";
        menu += "\n 5. Sair";
        menu += "\n Escolha uma das opcoes acima: ";

case 2:
                    if (main != null) {
                        System.out.println("\n 2. Ver todos os campus cadastrados");

                        System.out.println(main.mostrarCampus());;

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro antes de adicionar um campus!");
                    }

                    break;
                case 3:
                    if (main != null) {
                        System.out.println("\n 3. Alterar dados do campus");

                        System.out.println("\n Digite o nome do campus que deseja alterar: ");
                        String nome = s.nextLine();

                        Campus cEncont = main.buscarCampus(nome);

                        if (cEncont != null) {
                            Campus cAlt = new Campus();

                            System.out.print("\n Digite o novo id do campus: ");
                            cAlt.id = Integer.parseInt(s.nextLine());

                            System.out.print("\n Digite o novo nome do campus: ");
                            cAlt.nomeCampus = s.nextLine();

                            System.out.print("\n Digite a nova abreviacao do campus: ");
                            cAlt.abrevCampus = s.nextLine();

                            cAlt.dataModificacao = LocalDateTime.now();

                            cAlt.cidade = cEncont.cidade;
                            cAlt.bairro = cEncont.bairro;
                            cAlt.logradouro = cEncont.logradouro;
                            cAlt.dataCriacaoCampus = cEncont.dataCriacaoCampus;
                            cAlt.dataCriacao = cEncont.dataCriacao;

                            if (main.alterarCampus(cAlt, nome)) {
                                System.out.println("Dados do campus alterados com sucesso!");
                            } else {
                                System.out.println("Não foi possível alterar os dados do campus!");
                            }

                        } else {
                            System.out.println("\n Campus não encontrado!");
                        }

                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro antes de adicionar um campus!");
                    }

                    break;
                case 4:
                    if (main != null) {
                        System.out.println("\n 4. Desativar campus");

                        System.out.println("Digite o nome do campus que deseja desativar: ");
                        String nomeCampuDes = s.nextLine();

                        if (main.desativarCampus(nomeCampuDes)) {
                            System.out.println("Campus desativado!");
                        } else {
                            System.out.println("Não foi possível desativar o campus!");
                        }
                    } else {
                        System.out.println("\n Crie a classe pricipal primeiro antes de adicionar um campus!");
                    }

                    break;
 */
