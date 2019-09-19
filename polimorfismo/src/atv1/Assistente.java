/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv1;

import atv5.*;

/**
 *
 * @author felip
 */
public class Assistente extends Funcionario {

    private String chefeDireto;

    public void descontoINSS() {
        this.inss = inss;
        double desconto = inss / 24;
        System.out.println("Seu desconto é: " + desconto);
    }

    public void descontoINSS(double inss) {
        this.inss = inss;
        double desconto = inss / 24;
        System.out.println("Seu desconto é: " + desconto);
    }

    /**
     * @return the chefeDireto
     */
    public String getChefeDireto() {
        return chefeDireto;
    }

    /**
     * @param chefeDireto the chefeDireto to set
     */
    public void setChefeDireto(String chefeDireto) {
        this.chefeDireto = chefeDireto;
    }

}
