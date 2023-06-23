# Java JRE y JDK: compile y ejecute su primer programa

### ¿Que es Java?
    Quizás algunas de las características de Java que en este caso pues es un lenguaje orientado a objetos, es un lenguaje  fácil de entender, es multiplataforma, quizás algunos otros lenguajes de programación ya tienen este feature o estos     features, pero la ventaja de Java no es el lenguaje en sí. La principal ventaja de Java es la plataforma.

    La plataforma Java básicamente sería la máquina virtual de Java que es lo principal, los distintos frameworks que   tenemos, las distintas librerías de la comunidad open source totalmente gratuitas que tenemos para el uso y la facilidad  para implementar todo ello.

### Principales caracteristicas de Java
    Entre las principales características que tenemos de la plataforma Java es portable, porque puede ser cargada en    cualquier dispositivo, es fácil de implementar, es segura y es omnipresente. Algunos ejemplos que tenemos para describir   mejor estas características son: encontramos Java en servidores, la máquina virtual de Java está presente en servidores   de bancos, empresas grandes, enormes, justo por las características que tiene. Está presente en dispositivos móviles,     teléfonos, tablets, hay una infinidad de dispositivos que corren Java, disponible también en computadores como el mío   actualmente, como el de ustedes también. Hoy en día ya básicamente es imposible tener un computador sin Java porque de    hecho muchas de las aplicaciones actuales necesitan la máquina virtual de Java para ejecutarse.

### ¿Cuál es el mayor beneficio de la máquina virtual de Java (JVM)?
    R: El mayor beneficio de Java es que es multiplataforma

### Versiones de Java
![img](./Versiones%20de%20Java.png)

    Para entender un poco cómo es que funciona el ecosistema de Java. Tenemos la máquina virtual de Java, la Java Virtual   Machine, pero no es lo único que necesitamos para escribir código de Java.De hecho tenemos otros features, como las   librerías escritas en Java que nos van a dar diversas funcionalidades, y este conjunto nos va a dar el JRE, que es el     Java Runtime Environment. El Java Runtime Envrionment es la Java Virtual Machine con el conjunto de librerías nos van a     permitir ejecutar código Java en nuestra máquina.

![img](JDK.png)

### Estructura de compilado de Java
    class Programa {
    public static void main(String[] args){
        System.out.println("¿Puedes ayudar a Ana?");
    }
}

    Class= Es la palabra reservada de java para iniciar codigo
    public= Es la entrada de ejecutar codigo
    static= es el estado en el que esta 
    void =
    String[] args=

###  Como compilar y ejecutar codigo
    primero se crea un archivo .java que debe contener en su interior una class del programa que se escribe asi:

    class Programa {
    public static void main(String[] args) {
        System.out.println("Funcionooo!!!");
    }
    }

despues de que tengamos el programa hecho guardamos y ejecutamos el nombre del programa .java con javac

*javac Programa.java*

despues se nos creara un archivo javac Y para llamar a la JVM usamos solo el nombre de la clase (sin extensión)

*java Programa*

### Date cuenta de que podemos usar operadores aritméticos:
    + para Sumar
    - para Restar
    * para Multiplicación
    / para División
    

### Tipos de variables en Java
    
    int Ejemplo = 28; //int es una palabra reservada de Java para guardar numeros de tipo entero como se ve
    Las varibales deben estar inicializadas sino Java no nos dejara copilar Tambien para llamar una variable solo se nesececita el nombre de la misma para ser llamada

    double Ejemplo = 24.32 //double guarda caracteres no decimameles 

    long Ejemplo = 12222L //Es un tipo de variable que guarda una cantidad grande caracteres de 1 al 64 bits y termina con una L

    short Ejemplo = 1 // Es un tipo de variable que guarda datos pequeños

    byte Ejemplo = 0.1 // Metodo para guardar numeros mas pequeños

    float Ejemplo = 1F // numero decimal pequeño este al final tiene una f

    char Ejemplo = 'a' // Es un tipo de dato unico que guarda caracteres en '' tambien puede guardar numeros

    String Ejemplo = "Hola" //es tipo de variable que guarda cualquier dato y es una palabra reservada

### Convesorsiones 

    Para convertir el dato de una variable a otra se tiene que hacer un Cast 
    
    class Programa {
        public static void main(String[] args) {
            double variable1 = 230.3232;
            int variableEntero = (int) variable1; En este momento se hace el cast osea la conversion 
            System.out.println("Funcionooo!!!");
    }
    }

### Test If

    