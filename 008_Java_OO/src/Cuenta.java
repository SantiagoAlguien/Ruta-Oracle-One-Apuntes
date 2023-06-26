//entidad cuenta:
class Cuenta {

    double saldo; 
    int agencia;
    int numero;
    String titular;
    
    //No retorna valor 
    public void depositar (double valor){
        saldo = saldo + valor;
    }

    //Retornar valor 
    public boolean retirar(double valor) {
        if(this.saldo >= saldo){
            this.saldo = this.saldo - valor;
            return true;
        } else{
            return false;
        }
        
    }

    public boolean trasferencia(double valor, Cuenta cuenta){
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true; 
        }else{
            return false;
        }
    }
}