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
public class PessoaJuridica extends Pessoa{

    private String cnpj;
    
    
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
    public String treinar(String resposta) {

        if(resposta == "sim"){
            return "somos uma academia!";
        }else{
           return "não somos uma academia!";
        }
    }
    
    
    
    
}
