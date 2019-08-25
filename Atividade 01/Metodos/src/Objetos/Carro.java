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
public class Carro {
    public String marca;
    public String placa;
    public String cor;
    public String velocidadeMax;
    public String preco;
    
      public void ligar() {
        System.out.println("Esta ligando...");
    }

    public void desligar() {
        System.out.println("Esta desligando...");
    }

    public static void acelerar() {
        System.out.println("Esta acelerando...");
    }

    public static void parar() {
        System.out.println("Esta parando...");
    }
}
