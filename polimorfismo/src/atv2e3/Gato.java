/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2e3;

/**
 *
 * @author felip
 */
public class Gato extends Animal{
    
    private boolean orelhaDobrada;
    
    @Override
    public void ruido(){
        System.out.println("Miau Miau Miau!");
    }

    /**
     * @return the orelhaDobrada
     */
    public boolean isOrelhaDobrada() {
        return orelhaDobrada;
    }

    /**
     * @param orelhaDobrada the orelhaDobrada to set
     */
    public void setOrelhaDobrada(boolean orelhaDobrada) {
        this.orelhaDobrada = orelhaDobrada;
    }
    
    
}
