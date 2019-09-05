/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 *
 * @author felip
 */
public class Principal {

    public static void main(String[] args) {
        Bicicleta bct1 = new Bicicleta();
        Moto mt1 = new Moto();
        Carro cr1 = new Carro();
        Cliente clt1 = new Cliente();
        Funcionario func1 = new Funcionario();
        Dono dn1 = new Dono();

        System.out.println("----------Bicicleta--------------");

        bct1.setCor("branca");
        bct1.setFabricante("DNZ");
        bct1.setGarupa("espuma revestida por couro");
        bct1.setModelo("BMX");
        bct1.setProprietario("Marcos");

        System.out.println(bct1.getCor() + "\n" + bct1.getFabricante() + "\n" + bct1.getGarupa() + "\n" + bct1.getModelo() + "\n" + bct1.getProprietario());
        System.out.println("----------Moto--------------");

        mt1.setCor("vermelha");
        mt1.setFabricante("honda");
        mt1.setManeta("preto com detalhes vermelhos");
        mt1.setModelo("biz");
        mt1.setProprietario("Maria");

        System.out.println(mt1.getCor() + "\n" + mt1.getFabricante() + "\n" + mt1.getManeta() + "\n" + mt1.getModelo() + "\n" + mt1.getProprietario());
        System.out.println("----------Carro--------------");

        cr1.setCor("vermelho");
        cr1.setFabricante("ferrari");
        cr1.setModelo("ferrari");
        cr1.setProprietario("Felipe");
        cr1.setVolante("couro puro");

        System.out.println(cr1.getCor() + "\n" + cr1.getFabricante() + "\n" + cr1.getModelo() + "\n" + cr1.getProprietario() + "\n" + cr1.getVolante());
        System.out.println("----------Cliente--------------");

        clt1.setCpf("234324235324");
        clt1.setIdade(22);
        clt1.setLimiteDeCompra("290.000,00R$");
        clt1.setNome("Amauri");
        clt1.setReligiao("evangelico");

        System.out.println(clt1.getCpf() + "\n" + clt1.getLimiteDeCompra() + "\n" + clt1.getNome() + "\n" + clt1.getIdade() + "\n" + clt1.getReligiao());
        System.out.println("----------Funcionario--------------");

        func1.setCpf("23534234563");
        func1.setIdade(33);
        func1.setNome("Amanda");
        func1.setReligiao("catolico");
        func1.setSalario("6.000,00R$");

        System.out.println(func1.getCpf() + "\n" + func1.getSalario() + "\n" + func1.getNome() + "\n" + func1.getIdade() + "\n" + func1.getReligiao());
        System.out.println("----------Dono--------------");

        dn1.setCpf("342345234523235");
        dn1.setIdade(49);
        dn1.setNome("Muller");
        dn1.setNumTrabalhadores(12);
        dn1.setReligiao("Ateu");

        System.out.println(dn1.getCpf() + "\n" + dn1.getNumTrabalhadores() + "\n" + dn1.getNome() + "\n" + dn1.getIdade() + "\n" + dn1.getReligiao());

    }
}
