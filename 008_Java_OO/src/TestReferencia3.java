public class TestReferencia3 {
    
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta();
        // cuentaDeDiego.titular.titular = "Diego"; //aqui sale el error del error por null 
        cuentaDeDiego.getTitular(); //nos trae valor null
        System.out.println(cuentaDeDiego.getTitular()); 
    }
}
