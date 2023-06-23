public class EjemploValoresVariable {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 2;
    
        System.out.println(numero2);
        
        numero2 = numero1;//5
        System.out.println(numero2);

        numero1 = 88;
        // numero 2 ???
        System.out.println(numero2);

        String saludo = "Hola, mi nombre es ";
        String nombre = "Rómulo ";
        String continuacion = "y mi edad es ";
        int edad = 100;
        System.out.println (saludo + nombre + continuacion + edad);

        

            char letra = 'a';
            System.out.println(letra);
    
            char valor = 65;                    // Compila!
            System.out.println(valor);
    
            valor = (char) (valor + 1);         // Compila!
            System.out.println(valor);
    
            String palabra = "Alura cursos online de tecnología";
            System.out.println(palabra);
    
            palabra = palabra + 2020;
            System.out.println(palabra);
            
    }    
    
}
