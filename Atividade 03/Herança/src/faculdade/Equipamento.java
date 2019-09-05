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
public class Equipamento {
    
    private String marca;
    private String funcao;
    private String peso;

 

    /**
     * @return the funcao
     */
    String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the peso
     */
    String getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return the marca
     */
    String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    void setMarca(String marca) {
        this.marca = marca;
    }
    
}
