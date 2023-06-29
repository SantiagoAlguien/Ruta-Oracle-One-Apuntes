//entidad cuenta:
class Cuenta {

    public double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    private static int total = 0;

    public Cuenta(){
        
    }

    public Cuenta(int agencia) { //Este metodo nos retorna el objecto cuenta lo que nos permite manipular el objceto antes de su nacimiento esto se le llama constructor//
        //System.out.println("Aqui se crea una cuenta");
        
        if(agencia<= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        }else{
            this.agencia = agencia;
        }
        total++;

        System.out.println("Se va creando: " + total + " cuentas");
    }

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
        
        if(agencia > 0){
            this.agencia = agencia;
        }else{
            System.out.println("No estan permitidos numeros en 0");
        }
        
    }

}