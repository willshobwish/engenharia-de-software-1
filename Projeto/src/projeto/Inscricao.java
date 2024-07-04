/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import java.util.ArrayList;

/**
 *
 * @author Willian Murayama
 */
public class Inscricao {

    private boolean[] Presenca;
    private boolean PagamentoTaxa;
    private Eventos[] EventoInscrito;

    private void InscricoesUsuario() {
        System.out.println("Inscricoes Usuario");
    }

    private void RegistroInscricao() {
        System.out.println("Registro Inscricao");
    }

    private void BuscarTodasGrandesEventos() {
        System.out.println("Buscar Todas Grandes Eventos");
    }

    private void CancelarIsncricaoGrandeEvento() {
        System.out.println("Cancelar Isncricao Grande Evento");
    }

    private void InscricoesEventos() {
        System.out.println("Inscricoes Eventos");
    }

    private void CancelarInscricaoEvento() {
        System.out.println("Cancelar Inscricao Evento");
    }

    private void SelecaoPresencaEventoUsuarios() {
        System.out.println("Selecao Presenca Evento Usuarios");
    }

    private void RegistrarPresencasUsuarios() {
        System.out.println("Registrar Presencas Usuarios");
    }

    private void RegistrarPresencaInscricao() {
        System.out.println("Registrar Presenca Inscricao");
    }

    private void CertificadoEventoDisponivel() {
        System.out.println("Certificado Evento Disponivel");
    }

    private void ChecagemPresenca() {
        System.out.println("Checagem Presenca");
    }

    public Inscricao(boolean[] Presenca, boolean PagamentoTaxa, Eventos[] EventoInscrito) {
        this.Presenca = Presenca;
        this.PagamentoTaxa = PagamentoTaxa;
        this.EventoInscrito = EventoInscrito;
    }

    public boolean[] getPresenca() {
        return Presenca;
    }

    public void setPresenca(boolean[] Presenca) {
        this.Presenca = Presenca;
    }

    public boolean isPagamentoTaxa() {
        return PagamentoTaxa;
    }

    public void setPagamentoTaxa(boolean PagamentoTaxa) {
        this.PagamentoTaxa = PagamentoTaxa;
    }

    public Eventos[] getEventoInscrito() {
        return EventoInscrito;
    }

    public void setEventoInscrito(Eventos[] EventoInscrito) {
        this.EventoInscrito = EventoInscrito;
    }

    @Override
    public String toString() {
        return "Inscricao{" + "Presenca=" + Presenca + ", PagamentoTaxa=" + PagamentoTaxa + ", EventoInscrito=" + EventoInscrito + '}';
    }

}
