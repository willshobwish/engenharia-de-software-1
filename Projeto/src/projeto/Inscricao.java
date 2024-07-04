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
        System.out.println("InscricoesUsuario");
    }

    private void RegistroInscricao() {
        System.out.println("RegistroInscricao");
    }

    private void BuscarTodasGrandesEventos() {
        System.out.println("BuscarTodasGrandesEventos");
    }

    private void CancelarIsncricaoGrandeEvento() {
        System.out.println("CancelarIsncricaoGrandeEvento");
    }

    private void InscricoesEventos() {
        System.out.println("InscricoesEventos");
    }

    private void CancelarInscricaoEvento() {
        System.out.println("CancelarInscricaoEvento");
    }

    private void SelecaoPresencaEventoUsuarios() {
        System.out.println("SelecaoPresencaEventoUsuarios");
    }

    private void RegistrarPresencasUsuarios() {
        System.out.println("RegistrarPresencasUsuarios");
    }

    private void RegistrarPresencaInscricao() {
        System.out.println("RegistrarPresencaInscricao");
    }

    private void CertificadoEventoDisponivel() {
        System.out.println("CertificadoEventoDisponivel");
    }

    private void ChecagemPresenca() {
        System.out.println("ChecagemPresenca");
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
