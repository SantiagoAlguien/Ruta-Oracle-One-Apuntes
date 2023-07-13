public class Cliente {
    private String nombre;
    private String documento;
    private String profecion;


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
}