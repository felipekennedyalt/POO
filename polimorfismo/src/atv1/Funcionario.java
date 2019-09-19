/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv1;

/**
 *
 * @author felip
 */
public class Funcionario {

    private String nome;
    double inss;

    public void descontoINSS() {

        double desconto = inss / 24;
        System.out.println("Seu desconto é: " + desconto);
    }

    public void descontoINSS(double inss) {

        double desconto = inss / 24;
        System.out.println("Seu desconto é: " + desconto);
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
