# Java OO: Entendiendo la Orientación a Objetos

## Temas del cusro 
- Domine el paradigma de programación más usado en el mercado.
- Entienda lo que son referencias y objetos
- Use atributos, métodos de la instancia y de la clase
- Aprenda a definir objetos a través de constructores
- Aprenda sobre encapsulamiento
<br>
## Introducin
En este curso se trabaja la orientacion a objectos en donde entederemos el conceptos de librerias y que son los objectos en Java la idea central del paradigma de Orientación de objetos es de que Los datos y la funcionalidad de una entidad van de la mano.
<br>

## Definicion de un objecto

Un objecto es la representacion del conjunto de atributos que compone alguna entidad o cosa de la vida que se intenta plasmar en la programacion. para hacer esto en el curso se hara un proyecto el cual es la creacion de un banco que este va a tener objectos en donde definiremos las caracteristicas que va tener la cuenta 

![img](Objecto.png)

## Crear una clase

Primero debemos crear una clase con la palabra reservada de Clas la cual va ser la entidad que va guardar los valores de cuenta como se puede ver el ejemplo:

    //entidad cuenta:
    class Cuenta {

        double saldo; 
        int agencia;
        int numero;
        String titular;
    }   

Para crear una instancia, es obligatorio completar los valores de todos los atributos.

## Instancias

Una instacia es la representacion de un objecto siendo en si un objecto en particular que tiene su propia informacion y es unica, para creacion de una instacia se hace de la siguiente forma:

    public static void main(String[] args) { 
        Cuenta primeraCuenta =  new Cuenta(); //Antes de llamar a la cuenta toca especificar que tipo de variable es en este caso la variable es de tipo cuenta
        primeraCuenta.saldo = 1000; //llamamos el objecto y con el . determinamos el capo que va trabajar y le asignamos un saldo de 1000
        System.out.println(primeraCuenta.saldo); //para ver que si se guardo escribomos el objecto junto al campo
    }

    new //Es una palabra reservada lo que hace es decir crea esto nuevo en este caso la instacia Cuenta con ()