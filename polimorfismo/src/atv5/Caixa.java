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
public class Caixa extends Funcionario{
    
    private boolean uniforme;

    
    @Override
    public void descontoINSS(double inss) {
       
        double desconto = inss / 24;
        System.out.println("Seu desconto é: " + desconto);
    }

    /**
     * @return the uniforme
     */
    public boolean isUniforme() {
        return uniforme;
    }

    /**
     * @param uniforme the uniforme to set
     */
    public void setUniforme(boolean uniforme) {
        this.uniforme = uniforme;
    }
   
    
    

    
    
    
}
