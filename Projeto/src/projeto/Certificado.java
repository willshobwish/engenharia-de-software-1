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
public class Certificado {

    private Date Data;
    private Date Hora;
    private String Diretorio;

    private void EmitirCertificado() {
        System.out.println("Emitir certificado");
    }

    public Certificado(Date Data, Date Hora, String Diretorio) {
        this.Data = Data;
        this.Hora = Hora;
        this.Diretorio = Diretorio;
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

    public String getDiretorio() {
        return Diretorio;
    }

    public void setDiretorio(String Diretorio) {
        this.Diretorio = Diretorio;
    }

    @Override
    public String toString() {
        return "Certificado{" + "Data=" + Data + ", Hora=" + Hora + ", Diretorio=" + Diretorio + '}';
    }

}
