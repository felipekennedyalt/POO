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
public class Pessoa {

    private String cpf;
    private String nome;
    private int idade;

    /**
     * @return the cpf
     */
    String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    void setIdade(int idade) {
        this.idade = idade;
    }

}
