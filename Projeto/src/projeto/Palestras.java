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
public class Palestras extends Eventos {

    private Usuarios Palestrante;

    public Palestras(Usuarios Palestrante, Date Data, Date Hora, int CargaHoraria, int Partes, int QuantidadeVagas, float TaxaInscricao) {
        super(Data, Hora, CargaHoraria, Partes, QuantidadeVagas, TaxaInscricao);
        this.Palestrante = Palestrante;
    }

    public Usuarios getPalestrante() {
        return Palestrante;
    }

    public void setPalestrante(Usuarios Palestrante) {
        this.Palestrante = Palestrante;
    }

}
