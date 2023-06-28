public class TestReferencia2 {
    
    public static void main(String[] args) {
        Cliente Diego = new Cliente();

        Diego.setnombre("Diego");
        Diego.setdocumento("342432432");
        Diego.setprofecion("profesor");


        Cuenta cuentaDiego = new Cuenta();
        cuentaDiego.setagencia(3213);;
        cuentaDiego.setNumero(43242);;

        System.out.println(cuentaDiego.getagencia());
        System.out.println(cuentaDiego.getnumero());
        System.out.println(Diego);
    }

}
