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
public class Papagaio extends Animal {

    private String corDasPenas;

    @Override
    public void ruido() {
        System.out.println("Have faith in the Lord Fifth, gain Eternal Life! "
                + "When the Lord Fifth appears, who dares to cause strife!");

    }

    /**
     * @return the corDasPenas
     */
    public String getCorDasPenas() {
        return corDasPenas;
    }

    /**
     * @param corDasPenas the corDasPenas to set
     */
    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }
    
}
