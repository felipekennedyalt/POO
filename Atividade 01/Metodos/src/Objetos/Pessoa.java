/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author felip
 */
public class Pessoa {

    public String nome;
    public int idade;
    public String cpf;
    public String religiao;
    public boolean trabalha;

     public void comer() {
        System.out.println("Esta comendo...");
    }

    public void falar() {
        System.out.println("Esta falando...");
    }

    public static void dormir() {
        System.out.println("Esta dormindo...");
    }

    public static void correr() {
        System.out.println("Esta correndo...");
    }
}
