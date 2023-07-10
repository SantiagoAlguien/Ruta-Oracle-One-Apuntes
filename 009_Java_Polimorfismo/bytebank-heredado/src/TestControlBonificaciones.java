public class TestControlBonificaciones {
    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        Contador alex = new Contador();
        alex.setSalario(5000);

        ControlBonificaciones controlBonificaciones = new ControlBonificaciones();
        controlBonificaciones.RegistrarSalario(diego);
        controlBonificaciones.RegistrarSalario(jimena);
        controlBonificaciones.RegistrarSalario(alex);

    }
}
