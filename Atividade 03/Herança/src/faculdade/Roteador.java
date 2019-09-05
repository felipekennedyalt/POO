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
public class Roteador extends Equipamento{
    
    private String alcance;
    private String modelo;
    private String frequencia;

    /**
     * @return the alcance
     */
    String getAlcance() {
        return alcance;
    }

    /**
     * @param alcance the alcance to set
     */
    void setAlcance(String alcance) {
        this.alcance = alcance;
    }

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
     * @return the frequencia
     */
    String getFrequencia() {
        return frequencia;
    }

    /**
     * @param frequencia the frequencia to set
     */
    void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
    
}
