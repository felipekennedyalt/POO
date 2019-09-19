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
public class Motor extends Carro {

    private String modelo;

    public void ligou() {
        System.out.println("O motor ligou...");
    }

    public void rodar(String modelo) {
        this.setModelo(modelo);
        System.out.println("O motor do modelo " + modelo + " ligou...");
    }

    public void rodar(String cor, String modelo) {
        this.cor = cor;
        this.setModelo(modelo);
        System.out.println("O motor da cor" + cor + " do modelo " + modelo + " ligou...");
    }

    
    public double calcularIPVA(double valor){
       double calculo;
       calculo = valor * 0.04;
       
        return calculo;
    }
    
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
