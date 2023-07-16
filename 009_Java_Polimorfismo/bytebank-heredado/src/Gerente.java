//                  Extiende de 
public class Gerente extends Funcionario implements Autenticable {

    //Sobre escritura de metodo
    private String contraseña;

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public boolean inicalizarSeccion(String contraseña) {
        return this.contraseña == contraseña;
    }

}