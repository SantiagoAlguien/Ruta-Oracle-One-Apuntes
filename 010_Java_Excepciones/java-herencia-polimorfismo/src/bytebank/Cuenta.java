package bytebank;

public abstract class Cuenta {

    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    public Cuenta() {

    }

    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienyrException {
        if (this.saldo < valor){
            throw new SaldoInsuficienyrException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }
    

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            try {
                this.saca(valor);
            } catch (SaldoInsuficienyrException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

}
