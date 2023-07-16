public class AutenticacionUtil { //Esta clase sirve para ahorrar codigo
    private String contraseña;
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public boolean inicalizarSeccion(String contraseña) {
        return this.contraseña == contraseña;
    }
}
