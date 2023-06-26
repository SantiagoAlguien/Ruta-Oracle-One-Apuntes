public class PruebasMetodos {
    public static void main(String[] args) {
        Cuenta Cuentayo = new Cuenta(); //Instacia de la clase que hace referencia a cuenta
        Cuentayo.saldo = 300; //en este caso incrementa el saldo 
        Cuentayo.depositar(200); //y asi se llama al metodo depositar en la cuenta debe estar en minuscula
        System.out.println(Cuentayo.saldo);

        Cuentayo.retirar(100); //Este es un metodo con retorno de valor para retirar el saldo 
        System.out.println(Cuentayo.saldo);

        Cuenta cuentaJimena = new Cuenta();
        cuentaJimena.depositar(1000); //y asi se llama al metodo depositar en la cuenta debe estar en minuscula
        cuentaJimena.trasferencia(400, Cuentayo);

        System.out.println(Cuentayo.saldo);
        System.out.println(cuentaJimena.saldo);
        System.out.println(Cuentayo.saldo);
    }
}