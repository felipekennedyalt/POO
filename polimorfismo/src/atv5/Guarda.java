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
public class Guarda extends Funcionario {

    private boolean armado;

    @Override
    public void descontoINSS(double inss) {

        double desconto = inss / 10;
        System.out.println("Seu desconto é: " + desconto);
    }

    /**
     * @return the armado
     */
    public boolean isArmado() {
        return armado;
    }

    /**
     * @param armado the armado to set
     */
    public void setArmado(boolean armado) {
        this.armado = armado;
    }

   

}
