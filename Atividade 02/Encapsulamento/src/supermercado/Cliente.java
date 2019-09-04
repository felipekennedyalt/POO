/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author felip
 */
public class Cliente {
     String nome;
     int idade;
     String cpf;
     String religiao;

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
     * @return the religiao
     */
    String getReligiao() {
        return religiao;
    }

    /**
     * @param religiao the religiao to set
     */
    void setReligiao(String religiao) {
        this.religiao = religiao;
    }
     
     
}
