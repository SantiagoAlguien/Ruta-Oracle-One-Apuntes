//entidad cuenta:
class Cuenta {

    public double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    // No retorna valor
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

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
        this.agencia = agencia;
    }

}