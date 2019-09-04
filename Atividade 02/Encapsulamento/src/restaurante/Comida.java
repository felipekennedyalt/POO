/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author felip
 */
public class Comida {
    
    private String nome;
    private String valor;
    private String cozinheiro;
    private String ingredientes;

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
     * @return the valor
     */
    String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the cozinheiro
     */
    String getCozinheiro() {
        return cozinheiro;
    }

    /**
     * @param cozinheiro the cozinheiro to set
     */
    void setCozinheiro(String cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    /**
     * @return the ingredientes
     */
    String getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
}
