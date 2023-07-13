public class TestCuenta {

    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente(1, 1);
        CuentaAhorros c2 = new CuentaAhorros(2, 3);

        c1.depositar(2000);
        c1.trasferencia(1000, c2);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }

}
