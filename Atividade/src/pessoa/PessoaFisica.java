/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author LABORATORIO 01
 */
public class PessoaFisica extends Pessoa{

    private String cpf;
    
    
    
    @Override
    public double comprar(double saldo, double compra) {
        if(compra < saldo){
            System.out.println("Compra realizada com sucesso!");
            return compra - saldo;
        }else{
            System.out.println("compra recusada!");
            return saldo;
        }
    }

    @Override
    public boolean treinar(boolean resposta) {

        if(resposta == true){
            return true;
        }else{
           return false;
        }
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    
}
