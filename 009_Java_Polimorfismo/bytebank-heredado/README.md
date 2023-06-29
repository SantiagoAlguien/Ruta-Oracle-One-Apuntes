# Java Polimorfismo: Entendiendo herencia e interfaces

## Introduccion 

En este curso se veran lo que son la herancias entre los objetos tambien como utilizar el polimerfismo en un objecto como base para crear otros objetos de diferente tipo y utilizar interfaces en el codigo.

## Revisión del proyecto Byte Bank

Resiramemos el proyecto del bytebank en el resto del curso descargando el proyecto de git 

# Nuevo proyecto 

En este nuevo proyecto de bytebank vamos a crear un nuevo proyecto  llamado bytebank-heredado que este vamos crear una clase de funcionario el cual va a tener sus gettetrs y setters con un constructor sin parametro 

    public class Funcionario {

    private String nombre;
    private String documento;
    private String salario;

    public Funcionario(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    }

## Herencia 

