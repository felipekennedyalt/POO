/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author LABORATORIO 01
 */
public abstract class Funcionario {
    
    private String nome;
    private String salario;
    
    public abstract boolean trabalhar(boolean resposta);
    
    public abstract String sairDoTrabalho(String periodo);

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public String getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(String salario) {
        this.salario = salario;
    }

}
