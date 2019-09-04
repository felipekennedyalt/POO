/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publico;

import protegido.*;

/**
 *
 * @author felip
 */
public class Pessoa {

    public String nome;
    public int idade;
    public String cpf;
    public String religiao;
    public boolean trabalha;

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
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the religiao
     */
    public String getReligiao() {
        return religiao;
    }

    /**
     * @param religiao the religiao to set
     */
    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    /**
     * @return the trabalha
     */
    public boolean isTrabalha() {
        return trabalha;
    }

    /**
     * @param trabalha the trabalha to set
     */
    public void setTrabalha(boolean trabalha) {
        this.trabalha = trabalha;
    }

}
