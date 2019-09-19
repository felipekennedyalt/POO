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
public class Carro {

    String cor;

    
    public void calcularIPVA(){
       double calculo;
       calculo = 20 * 0.04;
       
        System.out.println("Esse é o IPVA do carro: " + calculo);
    }
    
    
    
    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

}
