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
public class Cachorro {

    public String nome;
    public int idade;

    public String comer() {
        return "Esta comendo...";
    }

    public String latir() {
        return "Esta latindo...";
    }

    public static void dormir() {
        System.out.println("Esta dormindo...");
    }

    public static void correr() {
        System.out.println("Esta correndo...");
    }

}
