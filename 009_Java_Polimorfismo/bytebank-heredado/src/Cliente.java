public class Cliente implements Autenticable {
    private String nombre;
    private String documento;
    private String profecion;

    private AutenticacionUtil util;

    public Cliente(){
        this.util = new AutenticacionUtil();
    }

    // Getter
    public String getnombre() {
        return this.nombre;
    }

    public String getdocumento() {
        return this.documento;
    }

    public String getprofecion() {
        return this.profecion;
    }

    //Setter
    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void setdocumento(String documento){
        this.documento = documento;
    }

    public void setprofecion(String profecion){
        this.profecion = profecion;
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