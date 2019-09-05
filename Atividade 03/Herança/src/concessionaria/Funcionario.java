/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 *
 * @author felip
 */
public class Funcionario extends Pessoa{

    private String salario;

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

}
