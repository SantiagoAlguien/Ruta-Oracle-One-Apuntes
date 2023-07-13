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

Las herencias los que nos ayudan es crear clases que tienen atributos muy parecidos pero con distinto nombre esto nos ayuda recortar codigo y no repetirlo como se puede ver de ejemplo crearemos una clase gerente que tendra esos atributos.

![img](GerenteEJEMPLO.png)

como se puede ver estamos creando una clase repetida de funcionario pero con el nombre de gerente entonces para obtimizar el codigo mejot en vez de crear una clase gerente con los mismo atributos de funcionario crearemos una herencia de funcionario para crear un gerente.

Entonces agregaremos un nuevo atributo en la clase funcionario que va ser tipo si es 0 es funcionario si es 1 es gerente

    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

Despues le hacemos sus getters y setters a tipo y hacemos la herencia en el metodo getbonificacion especificando lo siguiente 

    public double getBonificacion(){ //Esto identifica que tipo de funcionario es que recibe la bonificacion
        // si tipo es = 1 es un gerente
        // si tipo es = 0 es un funcionario
        if (tipo == 1) {
            return this.salario;
        }else if(tipo == 0){
            return this.salario * 0.1;
        } else{
            return 0;
        }
    }

Esto seria un ejemplo de herencia

## Comenzando con la herencia

Ahora intentaremos meternos mas al tema de herencia en donde crearemos herencias especifias de una clase algo importante del codigo es que el codigo se adapte a tu entorno no tu al codigo para esto tomaremos las clases que creamos 

![img](Comaparacion.png)

como se puede ver esas 2 clases tienen en comun que tiene los mismos atributos esto siginifiaca que som un trabajador del banco para decir esto en java se usa la palabra reservada de "extends" esto se aplica de la siguiente forma 

    public class Gerente extends Funcionario { //Estamos diciendo que la clase gerente es una extencion de funcionario con extends
    
    }

con esto la clase gerente tiene tidos los atributos de funcionario es una herencia porque decimos que gerente es un funcionario asi seria la comparacion que a gerente se le pueden agregar metodos que funcionario no tiene

![img](image%2040.png)

Asi se veria la comparacion del diagrama de las clases

![img](Diagrama%20de%20clase.png)

Seguimos en la clase gerente y agregamos un nuevo atributo de clave con su setters validando seguido de un metodo de inicio de iniciarSesion que valida si la clave es correcta regresa true sino es false 

    public class Gerente extends Funcionario {
 
    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "12345";
    }

    }

Asi quedaria el codigo de test gerente [ejemplo](/009_Java_Polimorfismo/bytebank-heredado/src/TestGerente.java) validando el inicio de sesion 

## Metodo super

Es una palabra reservada para decir que llama metodos de la clase pabre o clase suporior y es asi 

    //Sobre-escritura de metodo 
    public double getbonificacion(){
        return super.getSalario(); //metodo de la clase superior llamado
    };

# This y super

![img](This%20y%20super.png)

# Sobre-escritura de metodos

la sobre escritura es cuando usas la misma firma de un metodo pero lo estas repitiendo en otra clase este consecto tambien se pueden usar en otros lenguajes de programacion para desmotrar un ejemplo seria asi:

    public double getbonificacion(){
        return super.getSalario()+ super.getbonificacion(); // se esta sobre escribiendo sobre el metodo getbonificacion() que es de la clase madre si esta es camniada se vera reflejada en la sobre escritura 
    };

Vimos que la sobreescritura es un concepto importante de la herencia, porque permite redefinir un comportamiento previsto en la clase madre a través de la clase hija. 

##  el orden correcto de los modificadores de visibilidad, de menor a mayor visibilidad

private < protected < public

**Modificadores de acceso**

Los modificadores de acceso o accesibilidad son algunas palabras claves utilizadas en el lenguaje Java para definir el nivel de accesibilidad que los elementos de una clase (atributos y métodos) e incluso la propia clase puede tener los mismos elementos de otra clase.

***Public***

Este es el modificador menos restrictivo de todos. De esta manera, cualquier componente puede acceder a los miembros de la clase, las clases y las interfaces.

***Protected***

Al usar este modificador de acceso, los miembros de la clase y las clases son accesibles para otros elementos siempre que estén dentro del mismo package o, si pertenecen a otros packages, siempre que tengan una relación extendida (herencia), es decir, las clases secundarias pueden acceder a los miembros de su clase principal (o clase de abuelos, etc.).

***Private***

Este es el modificador de acceso más restrictivo de todos. Solo se puede acceder a los miembros definidos como privados desde dentro de la clase y desde ningún otro lugar, independientemente del paquete o la herencia.

## Introducción a polimorfismo

Vamos a pronfundar en el concepto de herencia que tiene 2 pilares que son la reutilizacion del codigo, junto al polimorfismo, en java todo se basa en referencias de las clases y metodos En el mundo orientado a objetos, el polimorfismo permite que Las referencias de tipos de clases más genéricos referencian objetos más específicos.

La aplicacion del polimorfismo es que nos permite crear una unica puerta de entrada para todos los elementos de una clase padre

EJEMPLO DE POLIMERFISMO

[TestControlBonificaciones](/009_Java_Polimorfismo/bytebank-heredado/src/TestControlBonificaciones.java)

lo que hacemos el copiar y pegar 2 clases de objecto cuenta y cliente que estos los vamos a implimenter en el bytebank-heredado luego de eso vamos a crear una nueva clase llamada "CuentaCorriente" de esta forma la escribimos

    public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int agencia, int numero) {
        super(agencia,numero); //lo que hacemos el llamar el constructor de la clase padre que son agencia y numero
        }
    }

lo que hacemos en el constructor de la clase es settiar los parametros del constructor padre.

