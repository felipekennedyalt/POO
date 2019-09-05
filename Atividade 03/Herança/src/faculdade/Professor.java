/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

/**
 *
 * @author felip
 */
public class Professor extends Pessoa{
    
    private String salario;
    private String horario;
    private String supervisor;

    /**
     * @return the salario
     */
    String getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    void setSalario(String salario) {
        this.salario = salario;
    }

    /**
     * @return the horario
     */
    String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the supervisor
     */
    String getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    
}
