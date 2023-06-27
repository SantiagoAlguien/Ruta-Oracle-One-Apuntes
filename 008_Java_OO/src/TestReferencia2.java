public class TestReferencia2 {
    
    public static void main(String[] args) {
        Cliente Diego = new Cliente();

        Diego.titular = "Diego";
        Diego.telefono = "342432432";
        Diego.documento = "5435353";


        Cuenta cuentaDiego = new Cuenta();
        cuentaDiego.agencia = 1;
        cuentaDiego.titular = Diego;

        System.out.println(cuentaDiego.titular.documento);
        System.out.println(cuentaDiego.titular);
        System.out.println(Diego);
    }

}
