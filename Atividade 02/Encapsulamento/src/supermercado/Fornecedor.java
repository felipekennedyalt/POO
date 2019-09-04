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
public class Fornecedor {
    
    String nome;
    String cnpj;
    String fundacao;
    int numeroDeSupermercadosFornecendo;

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
     * @return the cnpj
     */
    String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the fundacao
     */
    String getFundacao() {
        return fundacao;
    }

    /**
     * @param fundacao the fundacao to set
     */
    void setFundacao(String fundacao) {
        this.fundacao = fundacao;
    }

    /**
     * @return the numeroDeSupermercadosFornecendo
     */
    int getNumeroDeSupermercadosFornecendo() {
        return numeroDeSupermercadosFornecendo;
    }

    /**
     * @param numeroDeSupermercadosFornecendo the numeroDeSupermercadosFornecendo to set
     */
    void setNumeroDeSupermercadosFornecendo(int numeroDeSupermercadosFornecendo) {
        this.numeroDeSupermercadosFornecendo = numeroDeSupermercadosFornecendo;
    }
    
}
