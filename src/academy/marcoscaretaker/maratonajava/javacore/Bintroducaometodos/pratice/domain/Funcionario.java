package academy.marcoscaretaker.maratonajava.javacore.Bintroducaometodos.pratice.domain;

public class Funcionario {
    private String name;
    private int age;
    private double[] salarios = new double[0];
    private int quantidadeSalarios = 0;
    private double media;

    public void imprimirDadosFuncionario() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (temSalario()) {
            int i = 1;
            for (double salario : salarios) {
                System.out.println("Salário " + i++ + " R$" + salario);
            }

        } else {
            System.out.println("Funcionario sem salário informado.");
        }
    }

    public int getQuantidadeSalarios() {
        return this.salarios.length;
    }

    public boolean temSalario() {
        int quantidade = this.getQuantidadeSalarios();
        if (quantidade >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionarSalario(double... salarioAdd) {
        int indice = 0;
        if (getQuantidadeSalarios() >= 1) {
            indice = getQuantidadeSalarios();
            for (double salario : salarioAdd) {
                this.salarios[++indice] = salario;
            }
        } else {
            for (double salario : salarioAdd) {
                this.salarios[indice] = salario;
                indice++;
            }
        }

    }

    public void imprimirMediaSalarios() {

        for (double salario : this.salarios) {
            media += salario;
        }
        double mediaSalarios = media / this.salarios.length;
        System.out.println("Média salarial: " + mediaSalarios);
    }

    public void imprimirUltimoSalario() {

        if (this.getQuantidadeSalarios() == 0 || !this.temSalario()) {
            System.out.println("Por favor introduza valor para salário do funcionario.");
        } else {
            double ultimoSalario = this.salarios[this.salarios.length - 1];
            System.out.println("Ultimo salario:R$" + ultimoSalario);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getMedia(){
        return this.media;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    private void setQuantidadeSalarios(int quantidadeSalarios) {
        this.quantidadeSalarios = quantidadeSalarios;
    }
}
