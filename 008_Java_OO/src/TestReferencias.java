public class TestReferencias {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 300;

        System.out.println("saldo de primera cuenta : " + primeraCuenta.saldo);

        Cuenta segundaCuenta = primeraCuenta;

        Cuenta terceraCuenta = segundaCuenta;
        System.out.println("saldo de segunda Cuenta: " + segundaCuenta.saldo);

        terceraCuenta.saldo=1000;
        segundaCuenta.saldo += 100;
        System.out.println("saldo de segunda Cuenta " + segundaCuenta.saldo);

        System.out.println("saldo de tercera Cuenta " + terceraCuenta.saldo);

        System.out.println(primeraCuenta.saldo);

        if(terceraCuenta == segundaCuenta ) {
            System.out.println("Es la misma cuenta");
        }else{
            System.out.println("Es diferente");
        }

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
        System.out.println(terceraCuenta);
    }
    
}
