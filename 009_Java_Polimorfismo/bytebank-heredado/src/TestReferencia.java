public class TestReferencia {

    public static void main(String[] args) {

        // Elemento mas generico puede ser adaptado al metodo mas especifico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");

        Gerente gerente = new Gerente(); // Gerente tiene atributos de funcionario
        gerente.setNombre("Marco");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        gerente.autenticar(321321);
    }

}