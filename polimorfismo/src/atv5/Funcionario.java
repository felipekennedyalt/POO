/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv5;

/**
 *
 * @author felip
 */
public class Funcionario {

    private String nome;
    private double inss;

    public void descontoINSS(double inss) {

        this.inss = inss;

        double desconto = inss/10;

    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}
