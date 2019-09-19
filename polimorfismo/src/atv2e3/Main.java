/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2e3;

/**
 *
 * @author felip
 */
public class Main {
    
    public static void fazerBarulho(Animal animal){
        animal.ruido();
    }
    
    public static void main(String[] args) {
        Papagaio p1 = new Papagaio();
        Gato g1 = new Gato();
        Cachorro c1 = new Cachorro();
        
        fazerBarulho(p1);
        fazerBarulho(c1);
        fazerBarulho(g1);
        
    }
}
