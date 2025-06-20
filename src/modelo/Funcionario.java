/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.DecimalFormat;

/**
 *
 * @author Jonathan
 */
public abstract class Funcionario extends Pessoa {
    private String matricula;
    protected double salario;
    protected String cargo;
    private DecimalFormat formatoMoeda = new DecimalFormat("#,##0.00");

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }
    
    public abstract void calculaSalario();

    @Override
    public String mostrarDados() {
        String aux = super.mostrarDados();
        if (matricula != null)
            aux += "\nMatricula: " + this.matricula;
        if (salario != 0)
            aux += "\nSalario: R$" + formatoMoeda.format(this.salario);
        if (cargo != null)
            aux += "\nCargo: " + this.cargo;
        return aux;
    }
}
