public class SistemaInterno extends Gerente {
    
    private String clave = "Alura";

    public boolean autenticar(Autenticable gerente) {
        boolean puedeIniciarSeccion = gerente.inicalizarSeccion(clave);
        
            if (puedeIniciarSeccion) {
                System.out.println("Login exitoso");
                return true;
            } else {
                System.out.println("Error en login ");
                return false;
            }
        
    }

}