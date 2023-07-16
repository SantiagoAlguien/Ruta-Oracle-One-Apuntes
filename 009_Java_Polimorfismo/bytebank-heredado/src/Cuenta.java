//entidad cuenta:
public abstract class Cuenta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    private static int total;

    // *public Cuenta(){} //rompe las reglas de negocio porque para crear una cuenta
    // nesecita una agencia y un numero

    public Cuenta(){ //las clases asbtractas pueden ser tener un constructor

    }


    public Cuenta(int agencia, int numero) { // Este metodo nos retorna el objecto cuenta lo que nos permite manipular
                                             // el objceto antes de su nacimiento esto se le llama constructor//
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta");

        Cuenta.total ++;
    }

    // No retorna valor
    public abstract void depositar(double valor);

    // Retornar valor
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = -valor;
            return true;
        }
        return false;
    }

    public boolean trasferencia(double valor, Cuenta cuenta) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    // Getter
    public double getSaldo() {
        return this.saldo;
    }

    public int getnumero() {
        return this.numero;
    }

    public int getagencia() {
        return this.agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    // Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setagencia(int agencia) {

        if (agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println("No estan permitidos numeros en 0");
        }

    }

}