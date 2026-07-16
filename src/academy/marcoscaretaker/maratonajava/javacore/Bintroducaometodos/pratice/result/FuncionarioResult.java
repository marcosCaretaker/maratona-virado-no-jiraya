package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.pratice.result;

import academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.pratice.domain.Funcionario;

public class FuncionarioResult {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Hélio");
        funcionario.setAge(43);
        funcionario.setSalarios(new double[]{2500,2400,3200});

        funcionario.imprimirDadosFuncionario();
        System.out.println("Salarios guardados: "+funcionario.getQuantidadeSalarios());
        funcionario.imprimirMediaSalarios();
        funcionario.imprimirUltimoSalario();
        System.out.println("Funcionario tem salario guardado?"+funcionario.temSalario());
        System.out.println(funcionario.getMedia());

    }
}
