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
public abstract class Pessoa {
    
    private String nome;
    private String contato1;
    private String contato2;

    public abstract double comprar(double saldo, double compra);

    public abstract boolean treinar(boolean resposta);
    
    
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the contato1
     */
    public String getContato1() {
        return contato1;
    }

    /**
     * @param contato1 the contato1 to set
     */
    public void setContato1(String contato1) {
        this.contato1 = contato1;
    }

    /**
     * @return the contato2
     */
    public String getContato2() {
        return contato2;
    }

    /**
     * @param contato2 the contato2 to set
     */
    public void setContato2(String contato2) {
        this.contato2 = contato2;
    }
    
    
    
}

