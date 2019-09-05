/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

/**
 *
 * @author felip
 */
public class Principal {

    public static void main(String[] args) {
        Aluno aln1 = new Aluno();
        Professor prf1 = new Professor();
        Computador comp1 = new Computador();
        Roteador rt1 = new Roteador();

        System.out.println("----------Aluno--------------");

        aln1.setCpf("12312321341234");
        aln1.setDependente("Carlos Abreu");
        aln1.setIdade(19);
        aln1.setMatricula("12315648561");
        aln1.setMensalidade("600,00R$");
        aln1.setNome("Mauricio Abreu");

        System.out.println(aln1.getCpf() + "\n" + aln1.getDependente() + "\n" + aln1.getMatricula() + "\n" + aln1.getMensalidade() + "\n" + aln1.getNome() + "\n" + aln1.getIdade());
        System.out.println("----------Professor--------------");

        prf1.setCpf("23452345234");
        prf1.setHorario("7:00 AM até 10:00 PM");
        prf1.setIdade(31);
        prf1.setNome("Leonardo");
        prf1.setSalario("10.000,00R$");
        prf1.setSupervisor("Diener");

        System.out.println(prf1.getCpf() + "\n" + prf1.getHorario() + "\n" + prf1.getNome() + "\n" + prf1.getSalario() + "\n" + prf1.getSupervisor() + "\n" + aln1.getIdade());
        System.out.println("----------Computador--------------");

        comp1.setFabricante("Rocketz");
        comp1.setFuncao("Conectar os aluno ao mundo virtual e ajuda-los a aprender");
        comp1.setGarantia("12 meses");
        comp1.setMarca("raven");
        comp1.setPeso("8 kg");
        comp1.setPreco("1.200,00 R$");

        System.out.println(comp1.getFabricante() + "\n" + comp1.getFuncao() + "\n" + comp1.getGarantia() + "\n" + comp1.getMarca() + "\n" + comp1.getPeso() + "\n" + comp1.getPreco());
        System.out.println("----------Roteador--------------");

        rt1.setAlcance("100 m");
        rt1.setFrequencia("2.4 ghz");
        rt1.setFuncao("conectar dispositivos movei e desktops a internet");
        rt1.setMarca("TP Link");
        rt1.setModelo("Archer C50");
        rt1.setPeso("500 g");

        System.out.println(rt1.getAlcance() + "\n" + rt1.getFrequencia() + "\n" + rt1.getFuncao() + "\n" + rt1.getMarca() + "\n" + rt1.getModelo() + "\n" + rt1.getPeso());

    }
}
