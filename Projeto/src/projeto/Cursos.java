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
public class Cursos extends Eventos {

    private Usuarios Ministrante;

    public Cursos(Usuarios Ministrante, Date Data, Date Hora, int CargaHoraria, int Partes, int QuantidadeVagas, float TaxaInscricao) {
        super(Data, Hora, CargaHoraria, Partes, QuantidadeVagas, TaxaInscricao);
        this.Ministrante = Ministrante;
    }

    public Usuarios getMinistrante() {
        return Ministrante;
    }

    public void setMinistrante(Usuarios Ministrante) {
        this.Ministrante = Ministrante;
    }

}
