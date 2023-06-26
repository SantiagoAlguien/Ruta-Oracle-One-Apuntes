public class Pedroescribióelsiguientemétodo {
    
    // asumiendo que este método está dentro de la clase Cuenta que tiene los atributos
public boolean sacar(double valor) {

    int saldo = 1;

    if(saldo >= valor) {
        saldo -= valor;
        return true;
    } else {
        return false;
    }
    }

}
