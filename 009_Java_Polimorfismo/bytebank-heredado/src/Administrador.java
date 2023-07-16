public class Administrador extends Funcionario implements Autenticable {


    private AutenticacionUtil util;

    public Administrador() {
        this.util = new AutenticacionUtil();
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public boolean inicalizarSeccion(String contraseña) {
        return this.util.inicalizarSeccion(contraseña);
    }

    @Override 
    public void setContraseña(String contraseña) {
        this.setContraseña(contraseña);
    }
}