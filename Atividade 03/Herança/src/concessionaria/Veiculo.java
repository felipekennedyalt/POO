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
public class Veiculo {

    private String modelo;
    private String cor;
    private String proprietario;
    private String fabricante;

    /**
     * @return the modelo
     */
    String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the proprietario
     */
    String getProprietario() {
        return proprietario;
    }

    /**
     * @param proprietario the proprietario to set
     */
    void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

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

}
