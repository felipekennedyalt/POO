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
public class Predio {
     String endereco;
     String horaDeAbrir;
     String horaDeFechar;
     String propietario;

    /**
     * @return the endereco
     */
     String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the horaDeAbrir
     */
    String getHoraDeAbrir() {
        return horaDeAbrir;
    }

    /**
     * @param horaDeAbrir the horaDeAbrir to set
     */
    void setHoraDeAbrir(String horaDeAbrir) {
        this.horaDeAbrir = horaDeAbrir;
    }

    /**
     * @return the horaDeFechar
     */
    String getHoraDeFechar() {
        return horaDeFechar;
    }

    /**
     * @param horaDeFechar the horaDeFechar to set
     */
    void setHoraDeFechar(String horaDeFechar) {
        this.horaDeFechar = horaDeFechar;
    }

    /**
     * @return the propietario
     */
    String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}
