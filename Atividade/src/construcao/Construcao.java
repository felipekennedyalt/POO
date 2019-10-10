/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construcao;

/**
 *
 * @author LABORATORIO 01
 */
public abstract class Construcao {
    
    private String endereco;
    
    public abstract boolean construir(boolean respostaCon);
    
    public abstract boolean renovar(boolean respostaRen);

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}
