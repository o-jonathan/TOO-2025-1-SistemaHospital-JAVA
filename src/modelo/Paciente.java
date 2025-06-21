/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class Paciente extends Pessoa {
    private String genero;
    private LocalDate dataNascimento;
    private List<Atendimento> prontuario = new ArrayList<>();
    private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public List<Atendimento> getProntuario() {
        return prontuario;
    }
    public void addProntuario(Atendimento atendimento)
    {
        prontuario.add(atendimento);
    }
    
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setDataNascimento(String data) {
        this.dataNascimento = LocalDate.parse(data, formatoData);
    }

    @Override
    public String mostrarDados() {
        String aux = super.mostrarDados();
        if (genero != null)
            aux += "\nGenero: " + this.genero;
        if (dataNascimento != null)
            aux += "\nNascimento: " + dataNascimento.format(formatoData);
        if (prontuario != null)
            aux += "\nProntuario: " + prontuario;
        return aux;
    }
}
