/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public class Enfermeiro extends Funcionario {
    private String coren;
    private String turno;
    
    public Enfermeiro() {
        super.cargo = "Enfermeiro";
    }

    public String getCoren() {
        return coren;
    }
    public void setCoren(String coren) {
        this.coren = coren;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void calculaSalario() {
        super.salario = 1500;
    }

    @Override
    public String mostrarDados() {
        String aux = super.mostrarDados();
        if (coren != null)
            aux += "\nCOREN: " + this.coren;
        if (turno != null)
            aux += "\nTurno: " + this.turno;
        return aux;
    }
}
