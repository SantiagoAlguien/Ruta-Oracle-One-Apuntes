public class TestFuncionario {

    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setNombre("Diego ");
        diego.setDocumento("98098");
        diego.setSalario("1000");

        System.out.println(diego.getNombre()+" "+diego.getDocumento()+" "+diego.getSalario());
    }    

}
