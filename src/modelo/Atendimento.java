/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class Atendimento implements Exibivel {
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Paciente paciente;
    private Sala local;
    private boolean internacao;
    private List<Enfermeiro> enfermeiros = new ArrayList<>();
    private Medico responsavel;
    private DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy '-' HH:mm");
    
    /**
     * 
     * @param internacao 0 = cosulta, 1 = internação
     */
    public Atendimento(boolean internacao) {
        dataInicio = LocalDateTime.now();
        this.internacao = internacao;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Sala getLocal() {
        return local;
    }
    public void setLocal(Sala local) {
        if (local instanceof Leito && internacao) {
            Leito leito = (Leito) local;
            leito.setOcupado(true);
            this.local = local;
        }
        else if (local instanceof Consultorio && internacao) {
            this.local = local;
        }
        else
        {
            System.out.println("Local incompativel com o tipo de atendimento!");
        }
    }

    public List<Enfermeiro> getEnfermeiros() {
        return enfermeiros;
    }
    public void addEnfermeiros(Enfermeiro enfermeiro) {
        this.enfermeiros.add(enfermeiro);
    }

    public Medico getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Medico responsavel) {
        this.responsavel = responsavel;
    }
    
    public void darAlta() {
        if (local instanceof Leito) {
            Leito leito = (Leito) local;
            leito.setOcupado(false);
            dataFim = LocalDateTime.now();
        }
    }

    @Override
    public String mostrarDados() {
        String aux = "Dados do Atendimento:";
        if (dataInicio != null)
            aux += "\nData de Inicio: " + dataInicio.format(formatoData);
        if (dataFim != null)
            aux += "\nData de Termino: " + dataFim.format(formatoData);
        if (paciente != null)
            aux += "\nPaciente: " + paciente;
        if (local != null)
            aux += "\nLocal: " + local;
        aux += "\nTipo: " + (internacao ? "internacao" : "consulta");
        if (responsavel != null)
            aux += "\nMedico Responsavel: " + responsavel;
        if (enfermeiros != null)
            aux += "\nEnfermeiros: " + enfermeiros;
        return aux;
    }

    @Override
    public String toString() {
        String aux = "(" + (internacao ? "internacao" : "consulta") + ") " + dataInicio.format(formatoData);
        if (dataFim != null)
            aux += " a " + dataFim.format(formatoData);
        aux += " | " + responsavel;
        return aux;
    }

    public boolean isInternacao() {
        return internacao;
    }
}
