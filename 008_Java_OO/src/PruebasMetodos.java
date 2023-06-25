public class PruebasMetodos {
    public static void main(String[] args) {
        Cuenta Cuentayo = new Cuenta(); //Instacia de la clase que hace referencia a cuenta

        Cuentayo.saldo = 1000; //en este caso incrementa el saldo 

        Cuentayo.depositar(2000); //y asi se llama al metodo depositar en la cuenta debe estar en minuscula
        System.out.println(Cuentayo.saldo);

        Cuentayo.retirar(1000); //Este es un metodo con retorno de valor 
        System.out.println(Cuentayo.saldo);

        Cuenta cuentaJime = new Cuenta();
        cuentaJime.depositar(1000);
        cuentaJime.trasferencia(600, Cuentayo);

        System.out.println(cuentaJime.saldo);
        System.out.println(Cuentayo.saldo);
    }
}