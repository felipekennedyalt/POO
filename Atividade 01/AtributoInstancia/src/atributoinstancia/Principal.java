package atributoinstancia;

public class Principal {

    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();

        car1.marca = "Tesla";
        car1.placa = "I302TFD";

        car2.cor = "azul";
        car2.velocidadeMax = "320 km/h";

        System.out.println(car1.marca + "\n" + car1.placa + "\n" + car2.cor + "\n" + car2.velocidadeMax);

        System.out.println("----------------------------------------------------------------------------------------------");

        Casa cas1 = new Casa();
        Casa cas2 = new Casa();

        cas1.numComodos = "8";
        cas1.cor = "branca";

        cas2.tamanho = "600m³";
        cas2.valor = "600.000 R$";

        System.out.println(cas1.numComodos + "\n" + cas1.cor + "\n" + cas2.tamanho + "\n" + cas2.valor);

        System.out.println("----------------------------------------------------------------------------------------------");

        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();

        func1.nome = "Marcos Almeida";
        func1.idade = 29;

        func2.salario = "20.000 R$";
        func2.funcao = "Engenheiro Civil";

        System.out.println(func1.nome + "\n" + func1.idade + "\n" + func2.salario + "\n" + func2.funcao);

        System.out.println("----------------------------------------------------------------------------------------------");

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Mauro";
        p1.cpf = "12345678912";

        p2.religiao = "Catolico";
        p2.trabalha = true;

        System.out.println(p1.nome + "\n" + p1.cpf + "\n" + p2.religiao + "\n" + p2.trabalha);

    }

}
