/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

import java.util.Date;

/**
 *
 * @author Willian Murayama
 */
public class Eventos {

    private Date Data;
    private Date Hora;
    private int CargaHoraria;
    private int Partes;
    private int QuantidadeVagas;
    private float TaxaInscricao;

    private void CursosDisponiveis() {
        System.out.println("CursosDisponiveis");
    }

    private void VerificacaoConflitoHorario() {
        System.out.println("VerificacaoConflitoHorario");

    }

    private void RegistrarCurso() {
        System.out.println("RegistrarCurso");

    }

    private void AcessoEventos() {
        System.out.println("AcessoEventos");

    }

    private void ListagemTodosCursosValidos() {
        System.out.println("ListagemTodosCursosValidos");

    }

    private void ListagemTodasPalestrasValidas() {
        System.out.println("ListagemTodasPalestrasValidas");

    }

    private void EventosParticipados() {
        System.out.println("EventosParticipados");

    }

    private void EventosMinistrados() {
        System.out.println("EventosMinistrados");

    }

    private void ReduzirQuantidadeVagas() {
        System.out.println("ReduzirQuantidadeVagas");

    }

    private void RegistroPalestra() {
        System.out.println("RegistroPalestra");

    }

    private void IncrementarQuantidadeVagas() {
        System.out.println("IncrementarQuantidadeVagas");

    }

    public Eventos(Date Data, Date Hora, int CargaHoraria, int Partes, int QuantidadeVagas, float TaxaInscricao) {
        this.Data = Data;
        this.Hora = Hora;
        this.CargaHoraria = CargaHoraria;
        this.Partes = Partes;
        this.QuantidadeVagas = QuantidadeVagas;
        this.TaxaInscricao = TaxaInscricao;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public Date getHora() {
        return Hora;
    }

    public void setHora(Date Hora) {
        this.Hora = Hora;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public int getPartes() {
        return Partes;
    }

    public void setPartes(int Partes) {
        this.Partes = Partes;
    }

    public int getQuantidadeVagas() {
        return QuantidadeVagas;
    }

    public void setQuantidadeVagas(int QuantidadeVagas) {
        this.QuantidadeVagas = QuantidadeVagas;
    }

    public float getTaxaInscricao() {
        return TaxaInscricao;
    }

    public void setTaxaInscricao(float TaxaInscricao) {
        this.TaxaInscricao = TaxaInscricao;
    }

    @Override
    public String toString() {
        return "Eventos{" + "Data=" + Data + ", Hora=" + Hora + ", CargaHoraria=" + CargaHoraria + ", Partes=" + Partes + ", QuantidadeVagas=" + QuantidadeVagas + ", TaxaInscricao=" + TaxaInscricao + '}';
    }

}
