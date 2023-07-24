# Java Excepciones: Aprenda a crear, lanzar y controlar excepciones

## Introduccion

En el curso se veran lo que es el manejo de errores porque siempre ocurren errores en el codigo para manejar esto en curso manejaremos lo que son las excepciones de resultados esperados y inesperados.

Se tomara el proyecto de la clase anterior de proyecto de [bytebank](./java-herencia-polimorfismo/src/bytebank)

## Pila de ejecucion 

Pila de ejecución podemos hacer referencia que es el lugar en la memoria, digamos donde tienen lugar todos los eventos que Java va ejecutando

-[Pila de ejecucion ejemplo](./Java-pila-ejecucion/src/Flujo.java)

-[Documentacion](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Exception.html)

## Pila de ejecucion-Grafico

Para entender mejor como funciona la pila de ejecucion del codigo se muestra asi la funcionalidad, la pila son un conjunto de cosas apiladas

![img](Piladeejecucion.png)

como se observa la ejecucion va en una pila donde empieza primero el main que llama a la funcion de metodo1 que a su vez llama a metodo 2 y cuando termanan estas funciones inprime fin de main

Para enterder mejor toma la pila como una pila de platos que primero debes liberar lo de arriba para liberar lo de abajo

![img](tiempopila.png)

asi se visualizaria como se estaria funcionando las pila de los metodo que primero debe liberar lo de arriba para mover lo de abajo.

## Debug

El debug es la ejecucion del sistema y cuando encuentra un breakpoint este va a parar esto lo haremos en Vs Code 

se hace cuando se selecciona la opcion debug en nuestro codigo y marcamos el breakpoint para visualizar el recorrido del codigo 

# Tratamiento de excepciones 

## Erorres

un error en codigo es un suceso que impide que este complete su ejecucion, los errores en java se caracterizan por nombres que se pueden buscar para solucionar este error 

## Exepciones

El manejo de exepciones nos ayua a gestiomar los errores en el codigo no exite el codigo perfecto para detectar exepciones toca leer bien el mensaje del error detectando sus partes 

### Controlando errores

En el codigo colocamos un error aproposito en la funcion de metodo2 que generara un error en el codigo

![img](Controlando%20errores.png)

para dectectar este error y hacer que el codigo compile usaremos 2 palabras reservadas de Java que son para atrapar el error 

    try{ // lo que hace es intentar hacer el error 

    } catch(){ //catch atrapa el error //en los () se especifica que error va a atrapar
    //en las {} insertamos que queremos que ejecute puede ser un print del error 
    }

asi quedaria el codigo con la implementacion de la expecion ojo que no puede existir un try sin un cath y visebersa

    public static void metodo2(){
    System.out.println("Inicio metodo2");
    for(int i =1; i<= 5; i++){
      System.out.println(i);
      try { //El try 
        int num = 0;
        int resultado = i/num;
        System.out.println(resultado);
      } catch (ArithmeticException exception) { //catch //en el cath se pueden espeficar varios errores que se pueden capturar con | y controlar varias expeciones 
        System.out.println(exception);       
      }
    }
    System.out.println("Fin metodo2");
  }


*** Muestra grafica ***

Lo que hace el try es capturar el error y dejar que codigo compile normal

![img](capturaerror.png)

Toda excepción en Java tiene un nombre que la idenfica. Este enfoque hace que sea más fácil de entender que usar números mágicos (códigos de error) como 15, 7012 o 16.


## Uso del throw

En Java, throw es una palabra clave que se utiliza para lanzar una excepción explícitamente en un bloque de código. Cuando se ejecuta la instrucción throw, se produce una interrupción en el flujo normal del programa y se pasa el control al bloque de código que maneja esa excepción (ya sea en el mismo método o en un método superior en la pila de llamadas).

La sintaxis básica de throw es la siguiente:

  throw excepcion;

## Estrucutura de las excepciones 

Las excepciones se van extendiendo entre distintos niveles de gerarquia como si fueran clases o bueno son objecto 

diagrama de niveles 

![img](Jerarquia.png)

como ejemplo creamos una excepcion propia que extiende de una objecto de expecion 

[Ejemplo](./Java-pila-ejecucion/src/MiException.java)

En Java en el JVM Existen 2 tipos de errores las excepciones y los errores de sistasis o estructura de codigo

## throws

Se usa para lanzar expeciones en metodos que estas 100 por 100 que va a salir una expecion a diferencia de try catch que dice que puede salir 

  private static void metodo1() throws MiException {
    System.out.println("Inicio de metodo1");
      metodo2();
    System.out.println("Fin de metodo1");
  }

## Entendiendo las excepciones 

1) Existe una gran jerarquía de clases que representan excepciones. Por ejemplo, ArithmeticException es hija de RuntimeException, que hereda de Exception, que a su vez es hija de la clase de excepciones más ancestral, Throwable. Conocer bien esta jerarquía significa saber cómo usar las excepciones en su aplicación.

2) Throwable es la clase que necesita ser extendida para poder lanzar un objeto en la pila (usando la palabra reservada throw)

3) StackOverflowError es un error de la máquina virtual para informar que la pila de ejecución no tiene más memoria.

4) Las excepciones se dividen en dos grandes categorías: las que el compilador comprueba obligatoriamente y las que no. Los primeros se denominan checked y se crean al pertenecer a una jerarquía que no pasa por RuntimeException. Los segundos son unchecked y se crean como descendientes de RuntimeException.

*** Tip ***

La herencia y polimorfismo se pueden aplicar a las excepciones como si estuviaremos llamando a un objecto pabre para aplicar una excepcion en especifico.