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
public class Aluno extends Pessoa{
    
    private String dependente;
    private String matricula;
    private String mensalidade;

    /**
     * @return the dependente
     */
    String getDependente() {
        return dependente;
    }

    /**
     * @param dependente the dependente to set
     */
    void setDependente(String dependente) {
        this.dependente = dependente;
    }

    /**
     * @return the matricula
     */
    String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the mensalidade
     */
    String getMensalidade() {
        return mensalidade;
    }

    /**
     * @param mensalidade the mensalidade to set
     */
    void setMensalidade(String mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    
}
