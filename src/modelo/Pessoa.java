/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jonathan
 */
public abstract class Pessoa implements Exibivel {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String mostrarDados() {
        String aux = "Dados da Pessoa:";
        if (nome != null)
            aux += "\nNome: " + this.nome;
        if (cpf != null)
            aux += "\nCPF: " + this.cpf;
        return aux;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
