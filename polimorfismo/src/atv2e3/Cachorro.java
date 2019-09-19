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
public class Cachorro extends Animal{
    
    private String pedigree;
    
    @Override
    public void ruido(){
        System.out.println("Au Au Au!");
    }

    /**
     * @return the pedigree
     */
    public String getPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }
    
    
}
