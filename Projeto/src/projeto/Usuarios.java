/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author Willian Murayama
 */
public class Usuarios {

    private String email;
    private String nome;
    private String vinculoUniversidade;
    private boolean usuario;
    private boolean ministrante;
    private boolean palestrante;
    private boolean moderador;

    public Usuarios(String email, String nome, String vinculoUniversidade, boolean usuario, boolean ministrante, boolean palestrante, boolean moderador) {
        this.email = email;
        this.nome = nome;
        this.vinculoUniversidade = vinculoUniversidade;
        this.usuario = usuario;
        this.ministrante = ministrante;
        this.palestrante = palestrante;
        this.moderador = moderador;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVinculoUniversidade() {
        return vinculoUniversidade;
    }

    public void setVinculoUniversidade(String vinculoUniversidade) {
        this.vinculoUniversidade = vinculoUniversidade;
    }

    public boolean isUsuario() {
        return usuario;
    }

    public void setUsuario(boolean usuario) {
        this.usuario = usuario;
    }

    public boolean isMinistrante() {
        return ministrante;
    }

    public void setMinistrante(boolean ministrante) {
        this.ministrante = ministrante;
    }

    public boolean isPalestrante() {
        return palestrante;
    }

    public void setPalestrante(boolean palestrante) {
        this.palestrante = palestrante;
    }

    public boolean isModerador() {
        return moderador;
    }

    public void setModerador(boolean moderador) {
        this.moderador = moderador;
    }

}
