/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import construcao.Casa;
import construcao.Muro;
import construcao.Predio;
import funcionario.Atendente;
import funcionario.Garcom;
import funcionario.Gerente;
import pessoa.Aluno;
import pessoa.PessoaFisica;
import pessoa.PessoaJuridica;

/**
 *
 * @author LABORATORIO 01
 */
public class Principal {
    
    public static void main(String[] a){
        
        Aluno aluno1 = new Aluno();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        Gerente gerente1 = new Gerente();
        Garcom gar = new Garcom();
        Atendente att = new Atendente();
        Predio predio1 = new Predio();
        Casa casa1 = new Casa();
        Muro muro1 = new Muro();
        
        aluno1.comprar(1000, 800);
        aluno1.treinar(true);
        
        pf.comprar(8000, 3000);
        pf.treinar(true);
        
        pj.comprar(90000, 80000);
        pj.treinar(false);
        
        gerente1.sairDoTrabalho("noite");
        gerente1.trabalhar(true);
        
        gar.sairDoTrabalho("tarde");
        gar.trabalhar(true);
        
        att.sairDoTrabalho("tarde");
        att.trabalhar(true);
        
        predio1.construir(true);
        predio1.renovar(false);
        
        casa1.construir(false);
        casa1.renovar(true);
        
        muro1.construir(true);
        muro1.renovar(false);
        
        
        
        
        
    }
}
