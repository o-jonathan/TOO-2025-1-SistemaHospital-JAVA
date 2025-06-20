/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public abstract class Sala implements Exibivel {
    private String local;
    private String descricao;

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return local;
    }

    @Override
    public String mostrarDados() {
        String aux = "Dados da Sala:";
        if (local != null)
            aux += "\nLocal: " + this.local;
        if (descricao != null)
            aux += "\nDescricao: " + this.descricao;
        return aux;
    }
}
