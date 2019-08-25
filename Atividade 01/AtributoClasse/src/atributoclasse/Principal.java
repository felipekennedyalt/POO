package atributoclasse;

public class Principal {

    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();

        car1.legalizado = true;
        car1.temPlaca = true;

        car2.semiAutonomo = true;
        car2.nunerodeRodas = 4;

        System.out.println(car1.legalizado + "\n" + car1.temPlaca + "\n" + car2.semiAutonomo + "\n" + car2.nunerodeRodas
                + "\n" + car2.legalizado + "\n" + car2.temPlaca + "\n" + car1.semiAutonomo + "\n" + car1.nunerodeRodas);

        System.out.println("----------------------------------------------------------------------------------------------");

        Casa cas1 = new Casa();
        Casa cas2 = new Casa();

        cas1.porta = true;
        cas1.terreo = true;

        cas2.telhado = true;
        cas2.parede = true;

        System.out.println(cas1.porta + "\n" + cas1.terreo + "\n" + cas2.telhado + "\n" + cas2.parede
                + "\n" + cas2.porta + "\n" + cas2.terreo + "\n" + cas1.telhado + "\n" + cas1.parede);

        System.out.println("----------------------------------------------------------------------------------------------");

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();

        func1.assistênciaMedica = true;
        func1.valeAlimentacao = true;

        func2.planoOdontologico = true;
        func2.bolsasDeEstudo = true;

        System.out.println(func1.assistênciaMedica + "\n" + func1.valeAlimentacao + "\n" + func2.planoOdontologico + "\n" + func2.bolsasDeEstudo
                + "\n" + func2.assistênciaMedica + "\n" + func2.valeAlimentacao + "\n" + func1.planoOdontologico + "\n" + func1.bolsasDeEstudo);

        System.out.println("----------------------------------------------------------------------------------------------");

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nacionalidade = "Brasileiro";
        p1.email = true;

        p2.mestrado = true;
        p2.phd = true;

        System.out.println(p1.nacionalidade + "\n" + p1.email + "\n" + p2.mestrado + "\n" + p2.phd
                + "\n" + p2.nacionalidade + "\n" + p2.email + "\n" + p1.mestrado + "\n" + p1.phd);

    }

}
