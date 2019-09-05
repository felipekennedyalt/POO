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
public class Cliente extends Pessoa{

    private String limiteDeCompra;

    /**
     * @return the limiteDeCompra
     */
    String getLimiteDeCompra() {
        return limiteDeCompra;
    }

    /**
     * @param limiteDeCompra the limiteDeCompra to set
     */
    void setLimiteDeCompra(String limiteDeCompra) {
        this.limiteDeCompra = limiteDeCompra;
    }

}
