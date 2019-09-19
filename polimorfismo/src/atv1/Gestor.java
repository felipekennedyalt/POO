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
public class Gestor extends Funcionario {

    private String qtdselecionados;

    public void descontoINSS() {
        this.inss = inss;
        double desconto = inss / 24;
        System.out.println("Seu desconto é: " + desconto);
    }

    public void descontoINSS(double inss) {
        this.inss = inss;
        double desconto = inss / 20;
        System.out.println("Seu desconto é: " + desconto);
    }

    /**
     * @return the qtdselecionados
     */
    public String getQtdselecionados() {
        return qtdselecionados;
    }

    /**
     * @param qtdselecionados the qtdselecionados to set
     */
    public void setQtdselecionados(String qtdselecionados) {
        this.qtdselecionados = qtdselecionados;
    }

}
