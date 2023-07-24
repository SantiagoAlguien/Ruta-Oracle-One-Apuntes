package bytebank;

public class TextCuentaExceptionSaldo {
    public static void main(String[] args){
        Cuenta cuenta = new CuentaAhorros(212, 100);
        cuenta.deposita(210);
        try {
            cuenta.saca(200);
            cuenta.saca(19);
        } catch (SaldoInsuficienyrException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}