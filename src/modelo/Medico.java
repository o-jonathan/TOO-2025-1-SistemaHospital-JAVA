/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public class Medico extends Funcionario {
    private String especializacao;
    private String crm;
    
    public Medico() {
        super.cargo = "Medico";
    }

    public String getEspecializacao() {
        return especializacao;
    }
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public void calculaSalario() {
        super.salario = 3000;
    }

    @Override
    public String mostrarDados() {
        String aux = super.mostrarDados();
        if (crm != null)
            aux += "\nCRM: " + this.crm;
        if (especializacao != null)
            aux += "\nEspecializacao: " + this.especializacao;
        return aux;
    }
}
