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
public class Principal {

    public static void main(String[] args) {
        Atendente at1 = new Atendente();
        Cliente c1 = new Cliente();
        Fornecedor f1 = new Fornecedor();
        Predio pre1 = new Predio();
        Produto pro1 = new Produto();

        System.out.println("----------Atendente--------------");

        at1.setCpf("12345678978");
        at1.setIdade(20);
        at1.setNome("Lucia");
        at1.setReligiao("Catolico");

        System.out.println(at1.getCpf() + "\n" + at1.getNome() + "\n" + at1.getReligiao() + "\n" + at1.getIdade());
        System.out.println("----------Cliente--------------");

        c1.setCpf("74565532145");
        c1.setIdade(23);
        c1.setNome("Mauro");
        c1.setReligiao("Catolico");

        System.out.println(c1.getCpf() + "\n" + c1.getNome() + "\n" + c1.getReligiao() + "\n" + c1.getIdade());
        System.out.println("----------Fornecedor--------------");

        f1.setCnpj("1231544614");
        f1.setFundacao("1996");
        f1.setNome("Fornecendo LTDA");
        f1.setNumeroDeSupermercadosFornecendo(20);

        System.out.println(f1.getCnpj() + "\n" + f1.getFundacao() + "\n" + f1.getNome() + "\n" + f1.getNumeroDeSupermercadosFornecendo());
        System.out.println("----------Predio--------------");

        pre1.setEndereco("Rua aquina");
        pre1.setHoraDeAbrir("6:00 AM");
        pre1.setHoraDeFechar("12:00 PM");
        pre1.setPropietario("Amaurir");

        System.out.println(pre1.getEndereco() + "\n" + pre1.getHoraDeAbrir() + "\n" + pre1.getHoraDeFechar() + "\n" + pre1.getPropietario());
        System.out.println("----------Produto--------------");

        pro1.setNome("coca cola");
        pro1.setDataDeValidade("20/01/2020");
        pro1.setProdutor("coca cola");
        pro1.setValor("5,00 R$");

        System.out.println(pro1.getNome() + "\n" + pro1.getDataDeValidade() + "\n" + pro1.getProdutor() + "\n" + pro1.getValor());

    }
}
