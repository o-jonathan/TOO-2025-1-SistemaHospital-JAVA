/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public class Leito extends Sala {
    private boolean ocupado = false;

    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String mostrarDados() {
        String aux = super.mostrarDados();
        aux += "\nStatus: " + (ocupado ? "Ocupado" : "Livre");
        return aux;
    }
}
