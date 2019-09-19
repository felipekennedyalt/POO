/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv4e6;

/**
 *
 * @author felip
 */
public class Pneu extends Carro {

    private String fabricante;

    public void rodar() {
        System.out.println("O pneu roda...");
    }

    public void rodar(String fabricante) {
        this.setFabricante(fabricante);
        System.out.println("O pneu fabricado por" + fabricante + " roda...");
    }

    public void rodar(String cor, String fabricante) {
        this.cor = cor;
        this.setFabricante(fabricante);
        System.out.println("O pneu " + cor + " fabricado por " + fabricante + " roda...");
    }

    public double calcularIPVA(double valor) {
        double calculo;
        calculo = 20 * valor;

        return calculo;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

}
