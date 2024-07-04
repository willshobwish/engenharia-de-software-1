/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto;

import java.util.ArrayList;

/**
 *
 * @author Willian Murayama
 */
public class Sistema {

    private ArrayList<Usuarios> Usuarios;
    private ArrayList<Eventos> Eventos;
    private ArrayList<GrandesEventos> GrandesEventos;
    private static Sistema Sistema;

    public static void main(String[] args) {
    }

    private void CadastroCurso() {
        System.out.println("Cadastro de curso");
    }

    private void AcessoInscricoesGrandesEventos() {
        System.out.println("Acesso Inscricoes Grandes Eventos");

    }

    private void AcessoTodosCursos() {
        System.out.println("Acesso Todos Cursos");

    }

    private void AcessoTodasPalestras() {
        System.out.println("Acesso Todas Palestras");

    }

    private void CadastroGrandeEvento() {
        System.out.println("Cadastro Grande Evento");

    }

    private void CadastroPalestra() {
        System.out.println("Cadastro Palestra");

    }

    private void AcessoCertificadoEventos() {
        System.out.println("Acesso Certificado Eventos");

    }

    private void SelecaoEventoCertificadoMinistrante() {
        System.out.println("Selecao Evento Certificado Ministrante");

    }

    private void APIAutenticacaoEmail() {
        System.out.println("API Autenticacao Email");

    }

    private void AcessoSistema() {
        System.out.println("Acesso Sistema");

    }

    private void AcessoCursosDisponiveis() {
        System.out.println("Acesso Cursos Disponiveis");

    }

    private void CadastroUsuarioSistema() {
        System.out.println("Cadastro Usuario Sistema");

    }

    private void SelecaoInscricaoEvento() {
        System.out.println("Selecao Inscricao Evento");

    }

    private void AcessoTodosGrandesEventos() {
        System.out.println("Acesso Todos Grandes Eventos");

    }

    private void CancelarInscricaoGrandeEvento() {
        System.out.println("Cancelar Inscricao Grande Evento");

    }

    private void AcessoInscricaoEventos() {
        System.out.println("Acesso Inscricao Eventos");

    }

    private void CancelamentoInscricaoEvento() {
        System.out.println("Cancelamento de Inscricao Evento");

    }

    private void SelecaoPresencaEvento() {
        System.out.println("Selecao de Presenca de Evento");

    }

    private void RegistrarPresencaUsuario() {
        System.out.println("Registrar Presenca de Usuario");

    }

    private Sistema() {

    }

    public static Sistema getInstance() {
        if (Sistema == null) {
            Sistema = new Sistema();
        }
        return Sistema;
    }

    public ArrayList<Usuarios> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> Usuarios) {
        this.Usuarios = Usuarios;
    }

    public ArrayList<Eventos> getEventos() {
        return Eventos;
    }

    public void setEventos(ArrayList<Eventos> Eventos) {
        this.Eventos = Eventos;
    }

    public ArrayList<GrandesEventos> getGrandesEventos() {
        return GrandesEventos;
    }

    public void setGrandesEventos(ArrayList<GrandesEventos> GrandesEventos) {
        this.GrandesEventos = GrandesEventos;
    }

    @Override
    public String toString() {
        return "Sistema{" + "Usuarios=" + Usuarios + ", Eventos=" + Eventos + ", GrandesEventos=" + GrandesEventos + '}';
    }

}
