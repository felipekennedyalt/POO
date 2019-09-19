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
public class Supervisor extends Funcionario {

    private String fundos;

    public void descontoINSS() {
        this.inss = inss;
        double desconto = inss / 24;
        System.out.println("Seu desconto é: " + desconto);
    }

    public void descontoINSS(double inss) {
        this.inss = inss;
        double desconto = inss / 15;
        System.out.println("Seu desconto é: " + desconto);
    }

    /**
     * @return the fundos
     */
    public String getFundos() {
        return fundos;
    }

    /**
     * @param fundos the fundos to set
     */
    public void setFundos(String fundos) {
        this.fundos = fundos;
    }

}
