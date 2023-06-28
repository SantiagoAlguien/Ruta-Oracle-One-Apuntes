public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta cuenta =  new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setnombre("santiago");
        cliente.setdocumento("e3213");
        cliente.setprofecion("estudiante");

        cuenta.depositar(321332.32);

        System.out.println(cliente.getnombre());
        System.out.println(cliente.getdocumento());
        System.out.println(cuenta.getSaldo());
    }
}