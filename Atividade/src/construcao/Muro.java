/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construcao;

/**
 *
 * @author LABORATORIO 01
 */
public class Muro extends Construcao {

    @Override
    public boolean construir(boolean respostaCon) {
        if (respostaCon == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean renovar(boolean respostaRen) {
        if (respostaRen == true) {
            return true;
        } else {
            return false;
        }
    }

}
