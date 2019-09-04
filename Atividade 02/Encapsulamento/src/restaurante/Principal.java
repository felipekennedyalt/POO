/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author felip
 */
public class Principal {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Comida com1 = new Comida();
        Mesa m1 = new Mesa();
        Predio pre1 = new Predio();
        Talheres t1 = new Talheres();

        System.out.println("----------Cliente--------------");

        c1.setCpf("112324478912");
        c1.setIdade(29);
        c1.setNome("bruno");
        c1.setReligiao("Catolico");

        System.out.println(c1.getCpf() + "\n" + c1.getNome() + "\n" + c1.getReligiao() + "\n" + c1.getIdade());
        System.out.println("----------Comida--------------");

        com1.setNome("ovo frito");
        com1.setCozinheiro("Marcos");
        com1.setIngredientes("Ovo, sal, e manteiga");
        com1.setValor("8,00 R$");

        System.out.println(com1.getNome() + "\n" + com1.getCozinheiro() + "\n" + com1.getIngredientes() + "\n" + com1.getValor());
        System.out.println("----------Mesa--------------");

        m1.setMaterialUsado("pau brasil");
        m1.setConstrutor("pedro alvares colombo");
        m1.setDiametro("1 metro");
        m1.setValor("200,00 R$");

        System.out.println(m1.getMaterialUsado() + "\n" + m1.getConstrutor() + "\n" + m1.getDiametro() + "\n" + m1.getValor());
        System.out.println("----------Predio--------------");

        pre1.setEndereco("Rua aqula");
        pre1.setHoraDeAbrir("7:00 AM");
        pre1.setHoraDeFechar("10:00 PM");
        pre1.setPropietario("Romulo");

        System.out.println(pre1.getEndereco() + "\n" + pre1.getHoraDeAbrir() + "\n" + pre1.getHoraDeFechar() + "\n" + pre1.getPropietario());
        System.out.println("----------Talheres--------------");

        t1.setAlloy("titanio e aluminio");
        t1.setCor("prata");
        t1.setFerreiro("Lucas");
        t1.setTamanho("10 cm");

        System.out.println(t1.getAlloy() + "\n" + t1.getCor() + "\n" + t1.getFerreiro() + "\n" + t1.getTamanho());

    }
}
