public interface Autenticable { //interfas que no puede contener metodos solo el cuerpo

    public abstract void setContraseña(String contraseña);

    public abstract boolean inicalizarSeccion(String contraseña);

}