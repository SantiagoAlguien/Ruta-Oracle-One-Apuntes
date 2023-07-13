
public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero); // lo que hacemos el llamar el constructor de la clase padre que son agencia y
                                // numero

    }

    @Override
    public boolean retirar(double valor) {
        double ValorRetirar = valor + 0.2; // combrar comision mas el valor trasferido
        return super.retirar(ValorRetirar);
    }

}
