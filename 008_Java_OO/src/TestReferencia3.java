public class TestReferencia3 {
    
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta();
        Cliente cliente = new Cliente(); //solucion
        // cuentaDeDiego.titular.titular = "Diego"; //aqui sale el error del error por null 
        cuentaDeDiego.titular = cliente; //nos trae valor null
        System.out.println(cuentaDeDiego.titular.titular); 
    }
}
