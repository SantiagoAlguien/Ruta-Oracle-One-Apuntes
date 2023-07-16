public class Contador extends Funcionario {

    @Override //override dice que estamos sobreescribiendo el metodo de la clase padre
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE CONTADOR");
        return 200;
    }
    
}
