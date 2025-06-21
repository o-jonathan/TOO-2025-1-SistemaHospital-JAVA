/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import modelo.Atendimento;
import modelo.Consultorio;
import modelo.Enfermeiro;
import modelo.Leito;
import modelo.Medico;
import modelo.Paciente;

/**
 *
 * @author Jonathan
 */
public class Teste {
    public static void main(String[] args) {
        Medico m = new Medico();
        m.setNome("Jorge");
        m.setCpf("123.456.789-10");
        m.setMatricula("20251.0001");
        m.calculaSalario();
        m.setCrm("0001");
        m.setEspecializacao("cardiologia");
        
        Enfermeiro e = new Enfermeiro();
        e.setNome("Maria");
        e.setCpf("123.456.789-10");
        e.setMatricula("20251.0002");
        e.calculaSalario();
        e.setCoren("0001");
        e.setTurno("manha");
        
        Paciente p = new Paciente();
        p.setNome("Manuel");
        p.setCpf("123.456.789-10");
        p.setGenero("Masculino");
        p.setDataNascimento("27/03/2006");
        
        Leito l = new Leito();
        l.setLocal("105");
        l.setDescricao("UTI");
        
        Consultorio c = new Consultorio();
        c.setLocal("213");
        c.setDescricao("Consultorio");
        
        Atendimento aI = new Atendimento(true);
        aI.setLocal(l);
        aI.setPaciente(p);
        aI.setResponsavel(m);
        aI.addEnfermeiros(e);
        aI.darAlta();
        
        Atendimento aC = new Atendimento(false);
        aC.setLocal(c);
        aC.setPaciente(p);
        aC.setResponsavel(m);
        aC.addEnfermeiros(e);
        aC.darAlta();
        
        p.addProntuario(aI);
        p.addProntuario(aC);
        
        System.out.println(m.mostrarDados());
        System.out.println("");
        System.out.println(e.mostrarDados());
        System.out.println("");
        System.out.println(p.mostrarDados());
        System.out.println("");
        System.out.println(l.mostrarDados());
        System.out.println("");
        System.out.println(c.mostrarDados());
        System.out.println("");
        System.out.println(aI.mostrarDados());
        System.out.println("");
        System.out.println(aC.mostrarDados());
    }
}
