
package Principal;

import Objetos.Cachorro;
import Objetos.Carro;
import Objetos.Pessoa;

public class Principal {

    public static void main(String[] args) {
        Cachorro cac = new Cachorro();
        Carro car = new Carro();
        Pessoa p = new Pessoa();
        
        System.out.println(cac.comer());
        System.out.println(cac.latir());
        Cachorro.correr();
        Cachorro.dormir();
        System.out.println("----------------------------------------------------");
        
        car.ligar();
        car.desligar();
        Carro.acelerar();
        Carro.parar();
        System.out.println("----------------------------------------------------");
        
        p.comer();
        p.falar();
        Pessoa.correr();
        Pessoa.dormir();
    }
}
