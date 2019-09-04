/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author felip
 */
public class Produto {
    String nome;
    String produtor;
    String dataDeValidade;
    String valor;

    /**
     * @return the nome
     */
    String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the produtor
     */
    String getProdutor() {
        return produtor;
    }

    /**
     * @param produtor the produtor to set
     */
    void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    /**
     * @return the dataDeValidade
     */
    String getDataDeValidade() {
        return dataDeValidade;
    }

    /**
     * @param dataDeValidade the dataDeValidade to set
     */
    void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    /**
     * @return the valor
     */
    String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    void setValor(String valor) {
        this.valor = valor;
    }
    
}
