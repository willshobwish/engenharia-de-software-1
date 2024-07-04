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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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

}
