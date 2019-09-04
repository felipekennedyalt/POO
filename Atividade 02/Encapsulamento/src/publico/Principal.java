/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publico;

/**
 *
 * @author felip
 */
public class Principal {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Casa casa1 = new Casa();
        Celular cel1 = new Celular();
        Funcionario fun1 = new Funcionario();
        Pessoa p1 = new Pessoa();

        System.out.println("---------Carro-------------");

        carro1.setCor("branco");
        carro1.setMarca("tesla");
        carro1.setPreco("150.000,00 R$");
        carro1.setVelocidadeMax("250 km/h");

        System.out.println(carro1.getCor() + "\n" + carro1.getMarca() + "\n" + carro1.getPreco() + "\n" + carro1.getVelocidadeMax());
        System.out.println("----------Casa---------------");

        casa1.setCor("azul");
        casa1.setEndereco("Rua Giberish");
        casa1.setTamanho("800 m³");
        casa1.setValor("800.000,00 R$");

        System.out.println(casa1.getCor() + "\n" + casa1.getEndereco() + "\n" + casa1.getTamanho() + "\n" + casa1.getValor());
        System.out.println("----------Celular--------------");

        cel1.setCor("vermelho");
        cel1.setMarca("OnePlus");
        cel1.setModelo("OnePlus A6000");
        cel1.setPreco("2.300,00 R$");

        System.out.println(cel1.getCor() + "\n" + cel1.getMarca() + "\n" + cel1.getModelo() + "\n" + cel1.getPreco());
        System.out.println("----------Funcionário--------------");

        fun1.setEmpresa("fvs");
        fun1.setFuncao("professor");
        fun1.setIdade(29);
        fun1.setSalario("15.000,00 R$");

        System.out.println(fun1.getEmpresa() + "\n" + fun1.getFuncao() + "\n" + fun1.getIdade() + "\n" + fun1.getSalario());
        System.out.println("----------Pessoa--------------");

        p1.setCpf("112324478912");
        p1.setIdade(29);
        p1.setNome("bruno");
        p1.setReligiao("catolico");

        System.out.println(p1.getCpf() + "\n" + p1.getNome() + "\n" + p1.getReligiao()+ "\n" + p1.getIdade());
    }
}
