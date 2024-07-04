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
public class GrandesEventos {

    private ArrayList<Eventos> Eventos;
    private float TaxaInscricao;

    private void RegistroGrandeEvento() {
        System.out.println("Registro Grande Evento");
    }

    private void ListagemGrandesEventos() {
        System.out.println("Listagem Grandes Eventos");
    }

    public GrandesEventos(ArrayList<Eventos> Eventos, float TaxaInscricao) {
        this.Eventos = Eventos;
        this.TaxaInscricao = TaxaInscricao;
    }

    public ArrayList<Eventos> getEventos() {
        return Eventos;
    }

    public void setEventos(ArrayList<Eventos> Eventos) {
        this.Eventos = Eventos;
    }

    public float getTaxaInscricao() {
        return TaxaInscricao;
    }

    public void setTaxaInscricao(float TaxaInscricao) {
        this.TaxaInscricao = TaxaInscricao;
    }

    @Override
    public String toString() {
        return "GrandesEventos{" + "Eventos=" + Eventos + ", TaxaInscricao=" + TaxaInscricao + '}';
    }

}
