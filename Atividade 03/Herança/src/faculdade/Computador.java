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
public class Computador extends Equipamento{
    
    private String fabricante;
    private String preco;
    private String garantia;

    /**
     * @return the fabricante
     */
    String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the preco
     */
    String getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    void setPreco(String preco) {
        this.preco = preco;
    }

    /**
     * @return the garantia
     */
    String getGarantia() {
        return garantia;
    }

    /**
     * @param garantia the garantia to set
     */
    void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    
    
}
