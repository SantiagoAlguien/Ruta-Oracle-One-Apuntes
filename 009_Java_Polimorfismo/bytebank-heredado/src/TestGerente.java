public class TestGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNombre("Marco");
        g1.setDocumento("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNombre());
        System.out.println(g1.getDocumento());
        System.out.println(g1.getSalario());

        g1.setContraseña("2222");
        

        

        System.out.println(g1.getBonificacion());
    }


}
