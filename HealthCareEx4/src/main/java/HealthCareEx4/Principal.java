package HealthCareEx4;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Lucas", 70, 1.75);
        Paciente paciente2 = new Paciente("Fernando", 40, 1.75);
        Paciente paciente3 = new Paciente("João", 100, 1.80);

        System.out.println("O diagnóstico do pac. " + paciente1.getNome() + " é " + paciente1.diagnostico() + " com IMC de " + paciente1.calcularIMC());
        System.out.println("O diagnóstico do pac. " + paciente2.getNome() + " é " + paciente2.diagnostico() + " com IMC de " + paciente2.calcularIMC());
        System.out.println("O diagnóstico do pac. " + paciente3.getNome() + " é " + paciente3.diagnostico() + " com IMC de " + paciente3.calcularIMC());
    }
}