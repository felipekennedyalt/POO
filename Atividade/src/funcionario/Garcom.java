/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;

/**
 *
 * @author LABORATORIO 01
 */
public class Garcom extends Funcionario{
    
    
     @Override
    public boolean trabalhar(boolean resposta) {
      return resposta == true;
    }

    @Override
    public String sairDoTrabalho(String periodo) {
        if(periodo == "tarde"){
            return "Saindo do restaurante à tarde.";
        }else {
            return "ainda não sai.";
        }
    }
}
